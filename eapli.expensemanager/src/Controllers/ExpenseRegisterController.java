/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;

import java.math.BigDecimal;
import java.util.Date;
import Persistence.*;
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
    
    public void listarDespesas() {
        repo.listarDespesas();
    }
    
}
