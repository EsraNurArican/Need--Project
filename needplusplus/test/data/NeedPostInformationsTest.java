/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elif
 */
public class NeedPostInformationsTest {
    
    public NeedPostInformationsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNeedTitle method, of class NeedPostInformations.
     */
    @Test
    public void testGetNeedTitle() {
        System.out.println("getNeedTitle");
        NeedPostInformations instance = new NeedPostInformations("Needtitle", "SimpleDefinition", "simpleAddress", 5);
        String expResult = "Needtitle";
        String result = instance.getNeedTitle();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getNeedDefinition method, of class NeedPostInformations.
     */
    @Test
    public void testGetNeedDefinition() {
        System.out.println("getNeedDefinition");
        NeedPostInformations instance = new NeedPostInformations("Needtitle", "SimpleDefinition", "simpleAddress", 5);
        String expResult = "SimpleDefinition";
        String result = instance.getNeedDefinition();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getNeedAddress method, of class NeedPostInformations.
     */
    @Test
    public void testGetNeedAddress() {
        System.out.println("getNeedAddress");
        NeedPostInformations instance = new NeedPostInformations("Needtitle", "SimpleDefinition", "simpleAddress", 5);
        String expResult = "simpleAddress";
        String result = instance.getNeedAddress();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getNeedNumber method, of class NeedPostInformations.
     */
    @Test
    public void testGetNeedNumber() {
        System.out.println("getNeedNumber");
        NeedPostInformations instance = new NeedPostInformations("Needtitle", "SimpleDefinition", "simpleAddress", 5);
        int expResult = 5;
        int result = instance.getNeedNumber();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setNeedTitle method, of class NeedPostInformations.
     */
    @Test
    public void testSetNeedTitle() {
        System.out.println("setNeedTitle");
        String needTitle = "newTitle";
        NeedPostInformations instance = new NeedPostInformations("Needtitle", "SimpleDefinition", "simpleAddress", 5);
        instance.setNeedTitle(needTitle);
        
    }

    /**
     * Test of setNeedDefinition method, of class NeedPostInformations.
     */
    @Test
    public void testSetNeedDefinition() {
        System.out.println("setNeedDefinition");
        String needDefinition = "newDefinition";
        NeedPostInformations instance = new NeedPostInformations("Needtitle", "SimpleDefinition", "simpleAddress", 5);
        instance.setNeedDefinition(needDefinition);
       
    }

    /**
     * Test of setNeedAddress method, of class NeedPostInformations.
     */
    @Test
    public void testSetNeedAddress() {
        System.out.println("setNeedAddress");
        String needAddress = "newAddress";
        NeedPostInformations instance = new NeedPostInformations("Needtitle", "SimpleDefinition", "simpleAddress", 5);
        instance.setNeedAddress(needAddress);
        
    }

    /**
     * Test of setNeedNumber method, of class NeedPostInformations.
     */
    @Test
    public void testSetNeedNumber() {
        System.out.println("setNeedNumber");
        int needNumber = 10;
        NeedPostInformations instance = new NeedPostInformations("Needtitle", "SimpleDefinition", "simpleAddress", 5);
        instance.setNeedNumber(needNumber);
       
    }

    /**
     * Test of toString method, of class NeedPostInformations.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        NeedPostInformations instance = new NeedPostInformations("Needtitle", "SimpleDefinition", "simpleAddress", 5);
        String expResult = "NeedPostInformations{" + "needTitle=" + "Needtitle" + 
                ", needDefinition=" + "SimpleDefinition" + 
                ", needAddress=" + "simpleAddress" + 
                ", needNumber=" + 5 + '}';
                
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
