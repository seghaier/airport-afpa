/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bddsql.LiaisonSql;
import data.Airports;
import java.util.ArrayList;
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
public class AirportsDaoTest {
    
    public AirportsDaoTest() {
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
     * Test of creer method, of class AirportsDao.
     */
//    @Test
//    public void testCreer() {
//        System.out.println("creer");
//        Object obj = null;
//        AirportsDao instance = new AirportsDao();
//        boolean expResult = false;
//        boolean result = instance.creer(obj);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of supprimer method, of class AirportsDao.
//     */
//    @Test
//    public void testSupprimer() {
//        System.out.println("supprimer");
//        Object obj = null;
//        AirportsDao instance = new AirportsDao();
//        boolean expResult = false;
//        boolean result = instance.supprimer(obj);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getAll method, of class AirportsDao.
     */
//    @Test
//    public void testGetAll() {
//        System.out.println("getAll");
//        String expResult = "";
//        String result ="";
//        
//        AirportsDao instance = new AirportsDao();
//        
//        
//        ArrayList<Airports> listeaireport = instance.getAll();
//        
//        
//        for (Airports airports : listeaireport) {
//            result += airports.toString();
//            expResult += instance.find(airports.getAita());
//            System.out.println("1 --- " + result);
//            System.out.println("2 ---"+ expResult);
//        }
//        assertEquals(expResult, result);
//        
//    }

    /**
     * Test of getmanager method, of class AirportsDao.
     */
//    @Test
//    public void testGetmanager() {
//        System.out.println("getmanager");
//        AirportsDao instance = new AirportsDao();
//        LiaisonSql expResult = null;
//        LiaisonSql result = instance.getmanager();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of fine method, of class AirportsDao.
//     */
    @Test
    public void testFine() {
        System.out.println("fine");
        AirportsDao airportDAO = new AirportsDao();
        // assign primary key
        String primary_key = "DXB";
        // assign result exemple
        String expResult = "Airport{aita=DXB, city=Dubaï, country=Émirats arabes unis}";
        // find airport
        String result = airportDAO.find(primary_key).toString();
        
        assertEquals(expResult, result);
    }
    
}
