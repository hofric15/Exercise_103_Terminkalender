/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Terminkalender;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
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
        sort();
        this.fireIntervalAdded(this, li.size()-1, li.size()-1);   
    }
    
    public void remove(int index)
    {
        Appointment a = li.get(index);
        li.remove(a);
        sort();
        this.fireIntervalAdded(this, li.size()-1, li.size()-1);
    }
    
    public void save(File f) throws Exception
    {
        OutputStream fos = null;
        
        fos = new FileOutputStream(f);
        ObjectOutputStream o = new ObjectOutputStream(fos);
        for (Appointment s : li) {
            o.writeObject(s);
        }
        
        o.flush();
        o.close();
    }
    
    public void load(File f) throws Exception
    {
        InputStream fis = null;
        
        fis = new FileInputStream(f);
        ObjectInputStream o = new ObjectInputStream(fis);
        try {
            Object s;
            while ((s = o.readObject()) != null) {
                li.add((Appointment) s);
            }
        } catch (EOFException eOFException) {
            //this catch is only to determine end of file
        }
        
        o.close();
    }
    
    public void sort()
    {
        Collections.sort(li);
        this.fireContentsChanged(this, 0, li.size()-1);
    }
    
    public void change(Appointment apt, Appointment aptReturned)
    {
        apt.setLdt(aptReturned.getLdt());
        apt.setText(aptReturned.getText());
        sort();
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
