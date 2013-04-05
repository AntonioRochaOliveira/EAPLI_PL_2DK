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
 * @author Antonio
 */
public class Income {
    int valor;
    String descricao;
    String Tipo;
    
    
    protected Income() {}
    
    public Income( int valor, Date dateOccurred, String descricao , String Tipo) {
        if (descricao == null || dateOccurred == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        this.descricao = descricao;
        this.valor = valor;
        this.Tipo=Tipo;
    }
    
    public Income( int valor, int year, int month, int day, String descricao , String Tipo) {
        this( valor, DateTime.newDate(year, month, day), descricao , Tipo);
    }
}
