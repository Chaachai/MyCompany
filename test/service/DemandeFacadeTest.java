/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.DemandeAugmentation;
import bean.DemandeAvance;
import bean.DemandeConge;
import java.util.Date;
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
public class DemandeFacadeTest {

    public DemandeFacadeTest() {
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
     * Test of getAllDemandesAvance method, of class DemandeFacade.
     */
//    @Test
//    public void testGetAllDemandesAvance() {
//        System.out.println("getAllDemandesAvance");
//        DemandeFacade instance = new DemandeFacade();
//        List<DemandeAvance> expResult = null;
//        List<DemandeAvance> result = instance.getAllDemandesAvance();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of getAllDemandesConges method, of class DemandeFacade.
     */
//    @Test
//    public void testGetAllDemandesConges() {
//        System.out.println("getAllDemandesConges");
//        DemandeFacade instance = new DemandeFacade();
//        List<DemandeConge> expResult = null;
//        List<DemandeConge> result = instance.getAllDemandesConges();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of getAllDemandesAugmentations method, of class DemandeFacade.
     */
//    @Test
//    public void testGetAllDemandesAugmentations() {
//        System.out.println("getAllDemandesAugmentations");
//        DemandeFacade instance = new DemandeFacade();
//        List<DemandeAugmentation> expResult = null;
//        List<DemandeAugmentation> result = instance.getAllDemandesAugmentations();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of ajouterDemandeConge method, of class DemandeFacade.
     */
//    @Test
//    public void testAjouterDemandeConge() {
//        System.out.println("ajouterDemandeConge");
//        Date date_debut = null;
//        Date date_fin = null;
//        String comment = "";
//        DemandeFacade instance = new DemandeFacade();
//        int expResult = 0;
//        int result = instance.ajouterDemandeConge(date_debut, date_fin, comment);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of ajouterDemandeAvance method, of class DemandeFacade.
     */
    @Test
    public void testAjouterDemandeAvance() {
        System.out.println("ajouterDemandeAvance");
        int pourcentage = 70;
        int mois = 8;
        String comment = "I want to buy a new TV";
        DemandeFacade instance = new DemandeFacade();
//        int expResult = 0;
        int result = instance.ajouterDemandeAvance(pourcentage, mois, comment);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        System.out.println(result);
    }

}
