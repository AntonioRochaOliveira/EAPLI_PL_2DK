package Controllers;

import java.util.Date;
import Persistence.IncomeRepository;
import Persistence.InMemory.*;
import Model.Income;
import Model.IncomeTypes;
import Persistence.PersistenceFactory;
import java.math.BigDecimal;
/**
 *
 * @author Antonio
 */

//Eu Pedro Passo alterei esta classe para ter acesso a alguns metodos que nao estava a conseguir
//nomeadamente aceder ao repositorio
/* Eu Antonio , alterei a classe para usar o repositorio de rendimentos de memoria , saldo nao inicia*/
public class IncomeRegisterController extends BaseController{
    public IncomeRegisterController() {
//        inco = IncomeRepositoryImpl.getUniqueRepo();
   }
    
    public void registerIncome(BigDecimal amount, Date date, String descriçao, IncomeTypes Tipo) {
        IncomeRepository ir = PersistenceFactory.buildPersistenceFactory().IncomeRepository();
        
        Income inc = new Income(amount, date, descriçao, Tipo);      
        ir.save(inc);
    }
}
