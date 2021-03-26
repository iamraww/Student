package model;

import entity.Student;

import java.util.ArrayList;

public interface StudentModel {
    boolean save(Student student);
    boolean update(int id, Student student);
    boolean delete(int id);
    Student findById(int id);
    ArrayList<Student> findAll();

}
