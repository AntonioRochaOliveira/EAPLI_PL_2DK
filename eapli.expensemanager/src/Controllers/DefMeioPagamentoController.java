package Controllers;

import Model.MeioPagamento;
import Persistence.RepositorioMeiosPagamento;
import Model.TipoPagamento;


public class DefMeioPagamentoController {
    
    RepositorioMeiosPagamento rep = RepositorioMeiosPagamento.instance();
    public DefMeioPagamentoController(){}
    
    public void NovoMeioPagamento(TipoPagamento tipo, String descricao){
        MeioPagamento meio_pagamento = new MeioPagamento(tipo, descricao);
        rep.AdicionarMeioPagamento(meio_pagamento);
    }
    
    public void ListarMeiosPagamento(){
    System.out.println("Meios de Pagamento Disponíveis:\n");
        int i=0;
        
        if(!rep.getLista_meiosPagamento().isEmpty()){
            for(MeioPagamento m : rep.getLista_meiosPagamento()){
            i++;
          
            System.out.println(i+" - "+m.getTipo().getDescricao()+" - "+m.getDescricao()+";");
            }
        }else{
            System.out.println("Não existem Meios Pagamento Guardados \n");
        }
        System.out.println("\n");
   }

}