package Controllers;

import Model.TipoPagamento;
import Persistence.ExpenseTypeRepository;
import Persistence.PersistenceFactory;
import Persistence.RepositorioTiposPagamento;

public class DefTipoPagamentoController extends BaseController {
    
    RepositorioTiposPagamento rep = PersistenceFactory.buildPersistenceFactory().RepositorioTiposPagamento();
    
    public DefTipoPagamentoController(){}
    
    public void NovoTipoPagamento(String descricao){
        TipoPagamento tipo_pagamento = new TipoPagamento(descricao);
        rep.AdicionarTipoPagamento(tipo_pagamento);
    }
    
}