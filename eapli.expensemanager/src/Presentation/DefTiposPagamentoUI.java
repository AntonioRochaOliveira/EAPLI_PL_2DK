package Presentation;

import Controllers.BaseController;
import Controllers.DefTipoPagamentoController;
import eapli.util.Console;

public class DefTiposPagamentoUI extends BaseUI {
    public DefTiposPagamentoUI(){}
    
    public void mainLoop() {
        System.out.println("* * *  NOVO TIPO DE PAGAMENTO  * * *\n");
        
        String descricao = Console.readLine("Nome/Descrição: ");
        
        DefTipoPagamentoController controller = new DefTipoPagamentoController();
        
        controller.NovoTipoPagamento(descricao);
        
        System.out.println("Novo Tipo de Pagamento adicionado com sucesso!");
    }

    @Override
    public BaseController getController() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getTitle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void showBody() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
