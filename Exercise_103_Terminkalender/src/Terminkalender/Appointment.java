/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Terminkalender;

import java.time.LocalDateTime;

/**
 *
 * @author Richard Hofmeister
 */
public class Appointment {
    private LocalDateTime ldt;
    private String text;

    public Appointment(LocalDateTime ldt, String text) {
        this.ldt = ldt;
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("%s --> %s", ldt.toString(), text);
    }
    
    
}
