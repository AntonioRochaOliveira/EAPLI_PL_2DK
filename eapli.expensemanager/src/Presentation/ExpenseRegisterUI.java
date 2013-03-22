/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.*;

import eapli.util.Console;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Paulo Gandra Sousa
 */
class ExpenseRegisterUI {
    public void mainLoop() {
        System.out.println("* * *  Registar despesa  * * *\n");
        
        DefTipoPagamentoController payController = new DefTipoPagamentoController();
        ExpenseRegisterController expController = new ExpenseRegisterController();
        ExpenseTypeRegisterController expTypeController = new ExpenseTypeRegisterController();
        
        // MOSTRAR TIPOS DE PAGAMENTO
        // MOSTRAR TIPOS DE DESPESA
        
        String what = Console.readLine("Descricao: ");
        Date date = Console.readDate("Data (01-01-1990): ");
        double value = Console.readDouble("Montante: ");
        int paymentType = Console.readInteger("Tipo de Pagamento: ");
        int paymentMethod = Console.readInteger("Meio de Pagamento: ");
        int expenseType = Console.readInteger("Tipo de Despesa: ");
        BigDecimal amount = new BigDecimal(value);
        
        expController.registerExpense(what, date, amount);
        
        System.out.println("Despesa guardada.");
    }
}
