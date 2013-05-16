package Persistence.JPA;

import Model.*;
import Persistence.*;
import java.util.ArrayList;

public class RepositorioMeiosPagamentoImpl extends JpaRepository<MeioPagamento, String> implements RepositorioMeiosPagamento {

    @Override
    public void AdicionarMeioPagamento(MeioPagamento meio_pag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<MeioPagamento> getLista_meiosPagamento() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public MeioPagamento getMeioPagamento(String descricao) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
