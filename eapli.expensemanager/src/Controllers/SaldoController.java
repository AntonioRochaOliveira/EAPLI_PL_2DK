/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ContaCorrente;

/**
 *
 * @author TOSHIBA
 */
public class SaldoController {
    
    
    public SaldoController() {
    }

    public float Saldo(){
        ContaCorrente cc=new ContaCorrente();
        float saldo;
        
        saldo=cc.getSaldo();
        return saldo;
    }
}
