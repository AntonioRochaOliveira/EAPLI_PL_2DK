package Persistence.InMemory;

import Model.IncomeTypes;
import Persistence.DuplicateIncomeTypeException;
import Persistence.IncomeTypeRepository;
import java.util.ArrayList;
import java.util.List;

public class IncomeTypeRepositoryImpl implements IncomeTypeRepository{
   private static List<IncomeTypes> IncTypes = new ArrayList<IncomeTypes>();
   private static IncomeTypeRepository uniqueRepo = null;
    
   public List<IncomeTypes> getLista(){
       return IncTypes;
   }
   
   public void addIncomeType(IncomeTypes type) throws DuplicateIncomeTypeException{
       for ( int a  = 0 ; a < IncTypes.size() ; a++ )
           if ( IncTypes.get(a) == type )
               throw new DuplicateIncomeTypeException();
       IncTypes.add(type);
   }
   
   public static IncomeTypeRepository getUniqueRepo() {
        if (uniqueRepo == null) {
            return uniqueRepo = new IncomeTypeRepositoryImpl();
        } else {
            return uniqueRepo;
        }
    }
}