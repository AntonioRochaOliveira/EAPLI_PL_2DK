/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;


import Model.ExpenseType;
import Persistence.ExpenseTypeRepository;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author arocha
 */
public class ExpenseTypeRepositoryImpl extends JpaRepository<ExpenseType, String> implements ExpenseTypeRepository {

    public ExpenseType findOrCreate(String key, String description) {
        if (key == null || key.trim().length() == 0) {
            throw new IllegalArgumentException();
        }
        
        EntityManager em = getEntityManager();
        assert em != null;

        ExpenseType expenseType;
        Query q = em.createQuery("SELECT et FROM ExpenseType et WHERE et.id = :type").setParameter("type", key);
        try {
            expenseType = (ExpenseType) q.getSingleResult();
        }
        catch (NoResultException ex)
        {
            expenseType = new ExpenseType(key, description);
            save(expenseType);           
        }
        return expenseType;
    }

    
     
//    @Override
//    public ExpenseType findForName(String key) {
//        return super.read(key);
//    }
    
    
    // ------> metodo validType ja esta implementado como sendo o "findOrCreate" 
    /* 
        public boolean validType(ExpenseType expType){
        //ToDO  
        return true;
    }
    */
    
    
        public ExpenseType getExpenseTypeByDescription(String name){
        //TODO: Name is Key?
        return super.read(name);
    }
        
    public  List<ExpenseType> getListExpenseType() {
        return all();
    }
    
    
}

