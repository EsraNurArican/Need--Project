/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.*;

/**
 *
 * @author Merve
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.sql.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@RequestScoped

public class bean {
    String name;
    String surname;
    String birthday;
    String email;
    String userName;
    String password;
    String country;
    String city;
    String district;
    private Connection conn;
    String dburl="jdbc:derby://localhost:1527/Need";
    String user="ari";
    String pass="need";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
  public Connection Connect(){
        try{
        Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
        System.out.println("Connection is successful.");
        conn=DriverManager.getConnection(dburl,user,pass);
        
        }
        catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){
            System.out.println("Connection failed.");
        }
        return conn;
            
    }
     public String save()
    {
        System.out.println("ffs");
        PreparedStatement ps=null;
        Connection con=null;
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/Need","ari","need");
            ps=con.prepareStatement("INSERT INTO userinformation(NAME, SURNAME, BIRTHDAY, EMAIL,USERNAME,PASSWORD,COUNTRY,CITY,DISTRICT) VALUES(?,?,?,?,?,?,?,?,?)");
            
            ps.setString(1, name);
            ps.setString(2, surname);
            ps.setString(3, birthday);
            ps.setString(4, email);
            ps.setString(5, userName);
            ps.setString(6, password);
            ps.setString(7, country);
            ps.setString(8, city);
            ps.setString(9, district);

            ps.executeUpdate();  
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally 
        {
            try{
            con.close();
            ps.close();
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }
        return null;
    }
    public static void main(String arg[]) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
        bean dbka=new bean();
         dbka.Connect();
         // A lil change for testing.. ok, Now push this commit, 
        dbka.setName("evrem");
        //dbka.setPassword("dur");
      //  dbka.save();
      
        
        
      // dbka.kullaniciListesi();
      //  dbka.sifreKontrol();
        
        // System.out.println(dbka.sifreKontrol());
      
      
        
    }
    
}
