package Controllers;

import Model.TipoPagamento;
import Persistence.RepositorioTiposPagamento;

public class DefTipoPagamentoController {
    private RepositorioTiposPagamento rep;
    
    public DefTipoPagamentoController(){}
    
    public void NovoTipoPagamento(String descricao){
        TipoPagamento tipo_pagamento = new TipoPagamento(descricao);
        rep.AdicionarTipoPagamento(tipo_pagamento);
    }
    
    public RepositorioTiposPagamento getRepositorioTiposPagamento(){
        return rep;
    }
}
