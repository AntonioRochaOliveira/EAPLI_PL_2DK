/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.ExpenseType;
import Model.Income;
import Persistence.ExpenseTypeRepository;
import Persistence.IncomeRepository;
import Persistence.IncomeTypeRepository;
import java.util.ArrayList;

/**
 *
 * @author José
 */
/*public class IncomeRepositoryImpl extends JpaRepository<IncomeTypeRepository, String> implements IncomeTypeRepository{
    public class IncomeRepository {
    // class member
    int i = 0;
    private  ArrayList<Income> listincome= new ArrayList<Income>();
    private  Persistence.IncomeRepository uniqueRepo = null;
    
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
        public Persistence.IncomeRepository getUniqueRepo() {
        if (uniqueRepo == null) {
            return uniqueRepo = new Persistence.IncomeRepository() {

                @Override
                public ArrayList<Income> getListIncome() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public Income save(Income exp) {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public Income getLista_rendimentos() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };
        } else {
            return uniqueRepo;
        }
   }
   }
}
*/