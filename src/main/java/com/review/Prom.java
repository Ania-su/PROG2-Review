package com.review;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Getter

public class Prom {
    private String year;
    private List<String> groups;

    public Prom(String year, List<String> groups) {
        this.year = year;
        this.groups = groups;
    }
}
