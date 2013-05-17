/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Model.Expense;
import Model.ExpenseType;
import Model.MeioPagamento;
import Model.TipoPagamento;
import Persistence.ExpenseRepository;
import Persistence.ExpenseTypeRepository;
import Persistence.PersistenceFactory;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class MainMenu {

    public void mainLoop() {

        while (true) {
          
            System.out.println("===================");
            System.out.println("  EXPENSE MANAGER  ");
            System.out.println("===================\n");

            System.out.println("1. Registar tipos de despesa");
            System.out.println("2. Definir tipos de pagamento");
            System.out.println("3. Registar despesa");
            System.out.println("4. Registo de entrada de rendimentos");
            System.out.println("5. Definição de tipos de rendimento");
            System.out.println("6. Inicialização do saldo");
            System.out.println("7. Visualização de gasto da semana");
            System.out.println("8. Consulta de gastos mensais");
            System.out.println("9. Estabelecer poupanças");
            System.out.println("10. Definir meios de pagamento.");
            System.out.println("11. Gastos");
            System.out.println("0. Sair\n\n");
            
            int option = Console.readInteger("Escolhe uma opcao");  
            if(option==0){ 
                System.out.println("Adeus");
                break;
            }

            switch (option) {
                case 0:
                    System.out.println("Adeus");
                    break;
                case 1:
                    ExpenseTypeRegisterUI tr = new ExpenseTypeRegisterUI();
                    tr.show();                             
                    break;
                case 2:
                    DefTiposPagamentoUI tp = new DefTiposPagamentoUI();
                    tp.show();
                    break;
                case 3:
                    ExpenseRegisterUI ui = new ExpenseRegisterUI(); 
                    ui.show();
                    break;
                case 4:
                    IncomeRegisterUI rer = new IncomeRegisterUI();
                    rer.show();
                    break;
                case 5:
                    DefIncomeTypesUI dit = new DefIncomeTypesUI();
                    dit.show();
                    break;
                case 6:
                    InicializacaoSaldoUI ini = new InicializacaoSaldoUI();
                    ini.show();
                    break;
                case 7:
                    //visualizar gasto da semana
                    break;
                case 8:
                    //consulta de gasto mensal
                    break;
                case 9:
                    //estabelecer poupancas
                    break;
                case 10:
                    DefMeiosPagamentoUI mp = new DefMeiosPagamentoUI();
                    mp.show();
                    break;
                case 11:
                    GastosUI g = new GastosUI();
                    g.show();
                default:
                    break;
            }
        }
    }
}
