package Presentation;

import Controllers.AlertasController;
import Controllers.BaseController;
import Model.TipoAlertas;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author TOSHIBA
 */
public class AlertasUI extends BaseUI {
    
    private AlertasController cont = new AlertasController();
    
    public AlertasUI(){}
    
    @Override
    public void showBody(){
        
        List<TipoAlertas> lista = cont.getListTipoAlertas();
        int contador=0;
        for(TipoAlertas limite : lista){
            System.out.println(contador + " - " + limite.getNome());
            contador++;
        }
        
        int qqr = Console.readInteger("Selecione o tipo de Limite: ");
        
        double a = Console.readDouble("Limite Amarelo: ");
        double v = Console.readDouble("Limite vermelho: ");
        BigDecimal amarelo = new BigDecimal(a);
        BigDecimal vermelho = new BigDecimal(v);
        
        TipoAlertas ta = lista.get(qqr);
        
        cont.criarAlerta(ta, amarelo, vermelho);
        
        System.out.println("Limite guardado");
    }
    
    @Override
    public String getTitle(){
        return "Configuração de Limites";
    }
    
    @Override
    public BaseController getController(){
        return cont;
    }
}
