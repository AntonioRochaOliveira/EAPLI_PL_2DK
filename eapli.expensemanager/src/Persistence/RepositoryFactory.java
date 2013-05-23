/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;


/**
 *
 * @author arocha
 */
public interface RepositoryFactory {    
    ExpenseRepository expenseRepository();
    ExpenseTypeRepository expenseTypeRepository();   
    RepositorioTiposPagamento RepositorioTiposPagamento();
    RepositorioMeiosPagamento RepositorioMeiosPagamento();
    IncomeTypeRepository IncomeTypeRepository();
    AlertasRepository alertasRepository();
    TipoAlertasRepository tipoAlertasRepository();
    SavingRepository SavingRepository();
    IncomeRepository IncomeRepository();
    ContaCorrenteRep contaCorrenteRep();
}
