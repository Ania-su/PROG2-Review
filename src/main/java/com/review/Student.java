package com.review;

import lombok.Getter;

import java.time.LocalDate;

@Getter

public class Student extends User{

    private String group;
    private Tutor tutor;
    public Student(int ID, String firstname, String lastname, LocalDate birthday, String email, String number, String group, Tutor tutor) {
        super(ID, firstname, lastname, birthday, email, number);
        this.group = group;
        this.tutor = tutor;
    }
}
