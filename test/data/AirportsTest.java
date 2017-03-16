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
 * @author Formation
 */
public class AirportsTest {
    
    public AirportsTest() {
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
     * Test of getAita method, of class Airports.
     */
    @Test
    public void testGetAita() {
        System.out.println("getAita");
        Airports instance = null;
        String expResult = "aita";
        String result = instance.getAita();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setAita method, of class Airports.
     */
    @Test
    public void testSetAita() {
        System.out.println("setAita");
        String aita = "aita";
        Airports instance = null;
        instance.setAita(aita);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCity method, of class Airports.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        Airports instance = null;
        String expResult = "city";
        String result = instance.getCity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setCity method, of class Airports.
     */
    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "city";
        Airports instance = null;
        instance.setCity(city);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPays method, of class Airports.
     */
    @Test
    public void testGetPays() {
        System.out.println("getPays");
        Airports instance = null;
        String expResult = "pays";
        String result = instance.getPays();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPays method, of class Airports.
     */
    @Test
    public void testSetPays() {
        System.out.println("setPays");
        String pays = "pays";
        Airports instance = null;
        instance.setPays(pays);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
