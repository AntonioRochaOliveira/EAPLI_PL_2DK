/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseType;

import java.math.BigDecimal;
import java.util.Date;
import Persistence.*;
import java.util.List;
/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpenseRegisterController {
    ExpenseRepository repo;
    
    public ExpenseRegisterController() {
        repo = ExpenseRepository.getUniqueRepo();
    }

    public void registerExpense(String what, Date date, BigDecimal amount) {
        Expense expense = new Expense(what, date, amount);        
        repo.save(expense);
    }
    
    public List<ExpenseType> getTypeExpense() {
        return ExpenseTypeRepository.getListExpenseType();
    }
    
}
