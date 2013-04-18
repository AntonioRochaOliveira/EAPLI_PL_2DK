package Presentation;

import Controllers.DefTipoPagamentoController;
import eapli.util.Console;

public class DefTiposPagamentoUI {
    public DefTiposPagamentoUI(){}
    
    public void mainLoop() {
        System.out.println("* * *  NOVO TIPO DE PAGAMENTO  * * *\n");
        
        String descricao = Console.readLine("Nome/Descrição: ");
        
        DefTipoPagamentoController controller = new DefTipoPagamentoController();
        
        controller.NovoTipoPagamento(descricao);
        
        System.out.println("Novo Tipo de Pagamento adicionado com sucesso!");
    }
}
