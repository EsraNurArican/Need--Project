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

/**
 *
 * @author esra
 */
public class NeedPostOperations  extends bean{
    
    private  String titleOfNeed;
    private int numberOfNeed;
    private String definition;
    private String country;
    private String city;
    private String district;
    private String address;

    
    
    /**
     * No parameter constructor
     */
    public NeedPostOperations() {
        
      
        this.titleOfNeed = null;
        this.numberOfNeed = 0;
        this.definition = null;
        this.country = null;
        this.city = null;
        this.district = null;
        this.address = null;
    }

    /**
     * Constructor that takes all parameters to assign private values
     * @param titleOfNeed
     * @param numberOfNeed
     * @param definition
     * @param country
     * @param city
     * @param district
     * @param address 
     */
    public NeedPostOperations(String titleOfNeed, int numberOfNeed, String defnition, 
                              String country, String city,
                              String district, String address) {
        this.titleOfNeed = titleOfNeed;
        this.numberOfNeed = numberOfNeed;
        this.definition = definition;
        this.country = country;
        this.city = city;
        this.district = district;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
            System.out.println(super.getName());
            rs = stmt.executeQuery("SELECT username FROM userınformation WHERE name='"+getName()+"' AND password='"+getPassword()+"'");
            int idkisix = 0;
            while ( rs.next() ) {

                idkisix = rs.getInt("username");

            }

            ps=con.prepareStatement("INSERT INTO needPostInformation(userName, titleOfNeed, numberofneed,definition,country,city,district,address) VALUES (?,?,?,?,?,?,?,?)");

            ps.setString(1, userName);
            ps.setString(2, titleOfNeed);
            ps.setInt(3, numberOfNeed);
            ps.setString(4, definition);
            ps.setString(5, country);
            ps.setString(6, city);
            ps.setString(7, district);
            ps.setString(8, address);


            ps.executeUpdate();
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }

        return null;
    }
    
    public static void main(String arg[]) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
        NeedPostOperations dbka=new NeedPostOperations();
         
        dbka.setName("dd");
        dbka.setPassword("dd");
        dbka.setUserName("usrnamee");
        dbka.AddNeed();
        dbka.save();
      // dbka.kullaniciListesi();
      //  dbka.sifreKontrol();
        
        // System.out.println(dbka.sifreKontrol());
      
      
        
    }
    
    
    
}
