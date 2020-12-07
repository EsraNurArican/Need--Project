/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import telephoneemail.TelephoneEmail;

/**
 *
 * @author Merve
 */
public class TelephoneEmailTest {
    
     @Test
    public void getTelephone() {
        TelephoneEmail obj= new TelephoneEmail ("05395035658");
        assertEquals("05395035658",obj.getTelephone());
    }
    @Test
    public void setTelephone() {
        TelephoneEmail obj= new TelephoneEmail ("05786456987");
        obj.setTelephone("05395035658");
        assertEquals("05395035658",obj.getTelephone());
    }
    @Test
    public void checkValidString() {
        TelephoneEmail obj= new TelephoneEmail ("05395035658");
        boolean result= obj.checkValidString("cdsckmsdc645163");
        assertEquals(false,result);
    }
    @Test
    public void telephoneValidation() {
        TelephoneEmail obj = new TelephoneEmail("05395035658");
        boolean result = obj.telephoneValidation("05395035658");
        assertEquals(true,result);
    }
    @Test
    public void getEmail() {
        TelephoneEmail obj= new TelephoneEmail ("05395035658","merve@hotmail.com");
        assertEquals("merve@hotmail.com",obj.getEmail());
    }
    @Test
    public void setEmail() {
        TelephoneEmail obj= new TelephoneEmail ("05395035658");
        obj.setEmail("merve@hotmail.com");
        assertEquals("merve@hotmail.com",obj.getEmail());
    }
    @Test
    public void isValidEmailAddress(){
        TelephoneEmail obj = new TelephoneEmail("05395035658","merve@hotmail.com");
        boolean result = obj.isValidEmailAddress("merve@hotmail.com");
        assertEquals(true,result);   
    }
}
