package Controllers;

import java.util.Date;
import Persistence.IncomeRepository;
import Model.Income;
import Model.Movimentos;
import java.math.BigDecimal;
/**
 *
 * @author Antonio
 */

//Eu Pedro Passo alterei esta classe para ter acesso a alguns metodos que nao estava a conseguir
//nomeadamente aceder ao repositorio
public class IncomeRegisterController {
    IncomeRepository inco;
    
    
    public IncomeRegisterController() {
        inco = IncomeRepository.getUniqueRepo();
    }
    
    public void newincome(){
        
    }
    
    public void registerIncome(BigDecimal valor, Date date, String descriçao, String Tipo) {
        Movimentos inc = new Income(valor, date, descriçao, null);      
        //inco.save(inc);
    }
}
