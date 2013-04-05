package Persistence;

import java.util.ArrayList;
import Controllers.IncomeTypeController;
import Model.IncomeTypes;


public class IncomeTypeRepository {
    
    private static ArrayList IncTypes =new ArrayList();
    
   public static ArrayList getLista(){
       return IncTypes;
   }
   
   public static void addIncomeType(IncomeTypes type){
       IncTypes.add(type);
   }
}
