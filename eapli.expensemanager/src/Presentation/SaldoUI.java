/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.SaldoController;

/**
 *
 * @author TOSHIBA
 */
public class SaldoUI {
    
    public void mostraSaldo(){
    
        SaldoController sc=new SaldoController();

        System.out.println ("Saldo Atual: " + sc.Saldo());
    }
}
