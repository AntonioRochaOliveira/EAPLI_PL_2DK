package Controllers;

import java.util.Date;
import Persistence.IncomeRepository;
import Model.Income;
import Model.IncomeTypes;
import java.math.BigDecimal;
/**
 *
 * @author Antonio
 */

//Eu Pedro Passo alterei esta classe para ter acesso a alguns metodos que nao estava a conseguir
//nomeadamente aceder ao repositorio
public class IncomeRegisterController extends BaseController{
    IncomeRepository inco;
    
    
    public IncomeRegisterController() {
        inco = IncomeRepository.getUniqueRepo();
    }
    
    public void registerIncome(BigDecimal valor, Date date, String descriçao, IncomeTypes Tipo) {
        Income inc = new Income(valor, date, descriçao, Tipo);      
        inco.save(inc);
    }
}
