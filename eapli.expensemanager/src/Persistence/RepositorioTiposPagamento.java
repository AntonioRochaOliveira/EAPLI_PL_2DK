package Persistence;

import Model.TipoPagamento;
import java.util.List;

public interface RepositorioTiposPagamento {

    public TipoPagamento save(TipoPagamento tipo_pag);
    public List<TipoPagamento> getLista_tipos();
    
}
