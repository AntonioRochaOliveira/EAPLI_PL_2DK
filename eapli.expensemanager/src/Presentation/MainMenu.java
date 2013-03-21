/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import eapli.util.Console;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class MainMenu {
    public void mainLoop() {
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
        
        System.out.println("0. Sair\n\n");
        
        
        int option = Console.readInteger("Escolhe uma opcao");
        
        switch (option) {
            case 0: 
                System.out.println("Adeus");
                break;
            case 1: 
                //regista tipo de despesa
                break;
            case 2:
                //define tipos de pagamento
                break;
                 case 3: 
                ExpenseRegisterUI ui = new ExpenseRegisterUI();
                ui.mainLoop();
                break;
                case 4: 
                //Registo de entrada de rendimentos
                break;
                case 5: 
                //DEf de tipos de rendimento
                break;
                case 6: 
                //inicializa saldo
                break;
                case 7: 
                //visualizar gasto da semana
                break;
                case 8: 
                //consulta de gasto mensal
                break;
                default:
                    break;           
        }
    }
}
