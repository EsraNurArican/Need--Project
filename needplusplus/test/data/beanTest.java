/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;



import java.sql.Connection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author esra
 */
public class beanTest {
    
    
    public beanTest() {
        System.out.println("Starting bean class test..");
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getName method, of class bean.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        bean instance = new bean();
        String expResult = "firstname";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is failed.");
    }

    /**
     * Test of setName method, of class bean.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "EsraNur";
        bean instance = new bean();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is failed.");
    }

    /**
     * Test of getSurname method, of class bean.
     */
    @Test
    public void testGetSurname() {
        System.out.println("getSurname");
        bean instance = new bean();
        String expResult = "secondname";
        String result = instance.getSurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is failed.");
    }

    /**
     * Test of setSurname method, of class bean.
     */
    @Test
    public void testSetSurname() {
        System.out.println("setSurname");
        String surname = "Arıcan";
        bean instance = new bean();
        instance.setSurname(surname);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is failed.");
    }

    /**
     * Test of getBirthday method, of class bean.
     */
    @Test
    public void testGetBirthday() {
        System.out.println("getBirthday");
        bean instance = new bean();
        String expResult = "12.12.1912";
        String result = instance.getBirthday();
        System.out.println(instance.getBirthday());
        System.out.println(expResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is failed.");
    }

    /**
     * Test of setBirthday method, of class bean.
     */
    @Test
    public void testSetBirthday() {
        System.out.println("setBirthday");
        String birthday = "11.11.1911";
        bean instance = new bean();
        instance.setBirthday(birthday);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is failed.");
    }

    /**
     * Test of getEmail method, of class bean.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        bean instance = new bean();
        String expResult = "trial@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is failed.");
    }

    /**
     * Test of setEmail method, of class bean.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "newmail@hotmail.com";
        bean instance = new bean();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is failed.");
    }

    /**
     * Test of getUserName method, of class bean.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        bean instance = new bean();
        String expResult = "sampleUserName";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is failed.");
    }

    /**
     * Test of setUserName method, of class bean.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "newUserName";
        bean instance = new bean();
        instance.setUserName(userName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is failed.");
    }

    /**
     * Test of getPassword method, of class bean.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        bean instance = new bean();
        String expResult = "userpassw1";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is failed.");
    }

    /**
     * Test of setPassword method, of class bean.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "changingPassw";
        bean instance = new bean();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is failed.");
    }

    /**
     * Test of getCountry method, of class bean.
     */
    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        bean instance = new bean();
        String expResult = "Turkey";
        String result = instance.getCountry();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is failed.");
    }

    /**
     * Test of setCountry method, of class bean.
     */
    @Test
    public void testSetCountry() {
        System.out.println("setCountry");
        String country = "USA";
        bean instance = new bean();
        instance.setCountry(country);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is failed.");
    }

    /**
     * Test of getCity method, of class bean.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        bean instance = new bean();
        String expResult = "Agrı";
        String result = instance.getCity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is failed.");
    }

    /**
     * Test of setCity method, of class bean.
     */
    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "Muş";
        bean instance = new bean();
        instance.setCity(city);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is failed.");
    }

    /**
     * Test of getDistrict method, of class bean.
     */
    @Test
    public void testGetDistrict() {
        System.out.println("getDistrict");
        bean instance = new bean();
        String expResult = "mutlu";
        String result = instance.getDistrict();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is failed.");
    }

    /**
     * Test of setDistrict method, of class bean.
     */
    @Test
    public void testSetDistrict() {
        System.out.println("setDistrict");
        String district = "mutsuz";
        bean instance = new bean();
        instance.setDistrict(district);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is failed.");
    }

    /**
     * Test of Connect method, of class bean.
     */
    @Test
    public void testConnect() {
        System.out.println("Connect");
        bean instance = new bean();
        Connection expResult = null;
        Connection result = instance.Connect();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is failed.");
    }

    /**
     * Test of save method, of class bean.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        bean instance = new bean();
        String expResult = "";
        String result = instance.save();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class bean.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] arg = null;
        bean.main(arg);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
