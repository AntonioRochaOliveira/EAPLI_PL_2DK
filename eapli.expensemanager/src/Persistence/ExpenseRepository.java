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
public class ExpenseRepository  implements IExpenseRepository
{
    // class member
    private static List<Expense> listExpense= new ArrayList<Expense>();

    public static List<Expense> getListExpense() {
        return listExpense;
    }

    public ExpenseRepository() {}
    
    public void save(Expense exp)
    {
        if (exp==null) throw new IllegalArgumentException();
        listExpense.add(exp);
      
    }    
    public static void listarDespesas() {
        
        for(int i=0; i<listExpense.size(); i++) {
            System.out.println("\n***********************************************");
            System.out.print(listExpense.get(i));
            System.out.println("***********************************************\n");
        }
        
        
    }
}
