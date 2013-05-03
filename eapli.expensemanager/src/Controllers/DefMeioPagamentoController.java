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
        rep.AdicionarMeioPagamento(meio_pagamento);
    }
    
    public void ListarMeiosPagamento(){
    System.out.println("Meios de Pagamento Disponíveis:\n");
        int i=0;
        for(MeioPagamento m : rep.getLista_meiosPagamento()){
          i++;
           System.out.println(i+" - "+m.getTipo().getDescricao()+" - "+m.getDescricao()+";");
        }
        System.out.println("\n");
   }
   
   public void ListarTiposPagamento(){
        System.out.println("Tipos de Pagamento Disponíveis:\n");
        int i=0;
        for(TipoPagamento t : rep_tipos.getLista_tipos()){
            i++;
            System.out.println(i+" - "+t.getDescricao()+";");
        }
        System.out.println("\n");
   }
    
   public TipoPagamento getTipoPagamento(int escolha){
       TipoPagamento tipo=rep_tipos.getLista_tipos().get(escolha-1);
       return tipo;
   }

}