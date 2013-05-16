package Controllers;

import Model.Saving;
import Persistence.DuplicateSavingException;
import Persistence.PersistenceFactory;
import java.util.List;
import Persistence.SavingRepository;

public class StablishSavingController extends BaseController{
    SavingRepository savings = PersistenceFactory.buildPersistenceFactory().SavingRepository();
    
    public void stablishSaving( String nome , double valor , String descricao ) throws DuplicateSavingException{
        Saving tmp = new Saving( nome , valor , descricao );
        addSaving( tmp );
    }
    
    public void addSaving( Saving toAdd ) throws DuplicateSavingException{
        savings.addSaving( toAdd );
    }
    
    public List<Saving> getLista(){
        return savings.getLista();
    }
}
