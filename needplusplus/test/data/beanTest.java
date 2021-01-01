/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
public class beanTest 
{
    /* Driver for selenium test */
    private WebDriver driver;
    
    /* Required methods for testing  */
    public beanTest() {
        System.out.println("Starting bean class test..");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
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

    
    /* Tests for Bean Class' Getter Setter methods  */
    
    
    /**
     * Test of getName method, of class bean.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        String expResult = "elif";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setName method, of class bean.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "EsraNur";
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        instance.setName(name);
       
    }

    /**
     * Test of getSurname method, of class bean.
     */
    @Test
    public void testGetSurname() {
        System.out.println("getSurname");
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        String expResult = "keles";
        String result = instance.getSurname();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSurname method, of class bean.
     */
    @Test
    public void testSetSurname() {
        System.out.println("setSurname");
        String surname = "Arıcan";
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        instance.setSurname(surname);
        
    }

    /**
     * Test of getBirthday method, of class bean.
     */
    @Test
    public void testGetBirthday() {
        System.out.println("getBirthday");
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        String expResult = "01.01.1901";
        String result = instance.getBirthday();
        System.out.println(instance.getBirthday());
        System.out.println(expResult);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setBirthday method, of class bean.
     */
    @Test
    public void testSetBirthday() {
        System.out.println("setBirthday");
        String birthday = "11.11.1911";
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        instance.setBirthday(birthday);
        
    }

    /**
     * Test of getEmail method, of class bean.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        String expResult = "elif@hotmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEmail method, of class bean.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "newmail@hotmail.com";
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        instance.setEmail(email);
        
    }

    /**
     * Test of getUserName method, of class bean.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        String expResult = "elif1";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setUserName method, of class bean.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "newUserName";
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        instance.setUserName(userName);
        
    }

    /**
     * Test of getPassword method, of class bean.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        String expResult = "pass123";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPassword method, of class bean.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "changingPassw";
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        instance.setPassword(password);
        
    }

    /**
     * Test of getCountry method, of class bean.
     */
    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        String expResult = "tr";
        String result = instance.getCountry();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCountry method, of class bean.
     */
    @Test
    public void testSetCountry() {
        System.out.println("setCountry");
        String country = "USA";
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        instance.setCountry(country);
        
    }

    /**
     * Test of getCity method, of class bean.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        String expResult = "kocaeli";
        String result = instance.getCity();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCity method, of class bean.
     */
    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "Muş";
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        instance.setCity(city);
        
    }

    /**
     * Test of getDistrict method, of class bean.
     */
    @Test
    public void testGetDistrict() {
        System.out.println("getDistrict");
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        String expResult = "gebze";
        String result = instance.getDistrict();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDistrict method, of class bean.
     */
    @Test
    public void testSetDistrict() {
        System.out.println("setDistrict");
        String district = "mutsuz";
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        instance.setDistrict(district);
                
    }       

    /**
     * Test of getSizeOfActiveNeeds method, of class bean.
     */
    @Test
    public void testGetSizeOfActiveNeeds() {
        System.out.println("getSizeOfActiveNeeds");
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);int expResult = 0;
        int result = instance.getSizeOfActiveNeeds();
        assertEquals(expResult, result);
        
    }    
    
    /**
     * Test of setSizeOfActiveNeeds method, of class bean.
     */
    @Test
    public void testSetSizeOfActiveNeeds() {
        System.out.println("setSizeOfActiveNeeds");
        int sizeOfActiveNeeds = 1;
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        instance.setSizeOfActiveNeeds(sizeOfActiveNeeds);
        
    }    
    
    /**
     * Test of getTitleOfNeed method, of class bean.
     */
    @Test
    public void testGetTitleOfNeed() {
        System.out.println("getTitleOfNeed");
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        String expResult = "Needtitle";
        String result = instance.getTitleOfNeed();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitleOfNeed method, of class bean.
     */
    @Test
    public void testSetTitleOfNeed() {
        System.out.println("setTitleOfNeed");
        String titleOfNeed = "aNewTitleForNeed";
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        instance.setTitleOfNeed(titleOfNeed);
    }    
    
    /**
     * Test of getNeedPostList method, of class bean.
     */
   @Test
    public void testGetNeedPostList() {
        System.out.println("getNeedPostList");
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        List<NeedPostInformations> expResult = null;
        List<NeedPostInformations> result = instance.getNeedPostList();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNeedPostList method, of class bean.
     */
    @Test
    public void testSetNeedPostList() {
        System.out.println("setNeedPostList");
        List<NeedPostInformations> needPostList = null;
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        instance.setNeedPostList(needPostList);
        
    }    

    /**
     * Test of getNumberOfNeed method, of class bean.
     */
   @Test
    public void testGetNumberOfNeed() {
        System.out.println("getNumberOfNeed");
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        int expResult= 5;
        int result = instance.getNumberOfNeed();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNumberOfNeed method, of class bean.
     */
   @Test
    public void testSetNumberOfNeed() {
        System.out.println("setNumberOfNeed");
        int numberOfNeed = 10;
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        instance.setNumberOfNeed(numberOfNeed);
        
    }

    /**
     * Test of getDefinition method, of class bean.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        String expResult = "SimpleDefinition";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
   
    }

    /**
     * Test of setDefinition method, of class bean.
     */
    @Test
    public void testSetDefinition() {
        System.out.println("setDefinition");
        String definition = "aNewDefinitionForNeed";
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        instance.setDefinition(definition);
        
    }

    /**
     * Test of getAddress method, of class bean.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        String expResult = "simpleAddress";
        String result = instance.getAddress();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setAddress method, of class bean.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "newAddress";
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        instance.setAddress(address);
       
    }
    
    /**
     * Test of Connect method, of class bean.
     */
    /*@Test
    public void testConnect() throws SQLException {
        System.out.println("Connect");
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        Connection expResult = DriverManager.getConnection("jdbc:derby://localhost:1527/Need", "ari", "need");
        Connection result = instance.Connect();
        assertEquals(expResult, result);
        
    }*/    

    /**
     * Test of save method, of class bean.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        String expResult = "Bean save successful.";
        String result = instance.save();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

    /**
     * Test of userControl method, of class bean.
     */
    @Test
    public void testUserControl() throws Exception {
        System.out.println("userControl");
        String kullaniciAdi = "";
        String sifre = "pass123";
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);boolean expResult = false;
        boolean result = instance.userControl(kullaniciAdi, sifre);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of passwordCheck method, of class bean.
     */
    @Test
    public void testPasswordCheck() throws Exception {
        System.out.println("passwordCheck");
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        /* default is wrong page  */
        String expResult = "wrongPassword?faces-redirect=true";
        String result = instance.passwordCheck();
        assertEquals(expResult, result);
        
    }
  
    /**
     * Test of AddNeed method, of class bean.
     */
    @Test
    public void testAddNeed() throws Exception {
        System.out.println("AddNeed");
        bean instance=new bean("elif", "keles", "01.01.1901", "elif@hotmail.com", "elif1", "pass123", "tr", "kocaeli", "gebze", "simpleAddress", "Needtitle", 5, "SimpleDefinition", 0);
        String expResult = "homepage?faces-redirect=true";
        String result = instance.AddNeed();
        assertEquals(expResult, result);
        
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
