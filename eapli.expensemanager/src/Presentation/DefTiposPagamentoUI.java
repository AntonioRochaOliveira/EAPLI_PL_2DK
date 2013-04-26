package Presentation;

import Controllers.BaseController;
import Controllers.DefTipoPagamentoController;
import eapli.util.Console;

public class DefTiposPagamentoUI extends BaseUI {
    
    private String title = "* * *  NOVO TIPO DE PAGAMENTO  * * *\n";
    private DefTipoPagamentoController controller = new DefTipoPagamentoController();
    
    public DefTiposPagamentoUI(){}

    @Override
    public BaseController getController() {
        return controller;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void showBody() {
        System.out.println();
        
        String descricao = Console.readLine("Nome/Descrição: ");
        
        DefTipoPagamentoController controller = new DefTipoPagamentoController();
        
        controller.NovoTipoPagamento(descricao);
        
        System.out.println("Novo Tipo de Pagamento adicionado com sucesso!");
    }
}