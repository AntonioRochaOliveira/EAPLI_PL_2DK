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
public class MovimentoRepository implements IExpenseRepository {

    private static MovimentoRepository uniqueRepo = null;
    private static List<Movimentos> listExpense = null;

    private MovimentoRepository() {
        listExpense = new ArrayList<Movimentos>();
    }

    public List<Movimentos> getListExpense() {
        return listExpense;
    }

    public static MovimentoRepository getUniqueRepo() {
        if (uniqueRepo == null) {
            return uniqueRepo = new MovimentoRepository();
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
