package com.review;

import lombok.Getter;
import java.util.Date;

@Getter

public class Student extends User{

    private String group;
    private Tutor tutor;
    public Student(int ID, String firstname, String lastname, Date birthday, String email, int number, String group, Tutor turor) {
        super(ID, firstname, lastname, birthday, email, number);
        this.group = group;
        this.tutor = tutor;
    }
}
