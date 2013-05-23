package Persistence.JPA;

import Model.*;
import Persistence.*;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class RepositorioTiposPagamentoImpl extends JpaRepository<TipoPagamento, String> implements RepositorioTiposPagamento {

    @Override
    public List<TipoPagamento> getLista_tipos() {        
        return all();
    }

}
