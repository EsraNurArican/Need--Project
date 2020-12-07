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
public class Kisi {
      String isim;
    String soyisim;
    String sifre;
    String cinsiyet;
    int telephon;
    String adres;
    String urun;
    int urunSayisi;
    String mail;
   

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public int getTelephon() {
        return telephon;
    }

    public void setTelephon(int telephon) {
        this.telephon = telephon;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getUrun() {
        return urun;
    }

    public void setUrun(String urun) {
        this.urun = urun;
    }

    public int getUrunSayisi() {
        return urunSayisi;
    }

    public void setUrunSayisi(int urunSayisi) {
        this.urunSayisi = urunSayisi;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Kisi() {
        isim=null;
        sifre=null;
    }
     public boolean sifreKontrol(){
        DBKatmani dbk=new DBKatmani();
        return dbk.kullaniciKontrol(isim, sifre);
        
    }
    

    public String getSifre() {
        System.out.println("defrgrg");
        
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String kaydet()
    {
        PreparedStatement ps=null;
        Connection con=null;
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/abc");
            ps=con.prepareStatement("INSERT INTO kullanii(Adi, Soyadi, Email, Sifre) VALUES(?,?,?,?)");
 
            ps.setString(1, isim);
            ps.setString(2, soyisim);
            ps.setString(3, mail);
            ps.setString(4, sifre);
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
        Kisi k=new Kisi();
        k.setIsim("dur");
        k.setSifre("dur");
        System.out.println(k.sifreKontrol());
    }
    
}
