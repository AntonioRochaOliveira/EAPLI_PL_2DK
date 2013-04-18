/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

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
public class ExpenseRegisterController {
    ExpenseRepository repo;
    
    public ExpenseRegisterController() {
        repo = ExpenseRepository.getUniqueRepo();
    }

    public void registerExpense(String what, Date date, BigDecimal amount, int tipo, int mp) {
        RepositorioMeiosPagamento repM = RepositorioMeiosPagamento.instance();
        ExpenseTypeRepository extyre = ExpenseTypeRepository.instance();
        Expense expense = new Expense(amount, date, what, extyre.getListExpenseType().get(tipo),repM.getLista_meiosPagamento().get(mp));        
        repo.save(expense);
    }
    
    public List<String> getTypeExpense() {
        ExpenseTypeRepository extyre = ExpenseTypeRepository.instance();
        List<String> lista = new ArrayList<String>();
        for(int i=0; i<extyre.getListExpenseType().size(); i++) {
            lista.add((i+1)+" - "+extyre.getListExpenseType().get(i).getName());
        }
        return lista;
    }
    
    public List<String> getMeioDePagamento(){
        RepositorioMeiosPagamento repM = RepositorioMeiosPagamento.instance();
        ExpenseTypeRepository extyre = ExpenseTypeRepository.instance();
        List<String> lista = new ArrayList<String>();
        for(int i=0; i<repM.getLista_meiosPagamento().size(); i++) {
            lista.add((i+1)+" - "+repM.getLista_meiosPagamento().get(i).getDescricao());
        }
        return lista;
    }
    
}
