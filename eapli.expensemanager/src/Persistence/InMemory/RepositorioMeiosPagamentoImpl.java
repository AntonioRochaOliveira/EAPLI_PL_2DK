/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.InMemory;
import Model.MeioPagamento;
import Persistence.RepositorioMeiosPagamento;
import java.util.ArrayList;
/**
 *
 * @author Asus
 */
public class RepositorioMeiosPagamentoImpl implements RepositorioMeiosPagamento {
    private static RepositorioMeiosPagamento uniqueInstance = null;
    private static ArrayList<MeioPagamento> lista_meiosPagamento = new ArrayList<MeioPagamento>();
    
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
            uniqueInstance = new RepositorioMeiosPagamentoImpl();
        }
        return uniqueInstance;
    }
    
    public MeioPagamento getMeioPagamento(String descricao){
        MeioPagamento tmp = null;
        for(MeioPagamento m : lista_meiosPagamento){
            if(m.getDescricao().compareTo(descricao)==0){
                tmp=m;
            }
        }
        return tmp;
    }
}
