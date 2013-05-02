/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.InMemory;

import Model.Expense;
import Persistence.ExpenseRepository;
import java.util.*;

/**
 *
 * @author i110558
 */
public class ExpenseRepositoryImpl implements ExpenseRepository {
    
    private static ExpenseRepository uniqueRepo = new ExpenseRepositoryImpl();;
    private static List<Expense> listExpense = new ArrayList<Expense>();
    
    private ExpenseRepositoryImpl() {}
    
    @Override
    public List<Expense> getListExpense() {
        return listExpense;
    }

    @Override
    public void save(Expense exp) {
        if (exp == null) {
            throw new IllegalArgumentException();
        }
        listExpense.add(exp);
    }

    public static ExpenseRepository instance() {
        if(uniqueRepo==null) {
            return uniqueRepo = new ExpenseRepositoryImpl();
        }
        else {
            return uniqueRepo;
        }
    }
}
