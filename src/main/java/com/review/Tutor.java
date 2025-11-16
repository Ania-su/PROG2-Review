package com.review;

import lombok.Getter;

import java.time.LocalDate;
import java.util.Date;

@Getter

public class Tutor extends User{

    private String description;
    public Tutor(int ID, String firstname, String lastname, LocalDate birthday, String email, String number, String description) {
        super(ID, firstname, lastname, birthday, email, number);
        this.description = description;
    }
}
