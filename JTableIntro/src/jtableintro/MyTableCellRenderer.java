/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtableintro;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Richard Hofmeister
 */
public class MyTableCellRenderer implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Student s = (Student) value;
        JLabel label = new JLabel();
        label.setOpaque(true);
        label.setBackground(s.getHairColor());
        label.setForeground(Color.white);
        
        switch(column)
        {
            case 0: label.setText(s.getFirstname()); break;
            case 1: label.setText(s.getLastname()); break;
            case 2: label.setText(s.getBirthday().toString()); break;
            case 3: label.setText(""); break;
        }
        
        return label;
    }
    
}
