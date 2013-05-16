package Model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Saving implements Serializable{
    @Id
    private int pk;
    private String nome;
    private double quantidade;
    private double atual;
    private String descriçao;

    public Saving() {
    }

    public Saving(String Nome, double Quantidade, double Atual, String Descriçao, int pk) {
        this.pk=pk;
        setNome(Nome);
        setQuantidade(Quantidade);
        setAtual(Atual);
        setDescriçao(Descriçao);
    }

    public Saving(String Nome, double Quantidade, String Descriçao) {
        this(Nome, Quantidade, (double) 0, Descriçao,1);
    }

    public Saving(String Nome, double Quantidade) {
        this(Nome, Quantidade, "");
    }
    
    public double adicionarDPoupança(double quantidade){
        //retorna valor que falta para completar a poupança
        setAtual(getAtual()+quantidade);
        return getQuantidade()-getAtual();
    }
    
    public boolean retiraDPoupança(double quantidade){
        //se verdadeiro concluiu o processo com sucesso
        boolean x=false;
        if(getAtual()>quantidade){
            setAtual(getAtual()-quantidade);
            x=true;
        }
        return x;
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
