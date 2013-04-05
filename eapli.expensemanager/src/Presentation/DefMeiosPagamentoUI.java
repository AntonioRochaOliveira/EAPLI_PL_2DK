/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.DefMeioPagamentoController;
import Controllers.DefTipoPagamentoController;
import Model.TipoPagamento;
import eapli.util.Console;

public class DefMeiosPagamentoUI {
    
    private DefMeioPagamentoController controller_meio;
    private DefTipoPagamentoController controller_tipo;
    
    public DefMeiosPagamentoUI(DefMeioPagamentoController controller_meio, DefTipoPagamentoController controller_tipo){
        this.controller_meio=controller_meio;   
        this.controller_tipo=controller_tipo;   
    }
    public void mainLoop() {
        System.out.println("* * *  NOVO MEIO DE PAGAMENTO  * * *\n");
        
        controller_tipo.getRepositorioTiposPagamento().ListarTiposPagamento();
        
        int escolha = Console.readInteger("Escolha um dos Tipos de Pagamento: ");
        
        TipoPagamento tipo = controller_tipo.getRepositorioTiposPagamento().getLista_tipos().get(escolha-1);
        
        String descricao = Console.readLine("Descrição: ");
        
        controller_meio.NovoMeioPagamento(tipo,descricao);
        
        System.out.println("Novo Meio de Pagamento adicionado com sucesso!");
    }
    
    
}
