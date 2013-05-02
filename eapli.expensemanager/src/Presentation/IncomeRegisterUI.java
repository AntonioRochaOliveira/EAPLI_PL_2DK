/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.IncomeRegisterController;
import Controllers.IncomeTypeController;
import Model.IncomeTypes;
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
        BigDecimal amount = new BigDecimal(valor);
        Date date = Console.readDate("Date:");
        String descriçao = Console.readLine("Description:");
        String TipoInc = Console.readLine("Type of Income:");
        IncomeTypes Tipo = new IncomeTypes(TipoInc);
        IncomeRegisterController controller = new IncomeRegisterController();
        controller.registerIncome(amount, date, descriçao, Tipo);
        
        System.out.println("Income recorded.");
    }
}
