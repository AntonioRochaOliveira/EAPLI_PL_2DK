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
public interface ExpenseRepository  {

    public List<Expense> getListExpense();
    public Expense save(Expense exp);
}

