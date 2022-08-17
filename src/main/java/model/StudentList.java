/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import ManageStudent.Student;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tranbaonguyen
 */
public class StudentList {

    List<Student> studentList=new ArrayList<>();
    public int add(Student sv){
        studentList.add(sv);
        return 1;
    }
    public List<Student> getStudentList(){
        return studentList;
    }
    public  int deleteStudentById(String maStudent){
        for(Student sv: studentList){
            if (sv.getIdPerson().equalsIgnoreCase(maStudent)){
                studentList.remove(sv);
                return 1;
            }
        }
        return  -1;
    }
    public  Student getStudentById(String id){
        for (Student sv:studentList){
            if (sv.getIdPerson().equalsIgnoreCase(id)){
                return  sv;
            }
        }
        return  null;
    }
}

