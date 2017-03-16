/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bddsql.LiaisonSql;
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
    @Test
    public void testCreer() {
        System.out.println("creer");
        Object obj = null;
        AirportsDao instance = new AirportsDao();
        boolean expResult = false;
        boolean result = instance.creer(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supprimer method, of class AirportsDao.
     */
    @Test
    public void testSupprimer() {
        System.out.println("supprimer");
        Object obj = null;
        AirportsDao instance = new AirportsDao();
        boolean expResult = false;
        boolean result = instance.supprimer(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class AirportsDao.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        AirportsDao instance = new AirportsDao();
        ArrayList expResult = null;
        ArrayList result = instance.getAll();
        AirportsDao el = new AirportsDao();
        ArrayList<AirportsDao> listeaireport = el.getAll();
        //System.out.println("on a "+ listeaireport.size() + " Airoport :");  
        //System.out.println();
        
        for(AirportsDao ai : listeaireport) {
            System.out.println(ai.getAll()+ " " + ai.getAll()+ " " + ai.getAll());
    }
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getmanager method, of class AirportsDao.
     */
    @Test
    public void testGetmanager() {
        System.out.println("getmanager");
        AirportsDao instance = new AirportsDao();
        LiaisonSql expResult = null;
        LiaisonSql result = instance.getmanager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fine method, of class AirportsDao.
     */
    @Test
    public void testFine() {
        System.out.println("fine");
        AirportsDao instance = new AirportsDao();
        ArrayList expResult = null;
        ArrayList result = instance.fine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
