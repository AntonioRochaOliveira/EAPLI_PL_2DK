package Controllers;

import Model.Saving;
import Persistence.DuplicateSavingException;
import java.util.ArrayList;
import Persistence.SavingRepository;

public class StablishSavingController extends BaseController{
    public static void stablishSaving( String nome , double valor , String descricao ) throws DuplicateSavingException{
        Saving tmp = new Saving( nome , valor , descricao );
        addSaving( tmp );
    }
    
    public static void addSaving( Saving toAdd ) throws DuplicateSavingException{
        SavingRepository.addSaving( toAdd );
    }
    
    public static ArrayList<Saving> getList(){
        return SavingRepository.getList();
    }
}
