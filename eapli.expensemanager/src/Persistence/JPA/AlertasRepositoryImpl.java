package Persistence.JPA;

import Model.Alertas;
import Model.TipoAlertas;
import Persistence.AlertasRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author TOSHIBA
 */
public class AlertasRepositoryImpl extends JpaRepository<Alertas, String> implements AlertasRepository {

    public Alertas findOrCreate(TipoAlertas tipo, BigDecimal amarelo, BigDecimal vermelho) {
        if (tipo == null) {
            throw new IllegalArgumentException();
        }
        
        EntityManager em = getEntityManager();
        assert em != null;

        Alertas alerta;
        Query q = em.createQuery("SELECT et FROM Alertas et WHERE et.id = :tipo").setParameter("tipo", tipo);
        try {
            alerta = (Alertas) q.getSingleResult();
        }
        catch (NoResultException ex)
        {
            alerta = new Alertas(tipo, amarelo, vermelho);
            save(alerta);           
        }
        return alerta;
    }   
     
    @Override
    public List<Alertas> getListAlertas() {
                
        EntityManager em = getEntityManager();
        assert em != null;

        List<Alertas> listAlertas = new ArrayList<Alertas>();
        Query q = em.createQuery("SELECT * FROM Alertas");
        try {
            listAlertas = (ArrayList<Alertas>) q.getResultList();
        }
        catch (NoResultException ex){}
        
        return listAlertas;
    }
    
    @Override
    public Alertas save(Alertas al)
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