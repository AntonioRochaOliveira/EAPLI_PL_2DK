/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.util.Date;
import Model.Movimentos;
import java.math.BigDecimal;

/**
 *
 * @author Antonio
 */
public class Income extends Movimentos{
    IncomeTypes Tipo;
    protected Income() {}
    
    public Income( BigDecimal valor, Date dateOccurred, String descricao , IncomeTypes Tipo) {
        super(valor,dateOccurred,descricao);
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
