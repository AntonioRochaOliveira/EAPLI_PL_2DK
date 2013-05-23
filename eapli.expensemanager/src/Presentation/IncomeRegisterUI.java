/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.*;
import Model.IncomeTypes;
import Persistence.IncomeRepository;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Antonio
 */
public class IncomeRegisterUI extends BaseUI{
    IncomeTypeController irt;
    IncomeRepository irp;
    private String title = "Registar tipos de rendimentos";
    private IncomeRegisterController cont2 = new IncomeRegisterController();

    @Override
    public BaseController getController() {
        return cont2;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void showBody() {
        
        System.out.println("* * *  REGISTER AN INCOME  * * *\n");
        int valor = Console.readInteger("Income Value:");
        BigDecimal amount = new BigDecimal(valor);
        Date date = Console.readDate("Date:");
        String descriçao = Console.readLine("Description:");
        String abc = Console.readLine("Tipos de Rendimento:\n 1- Cheque \n 2- Salario \n 3- Outro");
        int b = Integer.parseInt(abc);
        if (b==1){
            String TipoInc = "Cheque";
            IncomeTypes Tipo = new IncomeTypes(TipoInc);
            IncomeRegisterController controller = new IncomeRegisterController();
            controller.registerIncome(amount, date, descriçao, Tipo);
        }
        if (b==2){
            String TipoInc  = "Cheque";
            IncomeTypes Tipo = new IncomeTypes(TipoInc);
            IncomeRegisterController controller = new IncomeRegisterController();
            controller.registerIncome(amount, date, descriçao, Tipo);
        }
        if (b==3){
            String TipoInc  = "Outro";   
            IncomeTypes Tipo = new IncomeTypes(TipoInc);
            IncomeRegisterController controller = new IncomeRegisterController();
            controller.registerIncome(amount, date, descriçao, Tipo);
        }  

        System.out.println("Income recorded.");
    }
}
