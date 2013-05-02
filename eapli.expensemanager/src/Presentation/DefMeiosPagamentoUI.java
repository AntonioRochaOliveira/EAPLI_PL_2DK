/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.DefMeioPagamentoController;
import Controllers.DefTipoPagamentoController;
import Model.TipoPagamento;
import Persistence.RepositorioTiposPagamento;
import eapli.util.Console;

public class DefMeiosPagamentoUI extends BaseUI {
    
    private DefMeioPagamentoController cont_meio = new DefMeioPagamentoController();
    private String title = "* * *  NOVO MEIO DE PAGAMENTO  * * *\n";

    @Override
    public BaseController getController() {
        return cont_meio;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void showBody() {
        cont_meio.ListarTiposPagamento();
        
        int escolha = Console.readInteger("Escolha um dos Tipos de Pagamento: ");
        
        TipoPagamento tipo = cont_meio.getTipoPagamento(escolha);
        
        String descricao = Console.readLine("Descrição: ");
        
        cont_meio.NovoMeioPagamento(tipo,descricao);
        
        System.out.println("Novo Meio de Pagamento adicionado com sucesso!");
    }
}