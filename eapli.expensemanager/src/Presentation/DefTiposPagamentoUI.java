package Presentation;

import Controllers.DefTipoPagamentoController;
import eapli.util.Console;

public class DefTiposPagamentoUI {
    private DefTipoPagamentoController controller;
    
    public DefTiposPagamentoUI(DefTipoPagamentoController controller){
        this.controller=controller;
    }
    
    public void mainLoop() {
        System.out.println("* * *  NOVO TIPO DE PAGAMENTO  * * *\n");
        
        String descricao = Console.readLine("Nome/Descrição: ");
        
        controller.NovoTipoPagamento(descricao);
        
        System.out.println("Novo Tipo de Pagamento adicionado com sucesso!");
    }
    
    public DefTipoPagamentoController getTipoPagamentoController(){
        return controller;
    }
}
