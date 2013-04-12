package Persistence;

import Model.TipoPagamento;
import java.util.ArrayList;

public class RepositorioTiposPagamento {
    
    private static ArrayList<TipoPagamento> lista_tipos = new ArrayList<TipoPagamento>();
    
    private static RepositorioTiposPagamento uniqueInstance = new RepositorioTiposPagamento();
    
    private RepositorioTiposPagamento(){}
    
    public static RepositorioTiposPagamento instance(){
        if(uniqueInstance==null){
            uniqueInstance=new RepositorioTiposPagamento();
        }
        return uniqueInstance;
    }
    
    public void AdicionarTipoPagamento(TipoPagamento tipo_pag){
        
        if (tipo_pag==null){
            throw new IllegalArgumentException();
        }
        getLista_tipos().add(tipo_pag);
    }

    public ArrayList<TipoPagamento> getLista_tipos() {
        return lista_tipos;
    }
}
