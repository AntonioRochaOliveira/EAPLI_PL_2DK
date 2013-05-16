package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Antonio
 */
 @Entity
 @Inheritance(strategy=InheritanceType.JOINED)
public class Movimentos {
    BigDecimal amount;
    String descricao;
     @Temporal(javax.persistence.TemporalType.DATE)
    Date data;   
    @Id
    private int id;
    
    
    protected Movimentos() {}
    
    public Movimentos( BigDecimal amount, Date dateOccurred, String descricao) {
        if (descricao == null || dateOccurred == null) {
            throw new IllegalArgumentException();
        }
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        this.descricao = descricao;
        this.amount = amount;
        this.data = dateOccurred;
    }    

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Amount:" + amount + "\nDescricao: " + descricao + "\nData: " + data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}

