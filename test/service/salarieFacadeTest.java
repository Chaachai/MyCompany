/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

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
public class salarieFacadeTest {
    
    public salarieFacadeTest() {
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
     * Test of login method, of class salarieFacade.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String login = "chaachai";
        String password = "chaachaiii";
        SalarieFacade instance = new SalarieFacade();
        //int expResult = 0;
        int result = instance.login(login, password);
      //  assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
  //      fail("The test case is a prototype.");
        System.out.println(result);
    }
    
}
