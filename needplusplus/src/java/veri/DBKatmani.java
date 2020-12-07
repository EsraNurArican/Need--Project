/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Merve
 */
public class DBKatmani {
    private Connection conn;
    String dburl="jdbc:derby://localhost:1527/abc";
    String user="abc";
    String password="123";
    int i;
    private Kisi kisi;
    
    public Connection baglan(){
        try{
             Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
             System.out.println("Bağlantı başarılı.");
             conn= DriverManager.getConnection(dburl,user,password);
        }
        catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){
            System.out.println("Bağlantı başarısız.");
        }
   return conn;
    }
    public void kullaniciListesi(){
       if(conn==null)
        {
            System.out.println("veri tabanı baglı degıl,baglanıyorum");
            baglan();
        }
        try {
             Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery("select *from kullanii");
        System.out.println("kullanici  adi\t sifre\t isim\t telefon");
            while(rs.next()){
                System.out.println(""+rs.getString(1)+"\t "+rs.getString(2)+"\t"+rs.getString(3)+"\t "+rs.getString(4));

            }
        }
        catch(Exception e)
        {
            System.out.println("baglantıda sorun var");
        }
       
    }
     public boolean kullaniciKontrol(String kullaniciAdi ,String sifre){
        if(conn==null)
        {
            System.out.println("veri tabanı baglı degıl,baglanıyorum");
            baglan();
        }
        try {
            System.out.println("burdakı");
             Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery("select sifre from kullanii where ad='"+kullaniciAdi+"'");
        rs.next();
        return sifre.equals(rs.getString(1));
        }
        catch(SQLException e){
        }
        return false;    
    }
      public String add() {
        int i = 0;
        if (kisi.isim != null) {
            PreparedStatement ps = null;
            Connection con = null;
            try {
                if (ps != null) {
                    con = ps.getConnection();
                    if (con != null) {
                        String sql = "INSERT INTO user(firstname, password, lastname, email) VALUES(?,?,?,?)";
                        ps = con.prepareStatement(sql);
                        ps.setString(1, kisi.isim);
                        ps.setString(2, kisi.sifre);
                        ps.setString(3, kisi.soyisim);
                        ps.setString(4, kisi.mail);
                        i = ps.executeUpdate();
                        System.out.println("Data Added Successfully");
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                try {
                    con.close();
                    ps.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (i > 0) {
            return "success";
        } else
            return "unsuccess";
    }
     
     
    public static void main(String arg[]){
        DBKatmani dbka=new DBKatmani();
        dbka.kullaniciListesi();
        String add = dbka.add();
        System.out.println(add);
      
        
    }

    
    
}
