/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Income;
import java.util.ArrayList;

/**
 *
 * @author Antonio
 */

//Eu Pedro Passo alterei esta classe para se tornar um singleton e adicionei o metodo getUniqueRepo()
public interface IncomeRepository {
    public ArrayList<Income> getListIncome();
    public Income save(Income exp);  

    
}
