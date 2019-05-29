/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Salarie;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hamza
 */
public class SalarieFacadeTest {
    
    public SalarieFacadeTest() {
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
     * Test of login method, of class SalarieFacade.
     */
//    @Test
//    public void testLogin() {
//        System.out.println("login");
//        String login = "";
//        String password = "";
//        SalarieFacade instance = new SalarieFacade();
//        int expResult = 0;
//        int result = instance.login(login, password);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getSalarieByLogin method, of class SalarieFacade.
     */
//    @Test
//    public void testGetSalarieByLogin() {
//        System.out.println("getSalarieByLogin");
//        String login = "";
//        SalarieFacade instance = new SalarieFacade();
//        Salarie expResult = null;
//        Salarie result = instance.getSalarieByLogin(login);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of test method, of class SalarieFacade.
     */
//    @Test
//    public void testTest() throws Exception {
//        System.out.println("test");
//        SalarieFacade instance = new SalarieFacade();
//        instance.test();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of ajouterEmploye method, of class SalarieFacade.
     */
    @Test
    public void testAjouterEmploye() {
        System.out.println("ajouterEmploye");
        String nom = "nom";
        String prenom = "prenom";
        String login = "login";
        String motPasse = "motdepasse";
        String telephone = "060606060606";
        float salaire = 10000;
        int role = 3;
        int IDdep = 1;
        SalarieFacade instance = new SalarieFacade();
        instance.ajouterEmploye(nom, prenom, login, motPasse, telephone, salaire, role, IDdep);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
