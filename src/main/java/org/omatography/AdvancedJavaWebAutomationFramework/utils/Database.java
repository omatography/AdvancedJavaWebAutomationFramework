package org.omatography.AdvancedJavaWebAutomationFramework.utils;

import java.sql.*;

public class Database {

    String connectionString;
    String user;
    String pass;
    Statement statement = null;
    Connection connection = null;

    public Database(String connectionString, String user, String pass) {
        this.connectionString = connectionString;
        this.user = user;
        this.pass = pass;
    }

    public void connect() throws SQLException {
        System.out.println("Connecting to Database...");
        this.connection = DriverManager.getConnection(connectionString,user,pass);
        this.statement = connection.createStatement();
    }

    public ResultSet executeQuery(String query) throws SQLException {
        return statement.executeQuery(query);
    }
}
