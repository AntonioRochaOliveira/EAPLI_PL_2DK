package Model;

public class MeioPagamento {
    
    private TipoPagamento tipo;
    
    private String descricao;
    
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
