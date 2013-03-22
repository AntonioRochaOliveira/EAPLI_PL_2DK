package Presentation;

import eapli.util.Console;
import java.util.ArrayList;

import Controllers.IncomeTypeController;

public class DefIncomeTypesUI {
    IncomeTypeController IncTC = new IncomeTypeController();
    
    public void mainLoop(){
        System.out.println( "* * *  NOVO TIPO DE RENDIMENTO  * * *\n" );
        
        ArrayList lista = IncTC.getLista();
        if ( lista.size() != 0 ){
            System.out.println( "Tipos de rendimentos já existentes:" );
            for ( int a = 0 ; a < lista.size() ; a++ ){
                System.out.println( " - " + lista.get(a).toString() + ";");
            }
        }
    }
    
    public static void main( String[] args ){
        DefIncomeTypesUI test = new DefIncomeTypesUI();
        test.mainLoop();
    }
}
