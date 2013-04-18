package Persistence;
import Model.Saving;
import java.util.ArrayList;
public class SavingRepository {
    
    private static ArrayList<Saving> Savings =new ArrayList();
    private static SavingRepository uniqueRepo = null;

    public static void addSaving(Saving sav) throws DuplicateSavingException {
        for ( int a  = 0 ; a < Savings.size() ; a++ )
           if ( Savings.get(a) == sav )
               throw new DuplicateSavingException();
       Savings.add( sav );
    }
    
    public static ArrayList<Saving> getList(){
        return null;
    }
    
    public static SavingRepository getUniqueRepo() {
        if (uniqueRepo == null) {
            return uniqueRepo = new SavingRepository();
        } else {
            return uniqueRepo; 
        }
    }
        
}