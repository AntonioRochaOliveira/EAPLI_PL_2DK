package Persistence;

import Model.MeioPagamento;
import java.util.List;

public interface RepositorioMeiosPagamento {
    
    public MeioPagamento save(MeioPagamento meio_pag);
    public List<MeioPagamento> getLista_meiosPagamento();   
    public MeioPagamento getMeioPagamento(String descricao);
        
}
