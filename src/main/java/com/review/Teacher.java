package com.review;

import lombok.Getter;

import java.time.LocalDate;

@Getter

public class Teacher extends User{

    private String spaciality;
    public Teacher(int ID, String firstname, String lastname, LocalDate birthday, String email, String number, String spaciality) {
        super(ID, firstname, lastname, birthday, email, number);
        this.spaciality = spaciality;
    }
}
