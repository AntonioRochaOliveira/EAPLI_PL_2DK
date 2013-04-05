package Controllers;

import Model.TipoPagamento;
import Persistence.RepositorioTiposPagamento;

public class DefTipoPagamentoController {
    public DefTipoPagamentoController(){}
    
    public void NovoTipoPagamento(String descricao){
        TipoPagamento tipo_pagamento = new TipoPagamento(descricao);
        RepositorioTiposPagamento.instance().AdicionarTipoPagamento(tipo_pagamento);
    }
}
