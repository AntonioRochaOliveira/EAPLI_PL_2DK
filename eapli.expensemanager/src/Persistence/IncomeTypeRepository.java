/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.util.ArrayList;
import Controllers.IncomeTypeController;
import Model.IncomeTypes;
/**
 *
 * @author Joao
 */
public class IncomeTypeRepository {
    
    static ArrayList IncTypes =new ArrayList();
    
   public static ArrayList getLista(){
       return IncTypes;
   }
   
   public static void addIncomeType(IncomeTypes type){
       IncTypes.add(type);
   }
}
