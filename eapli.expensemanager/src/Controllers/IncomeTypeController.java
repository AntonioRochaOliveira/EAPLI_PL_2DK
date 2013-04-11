package Controllers;

import Persistence.IncomeTypeRepository;
import java.util.ArrayList;
import Model.IncomeTypes;

public class IncomeTypeController {
    
    public static void createIncomeType(String IncomeTypeString){
        ArrayList<IncomeTypes> lista = getLista();
        for (int i = 0; i < lista.size(); i++) {
            if( ((IncomeTypes) (lista.get(i))).getIncomeType().equals( IncomeTypeString ) ){
                return;
            }
        }
        
        IncomeTypes IncType=new IncomeTypes(IncomeTypeString);
        addIncomeType(IncType);
    }
    
    public static void addIncomeType(IncomeTypes IncType){
        IncomeTypeRepository.addIncomeType(IncType);
    }
    
    public static ArrayList<IncomeTypes> getLista(){
        return IncomeTypeRepository.getLista();
    }
}
