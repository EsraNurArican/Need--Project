/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import  org.testng.annotations.Test;
//import org.junit.jupiter.api.Test;

/**
 *
 * @author esra
 */
public class beanClassTest {
    
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
    
}
