package Persistence.JPA;

import Model.Saving;
import Persistence.DuplicateSavingException;
import Persistence.SavingRepository;
import java.util.ArrayList;
import java.util.List;

public class SavingRepositoryImpl extends JpaRepository<Saving, String> implements SavingRepository{
    public List<Saving> getLista(){
        List<Saving> savings = super.all();
        return savings;
    }
    
    public void addSaving(Saving sav) throws DuplicateSavingException {        
       List<Saving> savings = getLista();
       for ( int a  = 0 ; a < savings.size() ; a++ )
           if ( savings.get(a) == sav )
               throw new DuplicateSavingException();
       super.save( sav );
    }
    
    public static SavingRepository getUniqueRepo() {
        //if (uniqueRepo == null) {
        //    return uniqueRepo = new SavingRepositoryImpl();
        //} else {
        //    return uniqueRepo;
        //}
        return null;
    }
}
