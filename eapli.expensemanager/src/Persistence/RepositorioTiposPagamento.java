package Persistence;

import Model.TipoPagamento;
import java.util.ArrayList;

public interface RepositorioTiposPagamento {

    public void AdicionarTipoPagamento(TipoPagamento tipo_pag);
    public ArrayList<TipoPagamento> getLista_tipos();
    
}
