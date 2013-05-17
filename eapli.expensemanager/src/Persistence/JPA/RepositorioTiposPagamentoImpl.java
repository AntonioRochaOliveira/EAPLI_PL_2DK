package Persistence.JPA;

import Model.*;
import Persistence.*;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class RepositorioTiposPagamentoImpl extends JpaRepository<TipoPagamento, String> implements RepositorioTiposPagamento {

    @Override
    public ArrayList<TipoPagamento> getLista_tipos() {
        EntityManager em = getEntityManager();
        assert em != null;

        ArrayList<TipoPagamento> t;
        
        Query q = em.createQuery("SELECT * FROM TIPO_PAGAMENTO");

        t = (ArrayList<TipoPagamento>) q.getResultList();

        return t;
    }

}
