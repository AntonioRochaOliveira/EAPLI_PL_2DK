package Controllers;

import Persistence.IncomeTypeRepository;
import java.util.ArrayList;
import Model.IncomeTypes;

public class IncomeTypeController {
    
    public static void createIncomeType(String IncomeTypeString){
        IncomeTypes IncType=new IncomeTypes(IncomeTypeString);
        addIncomeType(IncType);
    }
    
    public static void addIncomeType(IncomeTypes IncType){
        IncomeTypeRepository.addIncomeType(IncType);
    }
    
    public static ArrayList getLista(){
        return IncomeTypeRepository.getLista();
    }
}
