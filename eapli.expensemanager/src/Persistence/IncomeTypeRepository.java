package Persistence;

import java.util.ArrayList;
import Controllers.IncomeTypeController;
import Model.IncomeTypes;


public class IncomeTypeRepository {
    
    private static ArrayList<IncomeTypes> IncTypes = new ArrayList();
    
   public static ArrayList<IncomeTypes> getLista(){
       return IncTypes;
   }
   
   public static void addIncomeType(IncomeTypes type) throws DuplicateIncomeTypeException{
       for ( int a  = 0 ; a < IncTypes.size() ; a++ )
           if ( IncTypes.get(a) == type )
               throw new DuplicateIncomeTypeException();
       IncTypes.add(type);
   }
}
