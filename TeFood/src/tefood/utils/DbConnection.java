/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tefood.utils;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author longg
 */
public class DbConnection {
    public static Connection getConnection() {
        try {
          return DriverManager.getConnection("jdbc:sqlserv//localhost:1433;databaseName=TeFood;encrypt=true;trustservercertificate=true", "sa", "123");
        } catch(SQLException e) {
          System.out.print(e);
        }
        return null;
    }
}
