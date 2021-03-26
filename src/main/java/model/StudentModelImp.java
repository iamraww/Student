package model;

import connection.StudentConection;
import entity.Student;

import java.sql.*;
import java.util.ArrayList;

public class StudentModelImp implements StudentModel{

    @Override
    public boolean save (Student student) {
        try {
            Statement stt = ConnectHandler.getConnection().createStatement();
//            connect.connection();
            String up = String.format("insert into student (id, name, email, status) values ('%d','%s', '%s', '%d')",
                   student.getId(), student.getName(), student.getEmail(), student.getStatus());
            stt.execute(up);
            System.out.println("Add success student : "+student.getName());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            System.out.println("Error");
        }
        return false;
    }

    @Override
    public boolean update(int id, Student student) {
        try {
            Statement stt = ConnectHandler.getConnection().createStatement();
            String up = String.format("update student set `name`='%s' , `email`='%s', `status`='%d' where `id`='%d'",
                    student.getName(), student.getEmail(), student.getStatus(), id);
            stt.execute(up);
            System.out.println("Update success id : "+id);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            System.out.println("Error");
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        try {
            Statement stt = ConnectHandler.getConnection().createStatement();
            String up = String.format("delete from student where `id`='%d'",id);
            stt.execute(up);
            System.out.println("Delete success id : "+id);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            System.out.println("Error");
        }
        return false;
    }

    @Override
    public Student findById(int id) {
        try {
            Statement stt = ConnectHandler.getConnection().createStatement();
//            String up = String.format("select * from student where `id`='%d'",id);
            ResultSet resultSet = stt.executeQuery("select * from student where `id` like '%" + id + "%'");
            System.out.println("Connect Success");
            System.out.printf("\n%-15s|%-30s| %-30s| %-30s\n", "Id","Name", "Email", "Status");
            while (resultSet.next()){
                int status = resultSet.getInt("status");
                System.out.printf("\n%-15d|%-30s| %-30s| %-30s\n",resultSet.getInt("id")
                        ,resultSet.getString("name"),resultSet.getString("email")
                        ,(status == 1 ? "Online" : "Offline"));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error");
        }
        return null;
    }

    @Override
    public ArrayList<Student> findAll() {
        try {
            Statement stt = ConnectHandler.getConnection().createStatement();
            String up = String.format("select * from student");
            ResultSet resultSet = stt.executeQuery(up);
            System.out.println("Connect Success");
            System.out.printf("\n%-15s|%-30s| %-30s| %-30s\n", "Id","Name", "Email", "Status");
            while (resultSet.next()){
                int status = resultSet.getInt("status");
                System.out.printf("\n%-15d|%-30s| %-30s| %-30s\n",resultSet.getInt("id"),resultSet.getString("name")
                        ,resultSet.getString("email"),(status == 1 ? "Online" : "Offline"));
//                System.out.println("Name : " +resultSet.getString("name"));
//                System.out.println("Email : " +resultSet.getString("email"));
//                System.out.println("Status : " + (status == 1 ? "Online" : "Offline"));
//                System.out.println("----------------------------------");
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            System.out.println("Error");
        }
        return null;
    }
}
