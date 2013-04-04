/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.ExpenseType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author i110341
 */
public class ExpenseTypeRepository {
    // class member
    private static List<ExpenseType> listExpenseType= new ArrayList<ExpenseType>();

    /**
     * @return the listExpenseType
     */
    public static List<ExpenseType> getListExpenseType() {
        return listExpenseType;
    }

    public ExpenseTypeRepository() {}
    
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
