package model;

import entity.Teacher;

import java.util.ArrayList;

public interface TeacherModel {
    boolean save(Teacher teacher);
    boolean update(int id, Teacher teacher);
    boolean delete(int id);
    Teacher findById(int id);
    ArrayList<Teacher> findAll();
}
