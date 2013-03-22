/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseRegisterController;

import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Paulo Gandra Sousa
 */
class ExpenseRegisterUI {
    public void mainLoop() {
        System.out.println("* * *  Registar despesa  * * *\n");
        
        String what = Console.readLine("Descricao:");
        Date date = Console.readDate("Data:");
        double value = Console.readDouble("Montante:");
        BigDecimal amount = new BigDecimal(value);
        
        ExpenseRegisterController controller = new ExpenseRegisterController();
        controller.registerExpense(what, date, amount);
        
        System.out.println("Despesa guardada.");
    }
}
