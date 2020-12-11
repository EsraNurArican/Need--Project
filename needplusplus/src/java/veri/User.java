/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Merve
 */
public class User {
    String name;
    String surname;
    String birthday;
    String email;
    String username;
    String password;
    String country;
    String city;
    String district;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
    public boolean passwordControl(){
        DBkatmani dbk=new DBkatmani();
       /* return dbk.kullaniciKontrol(isim, sifre); Dbkatamına ekleeeeeeeeeeee*/
        return false;
    }
    public String save()
    {
        PreparedStatement ps=null;
        Connection con=null;
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/abc");
            ps=con.prepareStatement("INSERT INTO kullanii(Adi, Soyadi, Email, Sifre) VALUES(?,?,?,?)");
 
            ps.setString(1, name);
            ps.setString(2, surname);
            ps.setString(3, birthday);
            ps.setString(4, email);
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
    public static void main(String arg[]){
        User u=new User();
        u.setName("dur");
        u.setSurname("dur");
        System.out.println(u.passwordControl());
    }
    
   
}
