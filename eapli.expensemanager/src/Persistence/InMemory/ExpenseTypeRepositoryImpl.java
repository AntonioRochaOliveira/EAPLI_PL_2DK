/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.InMemory;
import Model.ExpenseType;
import Persistence.ExpenseTypeRepository;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author arocha
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class ExpenseTypeRepositoryImpl implements ExpenseTypeRepository {
//
//    static List<ExpenseType> expenseTypes = new ArrayList<ExpenseType>();
//    
//    @Override
//    public ExpenseType findForName(String key) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public ExpenseType save(ExpenseType expenseType) {
//        // TODO check if we alreay know this object or add it if not
//        expenseTypes.add(expenseType);
//        return expenseType;
//    }
//
//    @Override
//    public List<ExpenseType> all() {
//        return expenseTypes;
//    }    
//}

    
    private static ExpenseTypeRepository uniqueExpenseTypeRepo = null;
    private static List<ExpenseType> listExpenseType= new ArrayList<ExpenseType>();
   

//    private ExpenseTypeRepository() {
//        listExpenseType = new ArrayList<ExpenseType>();
//    }
    
    
    public static ExpenseTypeRepository instance(){
        if(uniqueExpenseTypeRepo==null) {
            return uniqueExpenseTypeRepo = new ExpenseTypeRepositoryImpl();
        }
        else {
            return uniqueExpenseTypeRepo;
        }
    }
    
    /**
     * @return the listExpenseType
     */
    public  List<ExpenseType> getListExpenseType() {
        List<ExpenseType> list = new ArrayList<ExpenseType>();
        for (ExpenseType e : listExpenseType) {
            list.add(new ExpenseType(e.getName(), e.getLongName()));
        }
        return list;
    }
    
    public ExpenseType save(ExpenseType expType)
    {
        if (expType==null || !validType(expType)) throw new IllegalArgumentException();
        listExpenseType.add(expType); 
        return expType;
    }
    
    public boolean validType(ExpenseType expType){
        if(listExpenseType.size()==0) return true;
        for (int i = 0; i < listExpenseType.size(); i++) {
            if(expType.getName().equals(listExpenseType.get(i).getName()))
                return false;
        }
        return true;
    }
    
    public ExpenseType getExpenseTypeByDescription(String name){
        
        int pos=0;
        for (int i = 0; i < listExpenseType.size(); i++) {
            if(listExpenseType.get(i).getName().equals(name)){
                pos=i;
            }
                
        }
        return listExpenseType.get(pos);
    }
}