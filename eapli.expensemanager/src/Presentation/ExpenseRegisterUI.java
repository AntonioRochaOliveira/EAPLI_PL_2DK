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
    DefTipoPagamentoController payController;
    ExpenseRegisterController expController;
    ExpenseTypeRegisterController expTypeController;
            
    public ExpenseRegisterUI(DefTipoPagamentoController payController, ExpenseRegisterController expController,
            ExpenseTypeRegisterController expTypeController) {
        this.payController = payController;
        this.expTypeController = expTypeController;
        this.expController = expController;        
    }
    
    public void mainLoop() {
        System.out.println("* * *  Registar despesa  * * *\n");   

        
        // MOSTRAR TIPOS DE PAGAMENTO payController.listarPaymentsType()
        // MOSTRAR TIPOS DE DESPESA expTypeConroller.listarExpensesType()
        
        String what = Console.readLine("Descricao: ");
        Date date = Console.readDate("Data (01-01-1990): ");
        double value = Console.readDouble("Montante: ");
        int paymentType = Console.readInteger("Tipo de Pagamento: ");
        int paymentMethod = Console.readInteger("Meio de Pagamento: ");
        int expenseType = Console.readInteger("Tipo de Despesa: ");
        BigDecimal amount = new BigDecimal(value);
        
        expController.registerExpense(what, date, amount);
        //payController.chooseTypePayment
        //expenseController.chooseTypeExpense
        
        System.out.println("Despesa guardada.");
    }
}
