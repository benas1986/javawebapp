package com.kcs.students.app.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Lina on 2017.06.16.
 */
public class JdbcUtils {
    private static final String URL = "jdbc:mysql://localhost:3306/kcs";
    private static final String NAME = "root";
    private static final String PASS = "";

    public static Connection getConnection(){
        Connection connection =null;
        try {
            connection = DriverManager.getConnection(URL, NAME, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    return connection;
    }
}
