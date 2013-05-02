
package Controllers;

import Persistence.ExpenseTypeRepository;
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
        // ToDo name=name ???
        ExpenseType expenseType = new ExpenseType(name,name);
        
        ExpenseTypeRepository repo = PersistenceFactory.buildPersistenceFactory().expenseTypeRepository();

        repo.save(expenseType);
    }
    
}

