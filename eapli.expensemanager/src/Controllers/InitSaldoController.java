/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ContaCorrente;
import Model.Income;
import Model.IncomeTypes;
import Persistence.IncomeRepository;
import java.math.BigDecimal;
import java.util.Date;
import Model.IncomeTypes;


/*alteracao da classe InitSaldoController , pois era necessario a reformulação da mesma 
 * e o grupo responsável nao estava presente.
 * 
 * Paulo Monteiro 1110255
*/

public class InitSaldoController  extends BaseController{
    IncomeRepository inco;
    IncomeTypes tipoS;
    
    public InitSaldoController() {
        inco = IncomeRepository.getUniqueRepo();
    }
    
        public void inicializar(BigDecimal valor, Date date, String descriçao, IncomeTypes Tipo) {
        Income inc = new Income(valor, date, descriçao, tipoS);      
        inco.save(inc);
    }
}
