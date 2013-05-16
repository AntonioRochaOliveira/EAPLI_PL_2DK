package Presentation;

import Controllers.BaseController;
import Controllers.ExportarController;
import eapli.util.Console;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExportarCSVUI extends BaseUI {

    ExportarController exp = new ExportarController();
    
    public BaseController getController(){
        return exp;
    }
    public String getTitle(){
        return "EXPORTAR PARA CSV";
    }
    public void showBody(){
       mainLoop();
    }
    
    public void mainLoop() {
        String nome = Console.readLine("Nome do ficheiro a exportar:");
        while ( nome == "" )
                Console.readLine("Nome inválido! Introduza outro:");
        nome += ".csv";
        
        Date data1 = Console.readDate("Data de início:");
        Date data2 = Console.readDate("Data de fim:");

        System.out.println("\nA exportar gastos...");
        try {
            exp.exportarGastosCSV( nome , data1 , data2 );
        } catch (IOException ex) {
            System.out.println(" - erro de ficheiro");
        }

//        System.out.println("A exportar receitas...");
//        try {
//            exp.exportarReceitasCSV( nome , data1 , data2 );
//        } catch (IOException ex) {
//            System.out.println(" - erro de ficheiro");
//        }

        System.out.println("Exportado!");
    }
}
