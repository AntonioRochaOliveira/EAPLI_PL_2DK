package Presentation;

import Controllers.ExportarController;
import eapli.util.Console;
import java.util.Date;

public class ExportarCSVUI extends BaseUI{
    ExportarController exp = new ExportarController();
    
    public void mainLoop(){
        System.out.println("");
        
        displaySaldo();
        System.out.println( "* * *  EXPORTAR PARA CSV  * * *\n" );
        
        String nome = Console.readLine( "Nome do ficheiro a exportar:" );
        Date data1 = Console.readDate( "Data de início:" );
        Date data2 = Console.readDate( "Data de fim:" );
        
        System.out.println( "\nA exportar gastos..." );
        //exp.exportarGastosCSV( nome , data1 , data2 );
        
        System.out.println( "\nA exportar receitas..." );
        exp.exportarReceitasCSV( nome , data1 , data2 );
        
        System.out.println( "\nExportado!" );
    }
}
