package com.review;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;

@NoArgsConstructor
@Getter

public class GradeHistory {
    private Instant timestamp;
    private double newGrade;
    private String reason;

    public GradeHistory(Instant timestamp, double newGrade, String reason) {
        this.timestamp = timestamp;
        this.newGrade = newGrade;
        this.reason = reason;
    }
}

