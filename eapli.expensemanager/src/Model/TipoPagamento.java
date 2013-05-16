package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TIPO_PAGAMENTO")
public class TipoPagamento implements Serializable {
    
    @Id
    @JoinColumn(name="DESCRICAO")
    private String descricao;
    
    protected TipoPagamento(){}
    
    public TipoPagamento(String descricao){
        if (descricao == null) {
            throw new IllegalArgumentException();
        }
        this.descricao=descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
