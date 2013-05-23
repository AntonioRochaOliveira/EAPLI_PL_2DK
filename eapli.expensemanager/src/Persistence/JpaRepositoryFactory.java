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
        return new Persistence.JPA.ExpenseRepositoryImpl();
    }

    @Override
    public ContaCorrenteRep contaCorrenteRep() {
        return new Persistence.JPA.ContaCorrenteRepImpl();
    }
    
    @Override
    public Persistence.RepositorioTiposPagamento RepositorioTiposPagamento() {
         return new Persistence.JPA.RepositorioTiposPagamentoImpl();
    }

    @Override
    public Persistence.RepositorioMeiosPagamento RepositorioMeiosPagamento() {
         return new Persistence.JPA.RepositorioMeiosPagamentoImpl();
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


    @Override
    public IncomeRepository IncomeRepository() {
         return new Persistence.JPA.IncomeRepositoryImpl();
    }

}

