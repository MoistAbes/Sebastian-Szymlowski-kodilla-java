package com.kodilla.jdbc;

import javax.swing.plaf.PanelUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public enum DbManager {

    INSTANCE;

    private Connection connection;

    DbManager(){
        Properties connectionProps = new Properties();
        connectionProps.put("user", "kodilla_user2");
        connectionProps.put("password", "kodilla_Pass123");
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/kodilla_course" +
                            "?serverTimezone=Europe/Warsaw" +
                            "&useSSL=False" +
                            "&allowPublicKeyRetrieval=true",                                  // [10]
                            connectionProps);
        }catch (SQLException e){
            throw new ExceptionInInitializerError(e);
        }
    }

    public static DbManager getInstance(){
        return INSTANCE;
    }

    public Connection getConnection(){
        return connection;
    }

}
