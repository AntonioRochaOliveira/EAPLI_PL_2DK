package Presentation;

import Controllers.WithdrawfromSavingController;
import Model.Income;
import eapli.util.Console;

public class WithdrawfromSavingUI extends BaseUI {
    
     public void mainLoop() {
        
        System.out.println("* * *  RETIRAR DINHEIRO DE POUPANÇA  * * *\n");
        
        WithdrawfromSavingController controller = new WithdrawfromSavingController();
        
        controller.ListarPoupanças();
        
        int escolha = Console.readInteger("Escolha a Poupança de onde pretende retirar dinheiro: ");
        
        double valor = Console.readDouble("Valor que pretende retirar: ");
        
        String descricao = Console.readLine("Razão para retirar este valor: ");
        
        boolean retira = controller.tirarDePoupança(escolha-1, valor);
        
        if(retira==false){
           System.out.println("Não foi possível retirar "+valor+" Euros da poupança!");
           System.out.println("A poupança tem menos dinheiro do que o que pretende retirar!\n");
        }else{
           System.out.println("Sucesso! "+valor+" Euros retirados da Poupança!\n");
            Income i = controller.criarRendimentoPoupança(valor,descricao);
            controller.adicionarRendimentoPoupança(i);
        }
        
    }
    
}
