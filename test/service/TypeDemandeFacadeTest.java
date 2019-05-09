/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.TypeDemande;
import java.util.List;
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
public class TypeDemandeFacadeTest {
    
    public TypeDemandeFacadeTest() {
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
     * Test of getAllTypes method, of class TypeDemandeFacade.
     */
//    @Test
//    public void testGetAllTypes() {
//        System.out.println("getAllTypes");
//        TypeDemandeFacade instance = new TypeDemandeFacade();
//        List<TypeDemande> expResult = null;
//        List<TypeDemande> result = instance.getAllTypes();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of test method, of class TypeDemandeFacade.
     */
    @Test
    public void testTest() {
        System.out.println("test");
        TypeDemandeFacade instance = new TypeDemandeFacade();
        instance.test();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
