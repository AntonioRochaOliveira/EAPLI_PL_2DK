package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author TOSHIBA
 */
@Entity
public class TipoAlertas implements Serializable {
    
    @Id
    private int id;
    private String nome;
    
    public TipoAlertas() {}
    
    public TipoAlertas(int i, String n) {
        this.id = i;
        this.nome = n;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
