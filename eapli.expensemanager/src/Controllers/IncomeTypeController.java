package Controllers;

import Persistence.IncomeTypeRepository;
import Model.IncomeTypes;
import Persistence.DuplicateIncomeTypeException;
import Persistence.PersistenceFactory;
import java.util.List;

//Eu Antonio Carvalho alterei esta classe para ter acesso a alguns metodos que nao estava a conseguir
//nomeadamente aceder ao repositorio
public class IncomeTypeController extends BaseController {
    IncomeTypeRepository inct = PersistenceFactory.buildPersistenceFactory().IncomeTypeRepository();
    
    /*public IncomeTypeController() {
        inct = IncomeTypeRepository.getUniqueRepo();
    }*/
    
    public void createIncomeType(String IncomeTypeString) throws DuplicateIncomeTypeException{
        IncomeTypes IncType = new IncomeTypes(IncomeTypeString);
        addIncomeType( IncType );
    }
    
    public void addIncomeType( IncomeTypes IncType ) throws DuplicateIncomeTypeException{
        inct.addIncomeType( IncType );
    }
    
    public List<IncomeTypes> getLista(){
        return inct.getLista();
    }
}
