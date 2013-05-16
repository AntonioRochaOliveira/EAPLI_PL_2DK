package Persistence.JPA;

import Model.*;
import Persistence.*;
import java.util.ArrayList;

public class RepositorioTiposPagamentoImpl extends JpaRepository<TipoPagamento, String> implements RepositorioTiposPagamento {

    @Override
    public void AdicionarTipoPagamento(TipoPagamento tipo_pag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<TipoPagamento> getLista_tipos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
