package Controllers;

import Model.Expense;
import Persistence.ExpenseRepository;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class ExportarController {
    
    
    public static void exportarGastosCSV( String nome , Date data1 , Date data2 ) throws IOException{
        FileWriter ficheiro = new FileWriter( nome );
        BufferedWriter output = new BufferedWriter( ficheiro );
        
        List<Expense> gastos = ExpenseRepository.getUniqueRepo().getListExpense();
        
        for ( int i = 0 ; i < gastos.size() ; i++ ) {
            output.write( gastos.get(i).getDescricao() + "\n" );
        }
        
        //output.write("Hello Java\n");
        output.close();
     }
     
     public static void exportarReceitasCSV( String nome , Date data1 , Date data2 ){
         
     }
    
}
