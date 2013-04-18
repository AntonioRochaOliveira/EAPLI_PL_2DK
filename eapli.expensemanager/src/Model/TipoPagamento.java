package Model;

public class TipoPagamento {
    
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
