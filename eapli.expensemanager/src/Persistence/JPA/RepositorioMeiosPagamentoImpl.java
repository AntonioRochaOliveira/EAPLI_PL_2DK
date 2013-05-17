package Persistence.JPA;

import Model.*;
import Persistence.*;
import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

public class RepositorioMeiosPagamentoImpl extends JpaRepository<MeioPagamento, String> implements RepositorioMeiosPagamento {

    @Override
    public List<MeioPagamento> getLista_meiosPagamento() {
        EntityManager em = getEntityManager();
        assert em != null;

        ArrayList<MeioPagamento> m;
        
        Query q = em.createQuery("SELECT * FROM MEIO_PAGAMENTO");
        
       return q.getResultList();
 
    }

    @Override
    public MeioPagamento getMeioPagamento(String descricao) {
        
        EntityManager em = getEntityManager();
        assert em != null;

        MeioPagamento m, meio;
        Query q = em.createQuery("SELECT * FROM MEIO_PAGAMENTO WHERE DECRICAO = :type").setParameter("type", descricao);

        m = (MeioPagamento) q.getSingleResult();
        meio = new MeioPagamento(new TipoPagamento(m.getTipo().getDescricao()),m.getDescricao());

        return meio;
    }
    
}