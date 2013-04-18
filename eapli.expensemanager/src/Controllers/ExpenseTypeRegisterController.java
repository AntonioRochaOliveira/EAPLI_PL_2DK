
package Controllers;

import Model.ExpenseType;


import Persistence.*;
/**
 *
 * @author Paulo Sergio Monteiro
 */
public class ExpenseTypeRegisterController extends BaseController{

    public ExpenseTypeRegisterController() {
    }

    public void registerTypeExpense(String name) {
        ExpenseType expenseType = new ExpenseType(name);
        ExpenseTypeRepository repo = ExpenseTypeRepository.instance();
        repo.save(expenseType);
    }
    
}

