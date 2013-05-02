/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.InMemory;

import Model.TipoPagamento;
import Persistence.RepositorioTiposPagamento;
import java.util.ArrayList;

public class RepositorioTiposPagamentoImpl implements RepositorioTiposPagamento {
    
    private static ArrayList<TipoPagamento> lista_tipos = new ArrayList<TipoPagamento>();
    
    private static RepositorioTiposPagamento uniqueInstance = new RepositorioTiposPagamentoImpl();
    
    public static RepositorioTiposPagamento instance(){
        if(uniqueInstance==null){
            uniqueInstance=new RepositorioTiposPagamentoImpl();
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
