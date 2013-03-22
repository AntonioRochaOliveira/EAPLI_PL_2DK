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
    
    String name;
    
    protected ExpenseType() {}
    
    public ExpenseType( String name) {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }
    
    
}
