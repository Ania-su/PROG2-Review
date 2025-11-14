package com.review;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

public class GradeManager {
    private List<Grade> grades;
    public GradeManager(List<Grade> grades) {
        this.grades = grades;
    }

    public Optional<Double> getExamGrade(Exam exam, Student student, Instant t) {
        return grades.stream()
                .filter(grade -> grade.getExam().equals(exam)
                        && grade.getStudent().equals(student))
                .findFirst()
                .map(grade -> grade.getGradeAt(t));
    }

    public double getCourseGrade(Course course, Student student, Instant t) {
        List<Grade> gradeList = grades.stream()
                .filter(grade -> grade.getExam().getCourse().equals(course)
                        && grade.getStudent().equals(student))
                .toList();

        double sum = 0;
        int totalCoefficient = 0;
        for (Grade grade : gradeList) {
            float value = (float) grade.getGradeAt(t);
            int coefficient = grade.getExam().getCoefficient();

            sum += value * coefficient;
            totalCoefficient += coefficient;
        }
        if (totalCoefficient == 0) {
            throw new IllegalArgumentException("No exam found");
        }
        return sum / totalCoefficient;
    }
}
