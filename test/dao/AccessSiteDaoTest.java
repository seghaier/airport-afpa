/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import data.AccessSite;
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
public class AccessSiteDaoTest {
    
    public AccessSiteDaoTest() {
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
     * Test of create method, of class AccessSiteDao.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        
        AccessSiteDao instance = new AccessSiteDao();
        AccessSite accesstest = new AccessSite(43L,"petit","4b6cfa124411971901869dc6e1b00e5d3de5f1cc");
        AccessSite expResult = instance.find(accesstest.getNickname());
        System.out.println(expResult.getNickname());
        if (expResult.getNickname()!= null) {
             instance.delete(accesstest);
        } 
        
        AccessSite result = instance.create(accesstest);
        expResult = instance.find(accesstest.getNickname());
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of delete method, of class AccessSiteDao.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        
        AccessSiteDao instance = new AccessSiteDao();
        AccessSite accessDelete = new AccessSite();
        boolean result = false;
        
        if(accessDelete.getUser_id()== 0){
           accessDelete= instance.create(accessDelete);
        }            
        result= instance.delete(accessDelete);       

        assertEquals(true, result);  
    }

    /**
     * Test of update method, of class AccessSiteDao.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        AccessSite accessUpdate = new AccessSite(49L,"Benoit", "714099846d5fca096f50c162b6d1bdc1378c12ec");
        AccessSiteDao instance = new AccessSiteDao();
        AccessSite findAccessSite = instance.find(accessUpdate.getUser_id());
        if (!instance.update(findAccessSite)) {
            
            AccessSite resultAccessSite = instance.create(accessUpdate);  
            
            findAccessSite = instance.find(resultAccessSite.getUser_id());    
        }
            
            findAccessSite.setNickname("update Benoit");
            findAccessSite.setPassword("update 714099846d5fca096f50c162b6d1bdc1378c12ec");         
            
   
        
        boolean result = instance.update(findAccessSite);   
        boolean expResult = true;
        
        result= instance.delete(accessUpdate);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAll method, of class AccessSiteDao.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        String expResult = "";
        String result ="";
        AccessSiteDao instance = new AccessSiteDao();
        
        ArrayList<AccessSite> liste = instance.getAll();
        for (AccessSite accessSite : liste) {
            result += accessSite.toString();
            expResult += instance.find(accessSite.getUser_id());
            System.out.println(" --- " + result +"\n\r " + expResult);
            System.out.println();
        }
        assertEquals(expResult, result);
        
    }

    /**
     * Test of find method, of class AccessSiteDao.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        
        AccessSiteDao instance = new AccessSiteDao();
        String key = "28";
        // assign result exemple
        String expResult = "Access_site{user_id=28, nickname=marine, password=714099846d5fca096f50c162b6d1bdc1378c12ec}";
        
        System.out.println(instance.find(key).toString());
        // find airport
        String result = instance.find(key).toString();
        
        assertEquals(expResult, result);
        
    }
    
}
