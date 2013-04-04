/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Model.TipoPagamento;
import Persistence.RepositorioTiposPagamento;
import eapli.util.Console;

public class DefMeiosPagamentoUI {
    public void mainLoop() {
        System.out.println("* * *  NOVO MEIO DE PAGAMENTO  * * *\n");
        
        /*DefMeioPagamentoController controller = new DefMeioPagamentoController();*/
        
        RepositorioTiposPagamento rep = new RepositorioTiposPagamento();
        
        rep.ListarTiposPagamento();
        
        int escolha = Console.readInteger("Escolha um dos Tipos de Pagamento: ");
        
        TipoPagamento tipo = rep.getLista_tipos().get(escolha-1);
        
        String descricao = Console.readLine("Descrição: ");
        
        /*controller.NovoMeioPagamento(tipo,descricao);*/
        
        System.out.println("Novo Meio de Pagamento adicionado com sucesso!");
    }
}
