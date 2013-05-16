package Persistence.JPA;

import Model.IncomeTypes;
import Persistence.DuplicateIncomeTypeException;
import Persistence.IncomeTypeRepository;
import java.util.ArrayList;
import java.util.List;

public class IncomeTypeRepositoryImpl extends JpaRepository<IncomeTypes, String> implements IncomeTypeRepository{
   //private static List<IncomeTypes> IncTypes = new ArrayList<IncomeTypes>();
   //private static IncomeTypeRepository uniqueRepo = null;
    
   public List<IncomeTypes> getLista(){
       List<IncomeTypes> IncTypes = super.all();
       return IncTypes;
   }
   
   public void addIncomeType(IncomeTypes type) throws DuplicateIncomeTypeException{
       List<IncomeTypes> IncTypes = getLista();
       for ( int a  = 0 ; a < IncTypes.size() ; a++ )
           if ( IncTypes.get(a) == type )
               throw new DuplicateIncomeTypeException();
       super.save( type );
   }
   
   public static IncomeTypeRepository getUniqueRepo() {
        //if (uniqueRepo == null) {
        //    return uniqueRepo = new IncomeTypeRepositoryImpl();
        //} else {
        //    return uniqueRepo;
        //}
       return null;
    }
}