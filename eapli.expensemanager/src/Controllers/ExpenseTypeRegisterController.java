
package Controllers;

import Model.ExpenseType;


import Persistence.*;
/**
 *
 * @author Paulo Sergio Monteiro
 */
public class ExpenseTypeRegisterController {

    public ExpenseTypeRegisterController() {
    }

    public void registerTypeExpense(String name) {
        ExpenseType expenseType = new ExpenseType(name);
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
        repo.save(expenseType);
    }
    
}

