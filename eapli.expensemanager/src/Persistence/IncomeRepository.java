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
public class IncomeRepository {
    // class member
    int i = 0;
    private static ArrayList<Income> listincome= new ArrayList<Income>();
    private static IncomeRepository uniqueRepo = null;

    public IncomeRepository() {}
    
    public void save(Income exp)
    {
        if (exp==null) throw new IllegalArgumentException();
        getLista_rendimentos().add(exp);
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
    
    public static IncomeRepository getUniqueRepo() {
        if (uniqueRepo == null) {
            return uniqueRepo = new IncomeRepository();
        } else {
            return uniqueRepo;
        }
    }
}
