/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.managerstudent.model;

import com.mycompany.managerstudent.Student;

import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 *
 * @author tranbaonguyen
 */
public class StudentList {
    private ArrayList<Student> studentList = new ArrayList<>();


    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void pushToTable(DefaultTableModel tableModel) {
        tableModel.setRowCount(0);

        for (Student student : studentList) {
            Object[] row = new Object[] {
                    student.getIdPerson(),
                    student.getName(),
                    student.getAddress(),
                    student.getPhoneNumber(),
                    student.getEmail(),
                    student.getBirthday(),
                    student.getSex(),
            };

            tableModel.addRow(row);
        }
//            tableModel.fireTableChanged();
    }


}
