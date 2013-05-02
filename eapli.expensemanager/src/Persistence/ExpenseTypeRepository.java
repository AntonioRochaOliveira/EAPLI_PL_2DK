/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Expense;
import Model.ExpenseType;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 *
 * @author i110341
 */
public interface ExpenseTypeRepository {
    // class member
    
    public ExpenseType save(ExpenseType expType);
    
    public boolean validType(ExpenseType expType);
    
    public ExpenseType getExpenseTypeByDescription(String name);
    
   public  List<ExpenseType> getListExpenseType();
                
}
