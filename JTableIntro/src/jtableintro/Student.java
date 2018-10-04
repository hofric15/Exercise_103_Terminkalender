/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtableintro;

import java.awt.Color;
import java.time.LocalDate;

/**
 *
 * @author Richard Hofmeister
 */
public class Student {
    private LocalDate birthday;
    private String firstname;
    private String lastname;
    private Color hairColor;

    public Student(LocalDate birthday, String firstname, String lastname, Color hairColor) {
        this.birthday = birthday;
        this.firstname = firstname;
        this.lastname = lastname;
        this.hairColor = hairColor;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getFirstname() {
        return firstname;
    }

    public Color getHairColor() {
        return hairColor;
    }

    public String getLastname() {
        return lastname;
    }
    
    
}