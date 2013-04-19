/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.GastosController;

/**
 *
 * @author i110558
 */
public class GastosUI {
    public GastosUI() {}
    
    public void mainLoop() {
        GastosController cont = new GastosController();
        System.out.println("TESTE: "+cont.GastosMensalActual());
    }
}
