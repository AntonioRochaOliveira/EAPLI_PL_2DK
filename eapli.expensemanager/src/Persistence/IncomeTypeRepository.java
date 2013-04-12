package Persistence;

import java.util.ArrayList;
import Controllers.IncomeTypeController;
import Model.IncomeTypes;

//Eu Antonio Carvalho alterei esta classe para se tornar um singleton e adicionei o metodo getUniqueRepo()
public class IncomeTypeRepository {
    
   private static ArrayList<IncomeTypes> IncTypes =new ArrayList();
   private static IncomeTypeRepository uniqueRepo = null;
    
   public static ArrayList<IncomeTypes> getLista(){
       return IncTypes;
   }
   
   public static void addIncomeType(IncomeTypes type) throws DuplicateIncomeTypeException{
       for ( int a  = 0 ; a < IncTypes.size() ; a++ )
           if ( IncTypes.get(a) == type )
               throw new DuplicateIncomeTypeException();
       IncTypes.add(type);
   }
   
   public static IncomeTypeRepository getUniqueRepo() {
        if (uniqueRepo == null) {
            return uniqueRepo = new IncomeTypeRepository();
        } else {
            return uniqueRepo;
    }
}
}
