package Controllers;

import Persistence.IncomeTypeRepository;
import java.util.ArrayList;
import Model.IncomeTypes;
import Persistence.DuplicateIncomeTypeException;

public class IncomeTypeController {
    
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
