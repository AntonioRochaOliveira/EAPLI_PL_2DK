/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;
import Persistence.ExpenseTypeRepository;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Persistence.ExpenseTypeRepository;
import Persistence.PersistenceFactory;
/**
 *
 * @author paulo
 */
public class ExpenseTypeRegisterControllerTest {
    
    public ExpenseTypeRegisterControllerTest() {
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
     * Test of registerTypeExpense method, of class ExpenseTypeRegisterController.
     */
    @Test
    public void testRegisterTypeExpense() {
        System.out.println("registerTypeExpense");
        String name = "xpto";
        String longName = "xptoLong";
        ExpenseTypeRegisterController instance = new ExpenseTypeRegisterController();
        instance.registerTypeExpense(name);
        ExpenseTypeRepository repo = PersistenceFactory.buildPersistenceFactory().expenseTypeRepository();
        ExpenseType e = new ExpenseType(name, longName);
        
        assertEquals(repo.getExpenseTypeByDescription(name).getName(),e.getName());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
