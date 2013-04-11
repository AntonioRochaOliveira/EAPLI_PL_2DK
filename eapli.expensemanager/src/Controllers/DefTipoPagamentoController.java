package Controllers;

import Model.TipoPagamento;
import Persistence.RepositorioMeiosPagamento;
import Persistence.RepositorioTiposPagamento;

public class DefTipoPagamentoController {
    
    RepositorioTiposPagamento rep = RepositorioTiposPagamento.instance();
    
    public DefTipoPagamentoController(){}
    
    public void NovoTipoPagamento(String descricao){
        TipoPagamento tipo_pagamento = new TipoPagamento(descricao);
        RepositorioTiposPagamento.instance().AdicionarTipoPagamento(tipo_pagamento);
    }
    
    public void ListarTiposPagamento(){
        System.out.println("Tipos de Pagamento Disponíveis:\n");
        int i=0;
        for(TipoPagamento t : rep.getLista_tipos()){
            i++;
            System.out.println(i+" - "+t.getDescricao()+";");
        }
        System.out.println("\n");
    }
}
