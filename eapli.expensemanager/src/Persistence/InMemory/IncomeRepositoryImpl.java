/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.InMemory;

import Model.Income;
import Persistence.IncomeRepository;
import java.util.ArrayList;

/**
 *
 * @author Antonio
 */
public class IncomeRepositoryImpl implements IncomeRepository{
    int i=0;
    private static IncomeRepository uniqueRepo = new IncomeRepositoryImpl();;
    private static ArrayList<Income> listIncome = new ArrayList<Income>();
    
    
    @Override
    public ArrayList<Income> getListIncome() {
        return listIncome;
    }

    @Override
    public Income save(Income exp) {
        if (exp == null) {
            throw new IllegalArgumentException();
        }
        listIncome.add(exp);
        return exp;
    }

    public static IncomeRepository instance() {
        if(uniqueRepo==null) {
            return uniqueRepo = new IncomeRepositoryImpl();
        }
        else {
            return uniqueRepo;
        }
    }    
    public void ListarRendimentos(){
        System.out.println("Rendimentos Disponiveis:\n");
        for(Income ic : getListIncome()){
            i++;
            System.out.println(i+ " - " + " Rendimento: "+ ic.getValor()+";");
        }
        System.out.println("\n");
    }
    

  
    public static IncomeRepository getUniqueRepo() {
        if (uniqueRepo == null) {
            return uniqueRepo = new IncomeRepositoryImpl();
        } else {
            return uniqueRepo;
        }
    }   

    @Override
    public Income getLista_rendimentos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
