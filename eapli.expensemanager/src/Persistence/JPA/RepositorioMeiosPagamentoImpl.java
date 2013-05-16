package Persistence.JPA;

import Model.*;
import Persistence.*;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

public class RepositorioMeiosPagamentoImpl extends JpaRepository<MeioPagamento, String> implements RepositorioMeiosPagamento {

    @Override
    public void AdicionarMeioPagamento(MeioPagamento meio_pag) {
        EntityManager em = getEntityManager();
        assert em != null;

        Query q = em.createQuery("INSERT INTO MEIO_PAGAMENTO VALUES (:type1,:type)").setParameter(":type", meio_pag.getTipo_descricao()).setParameter(":type1", meio_pag.getDescricao());
    }

    @Override
    public ArrayList<MeioPagamento> getLista_meiosPagamento() {
        EntityManager em = getEntityManager();
        assert em != null;

        ArrayList<MeioPagamento> m;
        
        Query q = em.createQuery("SELECT * FROM MEIO_PAGAMENTO");
        
        m = (ArrayList<MeioPagamento>) q.getResultList();
        /*for(int i=0;i<q.getResultList().size();i++){
            q.getResultList().get(i);
        }*/

        return m;
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