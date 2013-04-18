/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author losa
 */
public class ExpenseRepository implements IExpenseRepository {

    private static ExpenseRepository uniqueRepo = null;
    private static List<Expense> listExpense = null;

    private ExpenseRepository() {
        listExpense = new ArrayList<Expense>();
    }

    public List<Expense> getListExpense() {
        return listExpense;
    }

    public static ExpenseRepository getUniqueRepo() {
        if (uniqueRepo == null) {
            return uniqueRepo = new ExpenseRepository();
        } else {
            return uniqueRepo;
        }
    }

    @Override
    public void save(Expense exp) {
        if (exp == null) {
            throw new IllegalArgumentException();
        }
        listExpense.add(exp);
    }
}
