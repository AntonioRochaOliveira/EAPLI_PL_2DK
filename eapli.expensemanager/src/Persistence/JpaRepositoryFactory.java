/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Persistence.InMemory.RepositorioTiposPagamentoImpl;

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

    @Override
    public ExpenseRepository expenseRepository() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Persistence.RepositorioTiposPagamento RepositorioTiposPagamento() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Persistence.RepositorioMeiosPagamento RepositorioMeiosPagamento() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Persistence.IncomeTypeRepository IncomeTypeRepository() {
        return new Persistence.JPA.IncomeTypeRepositoryImpl();
    }

    @Override
    public Persistence.AlertasRepository alertasRepository() {
        return new Persistence.JPA.AlertasRepositoryImpl();
    }

    @Override
    public Persistence.TipoAlertasRepository tipoAlertasRepository() {
        return new Persistence.JPA.TipoAlertasRepositoryImpl();
    }

    @Override
    public Persistence.SavingRepository SavingRepository() {
        return new Persistence.JPA.SavingRepositoryImpl();
    }

}

