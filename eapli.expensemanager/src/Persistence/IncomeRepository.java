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
    int i = 0;
    private static ArrayList<Income> listincome= new ArrayList<Income>();

    public IncomeRepository() {}
    
    public void save(Income exp)
    {
        if (exp==null) throw new IllegalArgumentException();
        listincome.add(exp);
    }
    
    public void ListarRendimentos(){
        System.out.println("Rendimentos Disponiveis:\n");
        for(Income ic : getLista_rendimentos()){
            i++;
            System.out.println(i+ " - " + " Rendimento: "+ ic.getValor()+";");
        }
        System.out.println("\n");
    }
    
    public ArrayList<Income> getLista_rendimentos() {
        return listincome;
    }
}
