package Persistence;

import Model.MeioPagamento;
import java.util.ArrayList;

public class RepositorioMeiosPagamento {
    
    private static RepositorioMeiosPagamento uniqueInstance = null;
    private static ArrayList<MeioPagamento> lista_meiosPagamento = new ArrayList<MeioPagamento>();
    
    private RepositorioMeiosPagamento(){}
    
    public void AdicionarMeioPagamento(MeioPagamento meio_pag){
        
        if (meio_pag==null){
            throw new IllegalArgumentException();
        }
        lista_meiosPagamento.add(meio_pag);
    }
    
    

    public ArrayList<MeioPagamento> getLista_meiosPagamento() {
        return lista_meiosPagamento;
    }
    
    public static RepositorioMeiosPagamento instance(){
        if(uniqueInstance==null){
            uniqueInstance = new RepositorioMeiosPagamento();
        }
        return uniqueInstance;
    }
        
}
