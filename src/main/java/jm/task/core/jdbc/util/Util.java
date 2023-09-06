package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private final static String DB_DRIVER ="com.mysql.jdbc.Driver";
    private final static String DB_USERNAME ="bestuser";
    private final static String DB_PASSWORD ="bestuser";
    private final static String DB_URL ="jdbc:mysql:// 127.0.0.1:3306/mydatabase";

    public static Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME,DB_PASSWORD);
            System.out.println("Connection OK");
        }catch (ClassNotFoundException  | SQLException e){
            e.printStackTrace();
        }
        return connection;
    }
}