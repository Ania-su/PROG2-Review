package com.review;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter

public class Exam {
    private int examId;
    private String examName;
    private Course course;
    private LocalDateTime examDate;
    private int coefficient;
}
