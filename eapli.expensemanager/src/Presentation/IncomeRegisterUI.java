/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.IncomeRegisterController;
import Controllers.IncomeTypeController;
import Persistence.IncomeRepository;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Antonio
 */
public class IncomeRegisterUI {
    IncomeTypeController irt;
    IncomeRepository irp;
    
    public void mainLoop() {
        System.out.println("* * *  REGISTER AN INCOME  * * *\n");
        int valor = Console.readInteger("Income Value:");
        Date date = Console.readDate("Date:");
        String descriçao = Console.readLine("Description:");
        String Tipo = Console.readLine("Type of Income:");
        IncomeRegisterController controller = new IncomeRegisterController();
        controller.registerIncome(BigDecimal.ZERO, date, descriçao, Tipo);
        
        System.out.println("Income recorded.");
    }
}
