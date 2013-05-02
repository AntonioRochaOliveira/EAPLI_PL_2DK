/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

/**
 *
 * @author arocha
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 
class JpaRepositoryFactory implements RepositoryFactory {

//    @Override
//    public ExpenseRepository expenseRepository() {
//        return new expensemanager.persistence.jpa.ExpenseRepositoryImpl();
//    }

    @Override
    public ExpenseTypeRepository expenseTypeRepository() {
        return new Persistence.JPA.ExpenseTypeRepositoryImpl();
    }
}

