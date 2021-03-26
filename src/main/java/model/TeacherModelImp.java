package model;

import entity.Teacher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TeacherModelImp implements TeacherModel {
    Teacher teacher = new Teacher();

    @Override
    public boolean save(Teacher teacher) {
        try {
            Statement stt = ConnectHandler.getConnection().createStatement();
            String up = String.format("insert into teacher (id, name, email, status) values ('%d','%s', '%s', '%d')",
                    teacher.getId(), teacher.getName(), teacher.getEmail(), teacher.getStatus());
            stt.execute(up);
            System.out.println("Add success teacher : " + teacher.getName());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error");
        }
        return false;
    }

    @Override
    public boolean update(int id, Teacher teacher) {
        try {
            Statement stt = ConnectHandler.getConnection().createStatement();
            String up = String.format("update student set `name`='%s' , `email`='%s', `status`='%d' where `id`='%d'",
                    teacher.getName(), teacher.getEmail(), teacher.getStatus(), id);
            stt.execute(up);
            System.out.println("Upđate success id : " + teacher.getId());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error");
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        try {
            Statement stt = ConnectHandler.getConnection().createStatement();
            String up = String.format("delete from student where `id`='%d'", id);
            stt.execute(up);
            System.out.println("Delete success teacher : " + teacher.getName());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error");
        }
        return false;
    }

    @Override
    public Teacher findById(int id) {
        try {
            Statement stt = ConnectHandler.getConnection().createStatement();
//            String up = String.format("select * from teacher where `id` like '%d' ",id);
            ResultSet resultSet = stt.executeQuery("select * from teacher where `id` like '%" + id + "%'");
            System.out.println("Connect Success");
            System.out.printf("\n%-15s|%-30s| %-30s| %-30s\n", "Id","Name", "Email", "Status");
            while (resultSet.next()){
                int status = resultSet.getInt("status");
                System.out.printf("\n%-15d|%-30s| %-30s| %-30s\n",resultSet.getInt("id"),resultSet.getString("name")
                        ,resultSet.getString("email"),(status == 1 ? "Online" : "Offline"));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error");
        }
        return null;
    }

    @Override
    public ArrayList<Teacher> findAll() {
        try {
            Statement stt = ConnectHandler.getConnection().createStatement();
            String up = String.format("select * from teacher ");
            ResultSet resultSet = stt.executeQuery(up);
            System.out.println("Connect Success");
            System.out.printf("\n%-15s|%-30s| %-30s| %-30s\n", "Id","Name", "Email", "Status");
            while (resultSet.next()){
                int status = resultSet.getInt("status");
                System.out.printf("\n%-15d|%-30s| %-30s| %-30s\n",resultSet.getInt("id"),resultSet.getString("name")
                        ,resultSet.getString("email"),(status == 1 ? "Online" : "Offline"));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error");
        }
        return null;
    }
}
