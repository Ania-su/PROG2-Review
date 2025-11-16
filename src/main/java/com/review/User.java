package com.review;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter

public class User {
    private int ID;
    private String firstname;
    private String lastname;
    private LocalDate birthday;
    private String email;
    private String number;
}
