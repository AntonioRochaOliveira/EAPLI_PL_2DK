package Controllers;

import Model.Saving;
import java.util.ArrayList;
import Persistence.SavingRepository;

public class StablishSavingController {
    public static void stablishSaving( String nome , double valor , String descricao ){
        Saving tmp = new Saving( nome , valor , descricao );
        addSaving( tmp );
    }
    
    public static void addSaving( Saving toAdd ){
        SavingRepository.addSaving( toAdd );
    }
    
    public static ArrayList<Saving> getList(){
        return SavingRepository.getList();
    }
}
