/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Merve
 */
public class DBkatmani {
    private Connection conn;
    String dburl="jdbc:derby://localhost:1527/Need";
    String user="ari";
    String password="need";
    public Connection Connect(){
        try{
        Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
        System.out.println("Connection is successful.");
        conn=DriverManager.getConnection(dburl,user,password);
        
        }
        catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){
            System.out.println("Connection failed.");
        }
        return conn;
            
    }
public void userList(){
    if(conn==null)
        {
            System.out.println("The database is not connected,connecting...");
            Connect();
        }
    try{
        Statement stmt=conn.createStatement();
        ResultSet rs= stmt.executeQuery("select * from UserInformation");
        System.out.println("Name \t Surname \t Birtyhday \t email \t username \t password \t country \t city \t district \t");
        while(rs.next()){
            System.out.println(""+rs.getString(1)+ " \t" +rs.getString(2)+"");
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }
}
public static void main(String arg[]){
        DBkatmani dbka=new DBkatmani();
        dbka.userList();
    }
}
