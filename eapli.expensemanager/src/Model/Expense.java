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
    ExpenseType tipo;
    MeioPagamento meioPag;
    
    protected Expense() {}
    
    public Expense(String description, Date dateOccurred, BigDecimal amount, ExpenseType tipo, MeioPagamento mp) {
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
        this.tipo = tipo;
        meioPag = mp;
    }
    
    public Expense(String description, int year, int month, int day, BigDecimal amount, ExpenseType tipo, MeioPagamento mp) {
        this( description, DateTime.newDate(year, month, day), amount, tipo, mp);
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
    
    
    public ExpenseType getTipo() {
        return tipo;
    }

    public void setTipo(ExpenseType tipo) {
        this.tipo = tipo;
    }

    public MeioPagamento getMeioPag() {
        return meioPag;
    }

    public void setMeioPag(MeioPagamento meioPag) {
        this.meioPag = meioPag;
    }
    
    @Override
    public String toString() {
        return String.format("Descricao: %s\nData: %s\nMontante: %d€\nTipo de despesa: %s\nMeio de pagamento: %s", description, data, amount.intValue(), tipo.getName(), meioPag.getDescricao());
    }
    
}