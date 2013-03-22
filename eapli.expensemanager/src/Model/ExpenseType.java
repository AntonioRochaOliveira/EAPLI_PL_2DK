/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author i110341
 */
public class ExpenseType {
    
    private String name;
    
    /**
     * @create a new object ExpenseType
     */    
    protected ExpenseType() {}
    
    /**
     * @create a new object ExpenseType
     * @param name the name of ExpenseType
     */
    
    public ExpenseType( String name) {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
}
