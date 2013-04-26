package Controllers;

import Model.Income;
import Model.IncomeTypes;
import Model.Saving;
import Persistence.IncomeRepository;
import Persistence.SavingRepository;
import java.math.BigDecimal;
import java.util.Date;

public class WithdrawfromSavingController extends BaseController {
    
    public WithdrawfromSavingController(){}
    
    public void ListarPoupanças(){
    System.out.println("Poupanças Estabelecidas:\n");
        int i=0;
        for(Saving s : SavingRepository.getList()){
           i++;
           System.out.println(i+" - "+s.getNome()+" - "+s.getAtual()+" Euros;");
        }
        System.out.println("\n");
   }
    
   public boolean tirarDePoupança(int escolha, double valor){
       return SavingRepository.getList().get(escolha).retiraDPoupança(valor);
   } 
   
   public Income criarRendimentoPoupança(double valor, String descricao){
       Income i = new Income(new BigDecimal(valor),new Date(),descricao,new IncomeTypes("Valor Retirado de uma Poupança"));
       return i;
   }
   
   public void adicionarRendimentoPoupança(Income i){
       IncomeRepository.getUniqueRepo().getLista_rendimentos().add(i);
   }
    
}