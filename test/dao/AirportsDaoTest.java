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
    @Test
    public void testcreate() {
        System.out.println("create");
        // create object airport
        AirportsDao airportDao = new AirportsDao();
//        
        Airports airport = new Airports("TUN", "Tunis", "Tunisie");
//
//        // find airport  create 
        Airports expResult = airportDao.find(airport.getAita());
        System.out.println(expResult.getAita());
        // if find aita is empty
        if (expResult.getAita()!=null) {
             airportDao.delete(airport);
        } 
//            // insert airport in table
            Airports result = airportDao.create(airport);   
//            // find airport
            expResult = airportDao.find(airport.getAita());
            assertEquals(expResult, result);          
        
    }

    /**
     * Test of supprimer method, of class AirportsDao.
     */
    @Test
    public void testDelete() {
         System.out.println("delete");
        AirportsDao airportDao = new AirportsDao();
        Airports airport = new Airports("ROM", "Rome", "Italie");
        boolean result = false; 

        Airports airportFind = airportDao.find(airport.getAita());             

        if(airportFind.getAita()== null){
           airport= airportDao.create(airport);
        }            
        result= airportDao.delete(airport);       

        assertEquals(true, result);          
    }

    /**
     * Test of getAll method, of class AirportsDao.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        String expResult = "";
        String result ="";
        
        AirportsDao instance = new AirportsDao();
        
        
        ArrayList<Airports> listeaireport = instance.getAll();
        
        
        for (Airports airports : listeaireport) {
            result += airports.toString();
            expResult += instance.find(airports.getAita());
            System.out.println(" --- " + result +"\n\r " + expResult);
            System.out.println();
        }
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getmanager method, of class AirportsDao.
     */
    @Test
    public void testupdate() {
       System.out.println("update");
        Airports airport = new Airports("BRC", "Barcelone", "Espagne");
        AirportsDao airportDao = new AirportsDao();         
        Airports findAirport = airportDao.find(airport.getAita());        
        
        if (!airportDao.update(findAirport)) {
            
            Airports resultAirport = airportDao.create(airport);  
            
            findAirport = airportDao.find(resultAirport.getAita());    
        }
            
            findAirport.setCity("update Barcelone");
            findAirport.setPays("update Espagne");         
            
   
        
        boolean result = airportDao.update(findAirport);   
        boolean expResult = true;
        
        result= airportDao.delete(airport);
        assertEquals(expResult, result);
    
    }

    /**
     * Test of fine method, of class AirportsDao.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        AirportsDao airportDAO = new AirportsDao();
        // assign primary key
        String primary_key = "DXB";
        // assign result exemple
        String expResult = "Airports{aita=DXB, city=Dubaï, pays=Émirats arabes unis}";
        
        System.out.println(airportDAO.find(primary_key).toString());
        // find airport
        String result = airportDAO.find(primary_key).toString();
        
        assertEquals(expResult, result);
    }
    
}
