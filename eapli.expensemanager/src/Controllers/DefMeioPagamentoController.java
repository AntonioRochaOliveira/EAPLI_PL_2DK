package Controllers;

import Model.MeioPagamento;
import Persistence.RepositorioMeiosPagamento;
import Model.TipoPagamento;


public class DefMeioPagamentoController {
    
    public DefMeioPagamentoController(){}
    
    public void NovoMeioPagamento(TipoPagamento tipo, String descricao){
        MeioPagamento meio_pagamento = new MeioPagamento(tipo, descricao);
        RepositorioMeiosPagamento rep = new RepositorioMeiosPagamento();
        rep.AdicionarMeioPagamento(meio_pagamento);
    }
}