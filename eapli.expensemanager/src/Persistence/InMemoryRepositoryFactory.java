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
    public Persistence.ExpenseRepository expenseRepository() {
        return new Persistence.InMemory.ExpenseRepositoryImpl();
    }

    @Override
    public Persistence.RepositorioTiposPagamento RepositorioTiposPagamento() {
        return new Persistence.InMemory.RepositorioTiposPagamentoImpl();
    }

    @Override
    public Persistence.RepositorioMeiosPagamento RepositorioMeiosPagamento() {
        return new Persistence.InMemory.RepositorioMeiosPagamentoImpl();
    }

    @Override
    public Persistence.IncomeTypeRepository IncomeTypeRepository() {
        return new Persistence.InMemory.IncomeTypeRepositoryImpl();
    }

    @Override
    public AlertasRepository alertasRepository() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TipoAlertasRepository tipoAlertasRepository() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Persistence.SavingRepository SavingRepository() {
        return new Persistence.InMemory.SavingRepositoryImpl();
    }

    @Override
    public IncomeRepository IncomeRepository() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
