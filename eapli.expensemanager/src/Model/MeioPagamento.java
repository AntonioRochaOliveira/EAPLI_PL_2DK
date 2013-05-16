package Model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="MEIO_PAGAMENTO")
public class MeioPagamento implements Serializable {
    
    @Id
    @Column(name="DESCRICAO")
    private String descricao;
    @OneToOne
    @JoinColumn(name="TIPO_PAGAMENTO")
    private TipoPagamento tipo;
    
    protected MeioPagamento(){}
    
    public MeioPagamento(TipoPagamento tipo, String descricao){
        if (tipo == null || descricao == null) {
            throw new IllegalArgumentException();
        }
        this.tipo=tipo;
        this.descricao=descricao;
    }
    
    public TipoPagamento getTipo(){
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
