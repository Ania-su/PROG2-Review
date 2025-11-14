package com.review;

import lombok.Getter;
import java.util.Date;

@Getter

public class Teacher extends User{

    private String spaciality;
    public Teacher(int ID, String firstname, String lastname, Date birthday, String email, int number, String spaciality) {
        super(ID, firstname, lastname, birthday, email, number);
        this.spaciality = spaciality;
    }
}
