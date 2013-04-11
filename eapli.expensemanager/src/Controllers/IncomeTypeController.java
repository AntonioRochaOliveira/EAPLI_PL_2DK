package Controllers;

import Persistence.IncomeTypeRepository;
import java.util.ArrayList;
import Model.IncomeTypes;

public class IncomeTypeController {
    
    public static boolean createIncomeType(String IncomeTypeString){
        ArrayList<IncomeTypes> lista = getLista();
        for (int i = 0; i < lista.size(); i++) {
            if( ((IncomeTypes) (lista.get(i))).getIncomeType().equals( IncomeTypeString ) ){
                return false;
            }
        }
        
        IncomeTypes IncType=new IncomeTypes(IncomeTypeString);
        addIncomeType(IncType);
        return true;
    }
    
    public static void addIncomeType(IncomeTypes IncType){
        IncomeTypeRepository.addIncomeType(IncType);
    }
    
    public static ArrayList<IncomeTypes> getLista(){
        return IncomeTypeRepository.getLista();
    }
}
