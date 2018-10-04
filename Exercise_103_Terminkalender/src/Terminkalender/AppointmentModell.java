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

    public void add(Appointment a)
    {     
        li.add(a);
        this.fireIntervalAdded(this, li.size()-1, li.size()-1);
    }
    
    public void remove(int index)
    {
        Appointment a = li.get(index);
        li.remove(a);
        this.fireIntervalAdded(this, li.size()-1, li.size()-1);
    }
    
    public void change(Appointment apt, Appointment aptReturned)
    {
        apt.setLdt(aptReturned.getLdt());
        apt.setText(aptReturned.getText());
        this.fireIntervalAdded(this, li.size()-1, li.size()-1);
    }
    
    @Override
    public int getSize() {
        return li.size();
    }

    @Override
    public Object getElementAt(int index) {
        return li.get(index);
    }
    
}
