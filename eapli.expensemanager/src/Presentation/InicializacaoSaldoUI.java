/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.*;
import Persistence.IncomeRepository;

import eapli.util.Console;
import java.util.Date;

public class InicializacaoSaldoUI extends BaseUI{
    
    IncomeRepository irp;
    
    public void mainLoop() {
        
        System.out.println("* * *  Inicializar Saldo  * * *\n");
        displaySaldo();
        int valorS = Console.readInteger("Inserir valor:");
        Date data = Console.readDate("Data:");
        String descricao = Console.readLine("Descricao:");  
        String tipo = "Saldo";
        SaldoController controladorSaldo = new SaldoController();
        controladorSaldo.inicializar(valorS, data, descricao, tipo);
        
        System.out.println("Saldo inicializado com o valor: "+valorS+".\n");
    }
}
