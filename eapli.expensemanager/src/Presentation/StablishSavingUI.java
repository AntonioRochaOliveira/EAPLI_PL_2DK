package Presentation;

import Model.Saving;
import eapli.util.Console;
import java.util.ArrayList;
import Controllers.StablishSavingController;

public class StablishSavingUI {
    StablishSavingController cn = new StablishSavingController();
    
    public void mainLoop(){
        System.out.println( "* * *  NOVO OBJECTIVO DE POUPANÇA  * * *\n" );
        
        ArrayList<Saving> lista = cn.getList();
        if ( lista.size() != 0 ){
            System.out.println( "Objectivos de poupança já existentes:" );
            for ( int a = 0 ; a < lista.size() ; a++ ){
                System.out.println( " - " + lista.get(a).getNome() + ";");
            }
        }
        
        String input = Console.readLine( "Nome do objectivo a criar - deixar em branco para anular" );
        if ( !input.equals( "" ) ){
            double valor = Console.readDouble( "Valor" );
            String desc = Console.readLine( "Descrição [opcional]" );
            cn.stablishSaving( input , valor , desc );
        }
    }
}
