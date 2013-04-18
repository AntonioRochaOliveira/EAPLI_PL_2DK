package Controllers;

import Persistence.IncomeTypeRepository;
import java.util.ArrayList;
import Model.IncomeTypes;
import Persistence.DuplicateIncomeTypeException;

//Eu Antonio Carvalho alterei esta classe para ter acesso a alguns metodos que nao estava a conseguir
//nomeadamente aceder ao repositorio
public class IncomeTypeController {
    IncomeTypeRepository inct;
    
    public IncomeTypeController() {
        inct = IncomeTypeRepository.getUniqueRepo();
    }
    
    public static void createIncomeType(String IncomeTypeString) throws DuplicateIncomeTypeException{
        IncomeTypes IncType = new IncomeTypes(IncomeTypeString);
        addIncomeType( IncType );
    }
    
    public static void addIncomeType( IncomeTypes IncType ) throws DuplicateIncomeTypeException{
        IncomeTypeRepository.addIncomeType( IncType );
    }
    
    public static ArrayList<IncomeTypes> getLista(){
        return IncomeTypeRepository.getLista();
    }
}
