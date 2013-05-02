package Controllers;

import Model.TipoPagamento;
import Persistence.RepositorioTiposPagamento;

public class DefTipoPagamentoController extends BaseController {
    
    RepositorioTiposPagamento rep = RepositorioTiposPagamento.instance();
    
    public DefTipoPagamentoController(){}
    
    public void NovoTipoPagamento(String descricao){
        TipoPagamento tipo_pagamento = new TipoPagamento(descricao);
        RepositorioTiposPagamento.instance().AdicionarTipoPagamento(tipo_pagamento);
    }
    
}