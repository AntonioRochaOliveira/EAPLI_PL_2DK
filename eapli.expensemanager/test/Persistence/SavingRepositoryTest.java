package Persistence;

import Model.Saving;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SavingRepositoryTest {
    
    public SavingRepositoryTest() {
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
     * Test of getUniqueRepo method, of class SavingRepository.
     */
    @Test
    public void testGetUniqueRepo() {
        System.out.println("getUniqueRepo");
        SavingRepository expResult = null;
        SavingRepository result = SavingRepository.getUniqueRepo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of addSaving method, of class SavingRepository.
     */
    @Test
    public void testAddSaving() throws Exception {
        System.out.println("addSaving");
        Saving sav = new Saving("Casa",300000,"cxxx");
        SavingRepository.addSaving(sav);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getList method, of class SavingRepository.
     */
    @Test
    public void testGetList() {
        System.out.println("getList");
        ArrayList<Saving> expList= new ArrayList();
        ArrayList expResult = expList;
        ArrayList result = SavingRepository.getList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
}
