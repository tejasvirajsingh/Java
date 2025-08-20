package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class myconnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test"; 
        String username = "root";                         
        String password = "root";                         

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("✅ Connection established successfully!");
            con.close();
        } catch (SQLException e) {
            System.out.println("❌ Connection failed!");
            e.printStackTrace();
        }
    }
}