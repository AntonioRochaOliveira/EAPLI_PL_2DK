/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.DefMeioPagamentoController;
import Controllers.DefTipoPagamentoController;
import Model.TipoPagamento;
import Persistence.RepositorioTiposPagamento;
import eapli.util.Console;

public class DefMeiosPagamentoUI {
    
    public void mainLoop() {
        System.out.println("* * *  NOVO MEIO DE PAGAMENTO  * * *\n");
        
        DefMeioPagamentoController cont_meio = new DefMeioPagamentoController();
        
        cont_meio.ListarTiposPagamento();
        
        int escolha = Console.readInteger("Escolha um dos Tipos de Pagamento: ");
        
        TipoPagamento tipo = RepositorioTiposPagamento.instance().getLista_tipos().get(escolha-1);
        
        String descricao = Console.readLine("Descrição: ");
        
        cont_meio.NovoMeioPagamento(tipo,descricao);
        
        System.out.println("Novo Meio de Pagamento adicionado com sucesso!");
    }

}
