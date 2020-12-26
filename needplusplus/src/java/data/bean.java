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
    String titleOfNeed;
    int numberOfNeed;
    String definition;
    String address;
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
    
     public String getTitleOfNeed() {
        return titleOfNeed;
    }

    public void setTitleOfNeed(String titleOfNeed) {
        this.titleOfNeed = titleOfNeed;
    }

    public int getNumberOfNeed() {
        return numberOfNeed;
    }

    public void setNumberOfNeed(int numberOfNeed) {
        this.numberOfNeed = numberOfNeed;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public Connection Connect(){
      System.out.println("connect testi");
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
    
     public String save(){
         
        System.out.println("ffs");
        PreparedStatement ps=null;
        Connection con=null;
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/Need","ari","need");
            ps=con.prepareStatement("INSERT INTO userinformation(NAME, SURNAME, BIRTHDATE, EMAIL,USERNAME,PASSWORD,COUNTRY,CITY,DISTRICT) VALUES(?,?,?,?,?,?,?,?,?)");
            
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
     
    public boolean userControl(String kullaniciAdi ,String sifre) throws ClassNotFoundException, SQLException{
         Connection conn=null;
         if(conn==null)
        {
             Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/Need","ari","need");
        }
        try {
            System.out.println("is kosulu");
            if(conn!=null){ 
                Statement stmt=conn.createStatement();

                System.out.println("kullanici  adi\t sifre\t isim\t telefon");

                ResultSet rs=stmt.executeQuery("select password from userınformation where username='"+kullaniciAdi+"'");
                rs.next();
                return sifre.equals(rs.getString(1));
            }
        }
        catch(SQLException e){
        }
        return false;      
    }
    
    public String passwordCheck() throws ClassNotFoundException, SQLException{
         
        bean dbk=new bean();
        if(dbk.userControl(userName, password)==true)
        {
            return "homepage?faces-redirect=true";
        }
        else
        {
            return  "wrongPassword?faces-redirect=true";
        }        
    }
    
    public String AddNeed() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        
        PreparedStatement ps=null;
        Connection con=null;

        try{

            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/userInformation","ari","need");

            Statement stmt = con.createStatement();
            ResultSet rs;
            System.out.println(getName());
            rs = stmt.executeQuery("SELECT username FROM USERINFORMATION WHERE username='"+getUserName()+"' AND password='"+getPassword()+"'");
            String idkisix = null;
            while ( rs.next() ) {

                idkisix = rs.getString(userName);

            }

            ps=con.prepareStatement("INSERT INTO NEEDPOSTINFORMATION(TITLEOFNEED,NUMBEROFNEED,DEFINITION,ADDRESS,USERNAME) VALUES (?,?,?,?,?)");

            ps.setString(1, userName);
            ps.setString(2, titleOfNeed);
            ps.setInt(3, numberOfNeed);
            ps.setString(4, definition);
            ps.setString(5, address);


            ps.executeUpdate();
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }

        return null;
    }
    
     
    public static void main(String arg[]) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
        bean dbka=new bean();
         dbka.Connect();
         // A lil change for testing.. ok, Now push this commit, 
         dbka.setUserName("lol");
        dbka.setName("evrem");
        //dbka.setPassword("dur");
       dbka.save();
      
        
        
      // dbka.kullaniciListesi();
      //  dbka.sifreKontrol();
        
        // System.out.println(dbka.sifreKontrol());
      
    }
    
}
