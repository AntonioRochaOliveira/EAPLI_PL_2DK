package Persistence.InMemory;

import Model.Saving;
import Persistence.DuplicateSavingException;
import Persistence.SavingRepository;
import java.util.ArrayList;
import java.util.List;

public class SavingRepositoryImpl implements SavingRepository{
    private static List<Saving> savings = new ArrayList<Saving>();
    private static SavingRepository uniqueRepo = null;
    
    public List<Saving> getLista(){
        return savings;
    }
    
    public void addSaving(Saving sav) throws DuplicateSavingException {
        for (int a = 0; a < savings.size(); a++)
            if (savings.get(a) == sav)
                throw new DuplicateSavingException();
        savings.add(sav);
    }
    
    public static SavingRepository getUniqueRepo() {
        if (uniqueRepo == null) {
            return uniqueRepo = new SavingRepositoryImpl();
        } else {
            return uniqueRepo;
        }
    }
}
