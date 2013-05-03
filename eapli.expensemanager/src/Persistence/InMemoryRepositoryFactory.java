/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

/**
 *
 * @author arocha
 */

class InMemoryRepositoryFactory implements RepositoryFactory {

//    @Override
//    public ExpenseRepository expenseRepository() {
//        return new eapli.expensemanager.persistence.inmemory.ExpenseRepositoryImpl();
//    }

    @Override
    public ExpenseTypeRepository expenseTypeRepository() {
        return new Persistence.InMemory.ExpenseTypeRepositoryImpl();
    }

    @Override
    public ExpenseRepository expenseRepository() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Persistence.RepositorioTiposPagamento RepositorioTiposPagamento() {
        return new Persistence.InMemory.RepositorioTiposPagamentoImpl();
    }

    @Override
    public Persistence.RepositorioMeiosPagamento RepositorioMeiosPagamento() {
        return new Persistence.InMemory.RepositorioMeiosPagamentoImpl();
    }

}
