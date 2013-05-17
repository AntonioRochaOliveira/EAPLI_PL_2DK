package Persistence.JPA;

import Model.TipoAlertas;
import Persistence.TipoAlertasRepository;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author TOSHIBA
 */
public class TipoAlertasRepositoryImpl extends JpaRepository<TipoAlertas, String> implements TipoAlertasRepository{
    
    public TipoAlertas findOrCreate(String key, String description) {
        if (key == null || key.trim().length() == 0) {
            throw new IllegalArgumentException();
        }
        
        EntityManager em = getEntityManager();
        assert em != null;

        TipoAlertas TipoAlertas;
        Query q = em.createQuery("SELECT et FROM TipoAlertas et WHERE et.id = :tipo").setParameter("tipo", key);
        try {
            TipoAlertas = (TipoAlertas) q.getSingleResult();
        }
        catch (NoResultException ex)
        {
            TipoAlertas = new TipoAlertas(Integer.parseInt(key), description);
            save(TipoAlertas);           
        }
        return TipoAlertas;
    }   
    
    
    @Override
    public List<TipoAlertas> getListTipoAlertas() {
                
        EntityManager em = getEntityManager();
        assert em != null;

        List<TipoAlertas> listaAlertas = new ArrayList<TipoAlertas>();
        Query q = em.createQuery("SELECT * FROM TipoAlertas");
        try {
            listaAlertas = (ArrayList<TipoAlertas>) q.getResultList();
        }
        catch (NoResultException ex){}
        
        return listaAlertas;
    }
    
    @Override
    public TipoAlertas save(TipoAlertas al)
    {  
        EntityManager em = getEntityManager();
        assert em != null;
        em.getTransaction().begin();
        
        em.persist(al);
        em.getTransaction().commit();
        em.close();
        
        return al;
    }
}
