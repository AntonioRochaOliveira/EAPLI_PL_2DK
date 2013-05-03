/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;
import Model.Expense;
import Persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author i110558
 */
 public class ExpenseRepositoryImpl extends JpaRepository<Expense, String> implements ExpenseRepository {

    private static ExpenseRepositoryImpl uniqueRepo = new ExpenseRepositoryImpl();;
    private static List<Expense> listExpense = new ArrayList<Expense>();
    
    private ExpenseRepositoryImpl() {}
     
    @Override
    public List<Expense> getListExpense() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

  
    public static ExpenseRepository instance() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
