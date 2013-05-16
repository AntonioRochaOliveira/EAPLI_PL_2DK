package Model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="MEIO_PAGAMENTO")
public class MeioPagamento implements Serializable {
    
    @Id
    @Column(name="DESCRICAO")
    private String descricao;
    private TipoPagamento tipo;
    @OneToMany
    @JoinColumn(name="TIPO_PAGAMENTO")
    private String tipo_descricao = tipo.getDescricao();
            
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

    public String getTipo_descricao() {
        return tipo_descricao;
    }
    
}
