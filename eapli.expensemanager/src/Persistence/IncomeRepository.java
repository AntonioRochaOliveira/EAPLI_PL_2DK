/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Income;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Antonio
 */
public class IncomeRepository {
    // class member
    private static List<Income> listincome= new ArrayList<Income>();

    public IncomeRepository() {}
    
    public void save(Income exp)
    {
        if (exp==null) throw new IllegalArgumentException();
        listincome.add(exp);
}
}
