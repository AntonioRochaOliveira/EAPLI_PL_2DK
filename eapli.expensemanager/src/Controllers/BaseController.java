/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ContaCorrente;

/**
 *
 * @author Joao
 */
public class BaseController {
    ContaCorrente contaCorr=new ContaCorrente();
    public BaseController() {
    }
    
    public float getSaldo(){
        return contaCorr.getSaldo();
    }
}
