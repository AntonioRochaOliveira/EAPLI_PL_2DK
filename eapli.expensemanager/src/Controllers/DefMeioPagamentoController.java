package Controllers;

import Model.MeioPagamento;
import Model.TipoPagamento;
import Persistence.PersistenceFactory;
import Persistence.RepositorioMeiosPagamento;
import Persistence.RepositorioTiposPagamento;


public class DefMeioPagamentoController extends BaseController {
    
    RepositorioMeiosPagamento rep = PersistenceFactory.buildPersistenceFactory().RepositorioMeiosPagamento();
    RepositorioTiposPagamento rep_tipos =PersistenceFactory.buildPersistenceFactory().RepositorioTiposPagamento();
    
    public DefMeioPagamentoController(){}
    
    public void NovoMeioPagamento(TipoPagamento tipo, String descricao){
        MeioPagamento meio_pagamento = new MeioPagamento(tipo, descricao);
        rep.save(meio_pagamento);
    }
    
    public void ListarMeiosPagamento(){
    System.out.println("Meios de Pagamento Disponíveis:\n");
        for(int i=0; i<rep.getLista_meiosPagamento().size(); i++){
            System.out.println(i+" - "+rep.getLista_meiosPagamento().get(i).getDescricao() +";");
        }
        System.out.println("\n");
   }
   
   public void ListarTiposPagamento(){
        System.out.println("Tipos de Pagamento Disponíveis:\n");
        for(int i=0; i<rep_tipos.getLista_tipos().size(); i++){
            System.out.println(i+" - "+rep_tipos.getLista_tipos().get(i).getDescricao() +";");
        }
        System.out.println("\n");
   }
    
   public TipoPagamento getTipoPagamento(int escolha){
       TipoPagamento tipo=rep_tipos.getLista_tipos().get(escolha);
       return tipo;
   }

}