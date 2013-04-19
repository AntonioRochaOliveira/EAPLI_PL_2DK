/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.ExpenseTypeRegisterController;

import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Paulo Gandra Sousa
 */
class ExpenseTypeRegisterUI extends BaseUI{
    
    private String title = "Registar tipos de despesa";
    private ExpenseTypeRegisterController controller = new ExpenseTypeRegisterController();
    
    public void ShowBody() {
         boolean invalido =true;
         do{
           String name = Console.readLine("nome: ");  
           try{
               controller.registerTypeExpense(name);  
               invalido =false;
           }catch(IllegalArgumentException e){
               System.out.println("Nome Invalido!");
           }
        }while(invalido);
       System.out.println("Tipo de despesa guardada.");
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the controller
     */
    public BaseController getController() {
        return controller;
    }
}
