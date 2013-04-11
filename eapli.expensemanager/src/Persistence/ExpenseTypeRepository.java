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
public class ExpenseTypeRepository {
    // class member
    
    private static ExpenseTypeRepository uniqueExpenseTypeRepo = null;
    private static List<ExpenseType> listExpenseType= null;
   

    private ExpenseTypeRepository() {
        listExpenseType = new ArrayList<ExpenseType>();
    }
    
    
    public static ExpenseTypeRepository instance(){
        if(uniqueExpenseTypeRepo==null) {
            return uniqueExpenseTypeRepo = new ExpenseTypeRepository();
        }
        else {
            return uniqueExpenseTypeRepo;
        }
    }
    
    /**
     * @return the listExpenseType
     */
    public static List<ExpenseType> getListExpenseType() {
        List<ExpenseType> list = new ArrayList<ExpenseType>();
        for (ExpenseType e : listExpenseType) {
            list.add(new ExpenseType(e.getName()));
        }
        return list;
    }
    
    public void save(ExpenseType expType)
    {
        if (expType==null || !validType(expType)) throw new IllegalArgumentException();
        listExpenseType.add(expType);      
    }
    
    private boolean validType(ExpenseType expType){
        if(listExpenseType.size()==0) return true;
        for (int i = 0; i < listExpenseType.size(); i++) {
            if(expType.getName().equals(listExpenseType.get(i).getName()))
                return false;
        }
        return true;
    }
}
