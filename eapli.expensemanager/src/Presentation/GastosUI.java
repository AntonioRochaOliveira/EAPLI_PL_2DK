/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.GastosController;
import eapli.util.Console;

/**
 *
 * @author i110558
 */
public class GastosUI extends BaseUI {
    private String title = "Gastos mensais e semanais";
    private GastosController cont = new GastosController();

    public GastosUI() {
    }

    @Override
    public BaseController getController() {
        return cont;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void showBody() {        
        System.out.println("* * *  Gastos  * * *");
        System.out.println("Gasto do mes anterior: "+cont.GastosMensalAnterior()+"€");
        System.out.println("Gasto do mes actual: "+cont.GastosMensalActual()+"€");
        System.out.println("Gasto da semana anterior: "+cont.GastosSemanalAnterior()+"€");
        System.out.println("Gasto da semana actual: "+cont.GastosSemanalActual()+"€");
        new java.util.Scanner(System.in).nextLine();
    }
}
