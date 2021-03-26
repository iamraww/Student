package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MainTest {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/t2009a", "root", "");
            System.out.println("Kết nối thành công");
            Statement stt = connection.createStatement();
            String name = "aaa";
            String email = "aaa@gmail.com";
            int status = 0;
            String up = String.format("insert into Student.student (name, email, status) values ('%s', '%s', '%d')",name, email, status);
            stt.execute(up);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            System.out.println("loi");
        }
    }
}
