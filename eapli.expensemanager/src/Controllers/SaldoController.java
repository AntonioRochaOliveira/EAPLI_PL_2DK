/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ContaCorrente;
import Model.Income;
import Persistence.InMemory.*;
import Persistence.IncomeRepository;
import java.util.Date;

/**
 *
 * @author TOSHIBA
 */
/* Eu Antonio , alterei a classe para usar o repositorio de rendimentos de memoria , saldo nao inicia*/
public class SaldoController {
    IncomeRepository inco;
    
    public SaldoController() {
        inco = IncomeRepositoryImpl.getUniqueRepo();
    }

    public float Saldo(){
        ContaCorrente cc = new ContaCorrente();
        float saldo;
        
        saldo=cc.getSaldo();
        return saldo;
    }
    
        public void inicializar(int valor, Date date, String descriçao, String Tipo) {
        //Income inc = new Income( valor, date, descriçao , Tipo);      
        //inco.save(inc);
    }
}
