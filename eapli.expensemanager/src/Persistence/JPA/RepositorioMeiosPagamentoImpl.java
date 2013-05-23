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
        return all(); 
    }

    @Override
    public MeioPagamento getMeioPagamento(String descricao) {
        
        EntityManager em = getEntityManager();
        assert em != null;
        
        String tableName = entityClass.getSimpleName();
        
        MeioPagamento m, meio;
        Query q = em.createQuery("SELECT it FROM " + tableName + " it WHERE it.descricao LIKE '"+ descricao + "'");
        
        System.out.println(q.toString());

        m = (MeioPagamento) q.getSingleResult();
        meio = new MeioPagamento(new TipoPagamento(m.getTipo().getDescricao()),m.getDescricao());

        return meio;
    }
    
}