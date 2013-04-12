package Controllers;

import java.util.Date;
import Persistence.IncomeRepository;
import Model.Income;
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
    
    public void registerIncome(int valor, Date date, String descriçao, String Tipo) {
        Income inc = new Income( valor, date, descriçao , Tipo);      
        inco.save(inc);
    }
}
