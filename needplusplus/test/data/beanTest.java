/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.openqa.grid.common.SeleniumProtocol.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


/**
 *
 * @author esra
 */
public class beanTest {
    private WebDriver driver;
    
    
    public beanTest() {
        System.out.println("Starting bean class test..");
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    /**
     * Selenium test added to setUp method
     */
    @BeforeEach
    public void setUp() 
    {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--start-maximized");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32");
        driver = new ChromeDriver(options);
        driver.get("http://localhost:8080/needplusplus/");
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
        bean instance = new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "");
        String expResult = "elif";
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
        bean instance = new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "");
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
        bean instance = new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "");
        String expResult = "keles";
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
        bean instance = new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "");
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
        bean instance = new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "");
        String expResult = "01.01.1901";
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
        bean instance = new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "");
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
        bean instance = new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "");
        String expResult = "elif@hotmail.com";
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
        bean instance = new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "");
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
        bean instance = new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "");
        String expResult = "elif1";
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
        bean instance = new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "");
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
        bean instance = new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "");
        String expResult = "pass123";
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
        bean instance = new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "");
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
        bean instance = new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "");
        String expResult = "tr";
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
        bean instance = new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "");
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
        bean instance = new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "");
        String expResult = "kocaeli";
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
        bean instance = new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "");
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
        bean instance = new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "");
        String expResult = "gebze";
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
        bean instance = new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "");
        instance.setDistrict(district);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is failed.");
    }

    /**
     * Test of Connect method, of class bean.
     */
    @Test
    public void testConnect() throws SQLException {
        System.out.println("Connect");
        bean instance = new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "");
        Connection expResult = DriverManager.getConnection("jdbc:derby://localhost:1527/Need", "ari", "need");
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
        bean instance = new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "");
        String expResult = "Bean save successful.";
        String result = instance.save();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class bean.
     */
    @Test
    public void testMain() throws Exception 
    {
        System.out.println("main");
        String[] arg = null;
        bean.main(arg);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
