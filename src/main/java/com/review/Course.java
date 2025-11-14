package com.review;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter

public class Course {
    private int ID;
    private String label;
    private String credit;
    private Teacher teacher;
}
