/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.*;
import Persistence.IncomeRepository;
import Model.IncomeTypes;

import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

public class InicializacaoSaldoUI extends BaseUI{
    
    IncomeRepository irp;
    
    public void mainLoop() {
        
        System.out.println("* * *  Inicializar Saldo  * * *\n");
        displaySaldo();
        
        int valorS = Console.readInteger("Inserir valor:");
        BigDecimal amount = new BigDecimal(valorS);
        Date data = Console.readDate("Data:");
        String descricao = Console.readLine("Descricao:");  
        IncomeTypes tipoS = new IncomeTypes("Saldo");
        
        InitSaldoController controladorSaldo = new InitSaldoController();
        controladorSaldo.inicializar(amount, data, descricao, tipoS);
        System.out.println("Saldo inicializado com o valor: "+valorS+".\n");
    }
}