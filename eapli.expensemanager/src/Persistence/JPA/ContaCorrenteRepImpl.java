/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;


import Model.ContaCorrente;
import Model.Expense;
import Model.ExpenseType;
import Model.Income;
import Persistence.ContaCorrenteRep;
import Persistence.PersistenceFactory;
import java.util.List;

/**
 *
 * @author paulo
 */
public class ContaCorrenteRepImpl  extends JpaRepository<ContaCorrente,String> implements ContaCorrenteRep {  
    
}
