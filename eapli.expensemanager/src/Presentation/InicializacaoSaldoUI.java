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

/*alteracao da classe InicializacaoSaldoUI , pois era necessario a reformulação da mesma 
 * e o grupo responsável nao estava presente.
 * 
 * Paulo Monteiro 1110255
*/

public class InicializacaoSaldoUI extends BaseUI{
    
     IncomeRepository irp;
     private String title = "Inicializar Saldo";
     private InitSaldoController controlador = new InitSaldoController();
    
    public void showBody() {
        
        int valorS = Console.readInteger("Inserir valor:");
        BigDecimal amount = new BigDecimal(valorS);
        Date data = Console.readDate("Data:");
        String descricao = Console.readLine("Descricao:");  
        IncomeTypes tipoS = new IncomeTypes("Saldo");
        
        
        controlador.inicializar(amount, data, descricao, tipoS);
        System.out.println("Saldo inicializado com o valor: "+valorS+".\n");
    }
    
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the controller
     */
    public BaseController getController() {
        return controlador;
    }
}