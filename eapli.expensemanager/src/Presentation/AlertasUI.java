package Presentation;

import Controllers.AlertasController;
import Controllers.BaseController;
import eapli.util.Console;
import java.math.BigDecimal;

/**
 *
 * @author TOSHIBA
 */
public class AlertasUI extends BaseUI {
    
    private AlertasController cont = new AlertasController();
    
    @Override
    public void showBody(){
        
        double a_s = Console.readDouble("Limite Semanal Amarelo: ");
        double v_s = Console.readDouble("Limite Semanal vermelho: ");
        BigDecimal amarelo_semanal = new BigDecimal(a_s);
        BigDecimal vermelho_semanal = new BigDecimal(v_s);
        
        cont.criarAlerta(0, amarelo_semanal, vermelho_semanal);
        
        double a_m = Console.readDouble("Limite Mensal Amarelo: ");
        double v_m = Console.readDouble("Limite Mensal Vermelho: ");
        BigDecimal amarelo_mensal = new BigDecimal(a_m);
        BigDecimal vermelho_mensal = new BigDecimal(v_m);
        
        cont.criarAlerta(1, amarelo_mensal, vermelho_mensal);
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
