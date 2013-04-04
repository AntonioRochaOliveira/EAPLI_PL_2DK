/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseTypeRegisterController;

import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Paulo Gandra Sousa
 */
class ExpenseTypeRegisterUI {
    public void mainLoop() {
        System.out.println("* * *  Registar tipos de despesa  * * *\n");
        
        String name = Console.readLine("nome: ");
       
        
        ExpenseTypeRegisterController controller = new ExpenseTypeRegisterController();
        controller.registerTypeExpense(name);
        
        System.out.println("Tipo de despesa guardada.");
    }
}
