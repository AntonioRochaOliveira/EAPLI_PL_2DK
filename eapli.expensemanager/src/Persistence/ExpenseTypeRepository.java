/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Expense;
import Model.ExpenseType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author i110341
 */
public class ExpenseTypeRepository {
    // class member
    
   private static ExpenseTypeRepository uniqueExpenseTypeRepo = null;
   private static List<ExpenseType> listExpenseType= null;
   

    /**
     * @return the listExpenseType
     */
    public static List<ExpenseType> getListExpenseType() {
        return listExpenseType;
    }

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
    
    public void save(ExpenseType expType)
    {
        if (expType==null || !validType(expType)) throw new IllegalArgumentException();
        getListExpenseType().add(expType);      
    }
    
    private boolean validType(ExpenseType expType){
        if(getListExpenseType().size()==0) return true;
        for (int i = 0; i < getListExpenseType().size(); i++) {
            if(expType.getName().equals(getListExpenseType().get(i).getName()))
                return false;
        }
        return true;
    }
}
