package project;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.*;
/**
 *
 * @author sandeepmunagala
 */
public class connectionProvider {
    public static Connection getConn()
    {
        try
        {
            //loader -- com.mysql.jdbc.driver.
            //register via class.forName method to the driver.
            Class.forName("com.mysql.jdbc.Driver");
            //establishing the connection using the Connection interface con object.
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project","root","Tarun@07");
            //returing the con from the function getConn from the project package
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
    
}
