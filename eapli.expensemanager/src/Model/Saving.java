package Model;

public class Saving {

    private String nome;
    private float quantidade;
    private float atual;
    private String descriçao;

    public Saving(String Nome, float Quantidade, float Atual, String Descriçao) {
        setNome(Nome);
        setQuantidade(Quantidade);
        setAtual(Atual);
        setDescriçao(Descriçao);
    }

    public Saving(String Nome, float Quantidade, String Descriçao) {
        this(Nome, Quantidade, (float) 0, Descriçao);
    }

    public Saving(String Nome, float Quantidade) {
        this(Nome, Quantidade, "");
    }

    public String getNome() {
        return nome;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public float getAtual() {
        return atual;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setQuantidade(float Quantidade) {
        quantidade = Quantidade;
    }

    public void setDescriçao(String Descriçao) {
        descriçao = Descriçao;
    }

    public void setNome(String Nome) {
        nome = Nome;
    }

    public void setAtual(float atual) {
        this.atual = atual;
    }
}
//        throw new UnsupportedOperationException("Not yet implemented");
