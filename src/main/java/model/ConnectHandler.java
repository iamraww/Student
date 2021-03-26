package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectHandler {

    private static Connection connection;
    public static Connection getConnection(){
        try {
            if (connection == null || connection.isClosed()){
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/t2009a", "root", "");
                System.out.println("Connect success");
            } else {
                System.out.println("Connected");
            }
        } catch (SQLException throwables) {
            System.err.println("Disconect");
        }
        return connection;
    }
}
