/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Date;


/**
 *
 * @author Paulo Gandra Sousa
 */

public class Expense {
    
    Date data;
    String description;   
    BigDecimal amount;
    
    protected Expense() {}
    
    public Expense(String description, Date dateOccurred, BigDecimal amount) {
        if (description == null || dateOccurred == null || amount == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() ==  0) {
            throw new IllegalArgumentException();
        }
        this.data = dateOccurred;
        this.description = description;
        this.amount = amount;
    }
    
    public Expense(String description, int year, int month, int day, BigDecimal amount) {
        this( description, DateTime.newDate(year, month, day), amount);
    }
    
    public BigDecimal getAmount() {
        return amount;
    }

    public Date getData() {
        return data;
    }

    public String getDescription() {
        return description;
    }
    
    @Override
    public String toString() {
        return String.format("Descricao: %s\nData: %s\n"
                + "Montante: %d€\n", description, data, amount.intValue());
    }
    
}