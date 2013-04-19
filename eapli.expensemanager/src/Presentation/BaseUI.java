package Presentation;

import Controllers.BaseController;

public class BaseUI {

    BaseController BaseContr = new BaseController();

    public BaseUI() {
    }

    public void displaySaldo() {
        System.out.println("Saldo corrente: " + BaseContr.getSaldo());
    }
}
