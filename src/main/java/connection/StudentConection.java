package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentConection {
    public void connection(){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/t2009a"
                    , "root", "");
            Statement stt = connection.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
