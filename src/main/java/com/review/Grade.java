package com.review;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter

public class Grade {
    private Student student;
    private Exam exam;
    private Course course;
    private double initialGrade;
    private List<GradeHistory> history = new ArrayList<>();

    public void addChange(double newGrade, String reason) {
        history.add(new GradeHistory(Instant.now(), newGrade, reason));
    }

    public double getGradeAt(Instant t) {
        double grade = initialGrade;

        for (GradeHistory history : history) {
            if (history.getTimestamp().isBefore(t) || history.getTimestamp().equals(t)) {
                grade = history.getNewGrade();
            }
        }
        return grade;
    }
}
