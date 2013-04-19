/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.IncomeTypes;
import java.math.BigDecimal;
import java.util.Date;
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
public class IncomeRegisterControllerTest {
    
    public IncomeRegisterControllerTest() {
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
     * Test of registerIncome method, of class IncomeRegisterController.
     */
    @Test
    public void testRegisterIncome() {
        BigDecimal n1 = new BigDecimal(100);
        Date d1 = new Date(1999, 07, 27);
        String dc = "Cenas";
        IncomeTypes IT = new IncomeTypes("Salario");
        
        System.out.println("registerIncome");
        BigDecimal valor = n1;
        Date date = d1;
        String descriçao = dc;
        IncomeTypes Tipo = IT;
        IncomeRegisterController instance = new IncomeRegisterController();
        instance.registerIncome(valor, date, descriçao, Tipo);
        System.out.println("Valor: " + valor +"\nData: " + date + "\nDescricao: " + descriçao + "\nTipo: " + Tipo);
        // TODO review the generated test code and remove the default call to fail.
    }
}
