/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;
import Model.Expense;
import Persistence.*;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author i110558
 */
 public class ExpenseRepositoryImpl extends JpaRepository<Expense, String> implements ExpenseRepository {
        
    @Override
    public List<Expense> getListExpense() {       
        return all();
    }      
}
