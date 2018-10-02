/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Terminkalender;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author Richard Hofmeister
 */
public class AppointmentModell extends AbstractListModel{
    
    ArrayList<Appointment> li = new ArrayList<>();

    @Override
    public int getSize() {
        return li.size();
    }

    @Override
    public Object getElementAt(int index) {
        return li.get(index);
    }
    
}
