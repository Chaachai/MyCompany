/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.Connection;
import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CHAACHAI Youssef
 */
public class ConfigTest {

    public ConfigTest() {
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
     * Test of connect method, of class Config.
     */
//    @Test
//    public void testConnect() {
//        System.out.println("connect");
//        Config instance = new Config();
//        Connection expResult = null;
//        Connection result = instance.connect();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of loadData method, of class Config.
     */
//    @Test
//    public void testLoadData() {
//        System.out.println("loadData");
//        String query = "";
//        Config instance = new Config();
//        ResultSet expResult = null;
//        ResultSet result = instance.loadData(query);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of insertData method, of class Config.
     */
//    @Test
//    public void testInsertData() {
//        System.out.println("insertData");
//        String query = "";
//        Config instance = new Config();
//        int expResult = 0;
//        int result = instance.insertData(query);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of generateId method, of class Config.
     */
    @Test
    public void testGenerateId() {
        System.out.println("generateId");
        String tableName = "boitemail";
        String idName = "id";
        Config instance = new Config();
//        Long expResult = null;
        Long result = instance.generateId(tableName, idName);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        System.out.println(result);
    }

}
