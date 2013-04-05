/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.*;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Paulo Gandra Sousa
 */
class ExpenseRegisterUI {
            
     public void mainLoop() {
        ExpenseRegisterController cont = new ExpenseRegisterController();
        System.out.println("* * *  Registar despesa  * * *\n");   
       
        System.out.println("*************************************\nTipos de Pagamento");
        // MOSTRAR TIPOS DE PAGAMENTO payController.listarPaymentsType()
        System.out.println("*************************************\n");
        System.out.println("*************************************\nTipos de Despesa");
        for(int i=0; i<cont.getTypeExpense().size(); i++) {
            System.out.println(cont.getTypeExpense().get(i).getName());
        }
                
        System.out.println("*************************************\n");
        
        String what = Console.readLine("Descricao: ");
        Date date = Console.readDate("Data (01-01-1990): ");
        double value = Console.readDouble("Montante: ");
        int paymentType = Console.readInteger("Tipo de Pagamento: ");
        int paymentMethod = Console.readInteger("Meio de Pagamento: ");
        int expenseType = Console.readInteger("Tipo de Despesa: ");
        BigDecimal amount = new BigDecimal(value);
        
        
        cont.registerExpense(what, date, amount);
        //payController.chooseTypePayment
        //expenseController.chooseTypeExpense
        
        System.out.println("Despesa guardada com sucesso!");
    }
}
