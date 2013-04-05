package Model;

public class Saving {

    private String nome;
    private double quantidade;
    private double atual;
    private String descriçao;

    public Saving(String Nome, double Quantidade, double Atual, String Descriçao) {
        setNome(Nome);
        setQuantidade(Quantidade);
        setAtual(Atual);
        setDescriçao(Descriçao);
    }

    public Saving(String Nome, double Quantidade, String Descriçao) {
        this(Nome, Quantidade, (double) 0, Descriçao);
    }

    public Saving(String Nome, double Quantidade) {
        this(Nome, Quantidade, "");
    }

    public String getNome() {
        return nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public double getAtual() {
        return atual;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setQuantidade(double Quantidade) {
        quantidade = Quantidade;
    }

    public void setDescriçao(String Descriçao) {
        descriçao = Descriçao;
    }

    public void setNome(String Nome) {
        nome = Nome;
    }

    public void setAtual(double atual) {
        this.atual = atual;
    }
}
//        throw new UnsupportedOperationException("Not yet implemented");
