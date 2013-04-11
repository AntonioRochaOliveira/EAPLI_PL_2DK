/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.DefTipoPagamentoController;
import Controllers.ExpenseRegisterController;
import Controllers.ExpenseTypeRegisterController;
import Model.Expense;
import Model.ExpenseType;
import Persistence.ExpenseRepository;
import Persistence.ExpenseTypeRepository;
import eapli.util.Console;
import java.util.List;

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
            System.out.println("0. Sair\n\n");


            int option = Console.readInteger("Escolhe uma opcao");

            switch (option) {
                case 0:
                    System.out.println("Adeus");
                    break;
                case 1:
                    ExpenseTypeRegisterUI tr = new ExpenseTypeRegisterUI();
                    tr.mainLoop();
                              
                    break;
                case 2:
                    //DefTipoPagamentoUI tp = new DefTipoPagamentoUI();
                    //tp.mainLoop();
                    break;
                case 3:
                    ExpenseRegisterUI ui = new ExpenseRegisterUI();
                    ui.mainLoop();
                    break;
                case 4:
                    IncomeRegisterUI rer = new IncomeRegisterUI();
                    rer.mainLoop();
                    break;
                case 5:
                    DefIncomeTypesUI dit = new DefIncomeTypesUI();
                    dit.mainLoop();
                    break;
                case 6:
                   // VisualizacaoSaldoUI vis = new VisualizacaoSaldoUI();
                   // vis.mainLoop();
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
                    //definir meios de pagamento
                default:
                    break;
            }
        }
    }
}
