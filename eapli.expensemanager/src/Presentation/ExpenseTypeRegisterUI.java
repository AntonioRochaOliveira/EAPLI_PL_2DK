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
class ExpenseTypeRegisterUI extends BaseUI{
    public void mainLoop() {
        System.out.println("* * *  Registar tipos de despesa  * * *\n");
        
        boolean invalido=true;
        
        do{
        
        String name = Console.readLine("nome: ");
       
        
        ExpenseTypeRegisterController controller = new ExpenseTypeRegisterController();
        try{
             controller.registerTypeExpense(name);
             invalido=false;
        }catch(IllegalArgumentException e){
            System.out.println("Nome inválido!");
        }
        }while(invalido);
        
        System.out.println("Tipo de despesa guardada.");
    }
}
