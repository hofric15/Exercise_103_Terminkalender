/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtableintro;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Richard Hofmeister
 */
public class MyTableModell extends AbstractTableModel {

    private static String[] colNames = {"Firstname", "Lastname", "Birthday", "Hair Color"};
    
    private ArrayList<Student> students = new ArrayList<>();
    
    public void add(Student s)
    {
        students.add(s);
        this.fireTableRowsInserted(students.size()-1, students.size()-1);
    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }
    
    @Override
    public int getRowCount() {
        return students.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student s = students.get(rowIndex);
        return s;
//        switch(columnIndex)
//        {
//            case 0: return s.getFirstname();
//            case 1: return s.getLastname();
//            case 2: return s.getBirthday().toString();
//            case 3: return s.getHairColor().toString();
//            default: return "????";
//        }
    }
    
}
