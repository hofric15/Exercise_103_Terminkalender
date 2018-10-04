/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Terminkalender;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Richard Hofmeister
 */
public class Appointment implements Comparable<Appointment>, Serializable{
    private LocalDateTime ldt;
    private String text;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy - HH.mm");

    public Appointment(LocalDateTime ldt, String text) {
        this.ldt = ldt;
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("%s --> %s", ldt.format(dtf), text);
    }

    public void setLdt(LocalDateTime ldt) {
        this.ldt = ldt;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    } 

    public LocalDateTime getLdt() {
        return ldt;
    }
    
    @Override
    public int compareTo(Appointment p) {
        int res = this.ldt.compareTo(p.ldt);
        if(res == 0)
        {
            return this.ldt.compareTo(p.ldt);
        }
        return res;
    }
}
