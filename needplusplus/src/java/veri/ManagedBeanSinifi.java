package veri;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Merve
 */
@ManagedBean
@RequestScoped


public class ManagedBeanSinifi {
    String name;
    String surname;
    String birthday;
    String mail;
    String user_name;
    String password;
    String country;
    String city;
    String district;



    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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

    public void setBirthday(String new_birthday) {
        this.birthday = new_birthday;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

 
    public String kaydet()
    {
        PreparedStatement ps=null;
        Connection con=null;
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/abc");
            ps=con.prepareStatement("INSERT INTO kullanii(Adi, Soyadi, Email, Sifre) VALUES(?,?,?,?)");
 
            ps.setString(1, name);
            ps.setString(2, surname);
            ps.setString(3, mail);
            ps.setString(4, password);
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
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
          return null;
    }
}