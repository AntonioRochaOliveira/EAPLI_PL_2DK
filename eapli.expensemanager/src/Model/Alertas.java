/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author TOSHIBA
 */
@Entity
public class Alertas  implements Serializable{
     
    @Id
    private TipoAlertas tipo;
    private BigDecimal vermelho;
    private BigDecimal amarelo;
    
     protected Alertas() {}
 
     public Alertas(TipoAlertas t, BigDecimal a, BigDecimal v){
         this.tipo=t;
         this.amarelo=a;
         this.vermelho=v;
     }
     
     public TipoAlertas getTipo(){
         return tipo;
     }
     
     public BigDecimal getAmarelo(){
         return amarelo;
     }
     
     public BigDecimal getVermelho(){
         return vermelho;
     }
}