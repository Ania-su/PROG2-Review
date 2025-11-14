package com.review;

import lombok.Getter;
import java.util.Date;

@Getter

public class Tutor extends User{

    private String description;
    public Tutor(int ID, String firstname, String lastname, Date birthday, String email, int number, String description) {
        super(ID, firstname, lastname, birthday, email, number);
        this.description = description;
    }
}
