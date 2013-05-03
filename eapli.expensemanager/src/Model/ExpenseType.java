/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author i110341
 */
@Entity
public class ExpenseType implements Serializable  {
    @Id
     String name;
     String longName;
    /**
     * @create a new object ExpenseType
     */    
    protected ExpenseType() {
        name ="";
        longName= "";
    }
    
    /**
     * @create a new object ExpenseType
     * @param name the name of ExpenseType
     */
    
    public ExpenseType( String name, String longName) {
        if (name == null || name == "" || longName == null || longName == "") {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.longName = longName;
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

    /**
     * @return the longName
     */
    public String getLongName() {
        return longName;
    }

    /**
     * @param longName the longName to set
     */
    public void setLongName(String longName) {
        this.longName = longName;
    }
    
    
}
