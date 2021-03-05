package com.example.PetsExample.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class DBConnection {
	
	private String url= "jdbc:mysql://localhost:3306/pets";
	private String userid= "springuser";
	private String password= "The Password";

    private Connection connection;
    
    public DBConnection(String dbURL, String user, String pwd) throws ClassNotFoundException, SQLException{

        Class.forName("com.mysql.cj.jdbc.Driver");
        this.connection = DriverManager.getConnection(this.url, this.userid, this.password);
    }

//    public DBConnection(String dbURL, String user, String pwd) throws ClassNotFoundException, SQLException{
//
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        this.connection = DriverManager.getConnection(dbURL, user, pwd);
//    }

    public Connection getConnection(){
        return this.connection;
    }

    public void closeConnection() throws SQLException {
        if (this.connection != null)
            this.connection.close();
    }


}
