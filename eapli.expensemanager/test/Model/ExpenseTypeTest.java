/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author i110341
 */
public class ExpenseTypeTest {
    
    public ExpenseTypeTest() {
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
     * Test of creator method, of class ExpenseType.
     */
    @Test
    public void testNULLName() {
        System.out.println("creating new instance with null name");
        try {
            ExpenseType instance = new ExpenseType(null);
            fail("Allow null name.");
        } catch(IllegalArgumentException e) { 
            System.out.println("Argumento invalido! - nome nulo ou vazio");
        }    
    }
    
    /**
     * Test of creator method, of class ExpenseType.
     */
    @Test
    public void testEmptyName() {
        System.out.println("creating new instance with empty name");
        try {
            ExpenseType instance = new ExpenseType("");
            fail("Allow empty name.");
        } catch(IllegalArgumentException e) { 
            System.out.println("Argumento invalido! - nome nulo ou vazio");
        }
    }
    
    /**
     * Test of getName method, of class ExpenseType.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        ExpenseType instance = new ExpenseType("nome");
        String expResult = "nome";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of setName method, of class ExpenseType.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "name";
        ExpenseType instance = new ExpenseType("nome");
        instance.setName(name);
        String expResult = "name";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }
}
