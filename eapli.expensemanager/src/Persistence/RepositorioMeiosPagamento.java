package Persistence;

import Model.MeioPagamento;
import java.util.ArrayList;

public interface RepositorioMeiosPagamento {
    
    public void AdicionarMeioPagamento(MeioPagamento meio_pag);
    public ArrayList<MeioPagamento> getLista_meiosPagamento();   
    public MeioPagamento getMeioPagamento(String descricao);
        
}
