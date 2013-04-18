/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;

/**
 *
 * @author Joao
 */
public class BaseUI {

    BaseController BaseContr = new BaseController();

    public BaseUI() {
    }

    public void displaySaldo() {
        System.out.println("Saldo corrente: " + BaseContr.getSaldo());
    }
}
