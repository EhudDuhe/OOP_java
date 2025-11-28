package org.udbl.database;

import Dao.DBInformation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    static DBInformation dbInformation = new DBInformation();
    private static String url = dbInformation.getUrl();
    private static String user = dbInformation.getUser();
    private static String password = dbInformation.getPassword();

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }
}

