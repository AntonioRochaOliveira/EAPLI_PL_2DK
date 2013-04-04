package Persistence;

import Model.TipoPagamento;
import Model.MeioPagamento;
import java.util.ArrayList;

public class RepositorioMeiosPagamento {
    
    private ArrayList<MeioPagamento> lista_meiosPagamento = new ArrayList<MeioPagamento>();
    
    public RepositorioMeiosPagamento(){}
    
    public void AdicionarTipoPagamento(MeioPagamento meio_pag){
        
        if (meio_pag==null){
            throw new IllegalArgumentException();
        }
        lista_meiosPagamento.add(meio_pag);
    }
    
    public void ListarMeiosPagamento(){
        System.out.println("Meios de Pagamento Disponíveis:\n");
        int i=0;
        for(MeioPagamento m : lista_meiosPagamento){
            i++;
            System.out.println(i+" - "+m.getTipo().getDescricao()+" - "+m.getDescricao()+";");
        }
        System.out.println("\n");
    }

    public ArrayList<MeioPagamento> getLista_meiosPagamento() {
        return lista_meiosPagamento;
    }
    
}
