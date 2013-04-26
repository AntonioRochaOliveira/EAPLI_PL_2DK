/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import java.math.BigDecimal;
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
 * @author ASUS
 */
public class ExpenseRegisterControllerTest {
    
    public ExpenseRegisterControllerTest() {
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
     * Test of registerExpense method, of class ExpenseRegisterController.
     */
    @Test
    public void testRegisterExpense() {
        System.out.println("registerExpense");
        String what = "comida";
        Date date = new Date(1990, 14, 8);
        BigDecimal amount = new BigDecimal(2);
        int tipo = 1;
        int mp = 1;
        ExpenseRegisterController instance = new ExpenseRegisterController();
        //instance.registerExpense(what, date, amount, tipo, mp);
       // Expense exp = new Expense(2, new Date(1990, 14, 8), "comida", );
                }

    /**
     * Test of getTypeExpense method, of class ExpenseRegisterController.
     */
    @Test
    public void testGetTypeExpense() {
        System.out.println("getTypeExpense");
        ExpenseRegisterController instance = new ExpenseRegisterController();
        List expResult = null;
        List result = instance.getTypeExpense();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMeioDePagamento method, of class ExpenseRegisterController.
     */
    @Test
    public void testGetMeioDePagamento() {
        System.out.println("getMeioDePagamento");
        ExpenseRegisterController instance = new ExpenseRegisterController();
       // List expResult = new List();
        List result = instance.getMeioDePagamento();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}