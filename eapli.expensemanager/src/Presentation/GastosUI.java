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

    public GastosUI() {
    }

    public void mainLoop() {
        GastosController cont = new GastosController();
        System.out.println("* * *  Gastos  * * *");
        System.out.println("Gasto do mes anterior: "+cont.GastosMensalAnterior()+"€");
        System.out.println("Gasto do mes actual: "+cont.GastosMensalActual()+"€");
        System.out.println("Gasto da semana anterior: "+cont.GastosSemanalAnterior()+"€");
        System.out.println("Gasto da semana actual: "+cont.GastosSemanalActual()+"€");
        new java.util.Scanner(System.in).nextLine();

    }

    @Override
    public BaseController getController() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getTitle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void showBody() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
