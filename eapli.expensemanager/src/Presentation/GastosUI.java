/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.GastosController;
import eapli.util.Console;

/**
 *
 * @author i110558
 */
public class GastosUI extends BaseUI {

    public GastosUI() {
    }

    public void mainLoop() {
        GastosController cont = new GastosController();
        System.out.println("* * *  Gastos  * * *");
        System.out.println("1 - Gasto do mes anterior;");
        System.out.println("2 - Gasto do mes actual;");
        System.out.println("3 - Gasto da semana anterior;");
        System.out.println("4 - Gasto da semana actual;");
        System.out.println("0 - Sair;");
        int opc = Console.readInteger("Opcao: ");
        switch (opc) {
            case 1:
                System.out.println("Gasto do Mes Anterior: "+cont.GastosMensalAnterior()+"€");
                break;
            case 2:
                System.out.println("Gasto do Mes Actual: "+cont.GastosMensalActual()+"€");
                break;
            case 3:
                System.out.println("Gasto da Semana Anterior: "+cont.GastosSemanalAnterior()+"€");
                break;
            case 4:
                System.out.println("Gasto da Semana Actual: "+cont.GastosSemanalActual()+"€");
                break;
            case 0:                
                break;
            default:
                break;
        }



    }
}
