/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author i070352
 */
public class IncomeTest {
    
    public IncomeTest() {
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
     * Test of getTipo method, of class Income.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Income instance = new Income();
        IncomeTypes expResult = null;
        IncomeTypes result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTipo method, of class Income.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        IncomeTypes Tipo = null;
        Income instance = new Income();
        instance.setTipo(Tipo);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getValor method, of class Income.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Income instance = new Income();
        BigDecimal expResult = null;
        BigDecimal result = instance.getValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
