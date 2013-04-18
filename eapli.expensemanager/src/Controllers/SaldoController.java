/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ContaCorrente;
import Model.Income;
import Persistence.IncomeRepository;
import java.util.Date;

/**
 *
 * @author TOSHIBA
 */
public class SaldoController {
    IncomeRepository inco;
    
    public SaldoController() {
        inco = IncomeRepository.getUniqueRepo();
    }

    public float Saldo(){
        ContaCorrente cc=new ContaCorrente();
        float saldo;
        
        saldo=cc.getSaldo();
        return saldo;
    }
    
        public void inicializar(int valor, Date date, String descriçao, String Tipo) {
        //Income inc = new Income( valor, date, descriçao , Tipo);      
        //inco.save(inc);
    }
}
