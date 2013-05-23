/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.util.Date;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Antonio
 */
@Entity
@Table(name="Income")
public class Income extends Movimentos implements Serializable{
    @OneToOne
    @JoinColumn(name="IncomeType")
    private IncomeTypes Tipo;
//    @OneToOne
//    @JoinColumn(name="Valor Rendimento")
    private BigDecimal amount;
    
    protected Income() {}
    
    public Income( BigDecimal amount, Date dateOccurred, String descricao , IncomeTypes Tipo) {
        super(amount,dateOccurred,descricao);
        this.Tipo=Tipo;
    }
  
    public IncomeTypes getTipo() {
        return Tipo;
    }

    public void setTipo(IncomeTypes Tipo) {
        this.Tipo = Tipo;
    }
    
    public BigDecimal getValor(){
        return amount;
    }
    
}
