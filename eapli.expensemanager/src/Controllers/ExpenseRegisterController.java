/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Persistence.ExpenseTypeRepository;
import Model.Expense;
import Model.ExpenseType;
import Model.MeioPagamento;

import java.math.BigDecimal;
import java.util.Date;
import Persistence.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpenseRegisterController extends BaseController {
    ExpenseRepository repo;
    
    public ExpenseRegisterController() {
        repo = PersistenceFactory.buildPersistenceFactory().expenseRepository();
    }

    public void registerExpense(String what, Date date, BigDecimal amount, String tipo, String mp) {
        RepositorioMeiosPagamento repM = PersistenceFactory.buildPersistenceFactory().RepositorioMeiosPagamento();
        ExpenseTypeRepository extyre = PersistenceFactory.buildPersistenceFactory().expenseTypeRepository();

        Expense expense = new Expense(amount, date, what, extyre.getExpenseTypeByDescription(tipo), repM.getMeioPagamento(mp));        
        repo.save(expense);
    }
    
    public List<String> getTypeExpense() {

        ExpenseTypeRepository extyre = PersistenceFactory.buildPersistenceFactory().expenseTypeRepository();

        List<String> lista = new ArrayList<String>();
        for(int i=0; i<extyre.getListExpenseType().size(); i++) {
            lista.add(extyre.getListExpenseType().get(i).getName());
        }
        return lista;
    }
    
    public List<String> getMeioDePagamento(){
        RepositorioMeiosPagamento repM =PersistenceFactory.buildPersistenceFactory().RepositorioMeiosPagamento();
        
        List<String> lista = new ArrayList<String>();
        for(int i=0; i<repM.getLista_meiosPagamento().size(); i++) {
            lista.add(repM.getLista_meiosPagamento().get(i).getDescricao());
        }
        return lista;
    }
    
}
