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
        
        double a_s = Console.readDouble("Limite de Despesas Semanal Amarelo: ");
        double v_s = Console.readDouble("Limite de Despesas Semanal vermelho: ");
        BigDecimal amarelo_semanal = new BigDecimal(a_s);
        BigDecimal vermelho_semanal = new BigDecimal(v_s);
        
        cont.criarAlerta(0, amarelo_semanal, vermelho_semanal);
        
        double a_m = Console.readDouble("Limite de Despesas Mensal Amarelo: ");
        double v_m = Console.readDouble("Limite de Despesas Mensal Vermelho: ");
        BigDecimal amarelo_mensal = new BigDecimal(a_m);
        BigDecimal vermelho_mensal = new BigDecimal(v_m);
        
        cont.criarAlerta(1, amarelo_mensal, vermelho_mensal);
        
        double a_d = Console.readDouble("Desvio Amarelo em relação à média das despesas de um dado tipo: ");
        double v_d = Console.readDouble("Desvio Vermelho em relação à média das despesas de um dado tipo: ");
        BigDecimal amarelo_desvio = new BigDecimal(a_d);
        BigDecimal vermelho_desvio = new BigDecimal(v_d);
        
        cont.criarAlerta(2, amarelo_desvio, vermelho_desvio);
        
        double a_m_s = Console.readDouble("Limite Mínimo de Saldo Amarelo: ");
        double v_m_s = Console.readDouble("Limite Mínimo de Saldo Vermelho: ");
        BigDecimal amarelo_minimo_saldo = new BigDecimal(a_m_s);
        BigDecimal vermelho_minimo_saldo = new BigDecimal(v_m_s);
        
        cont.criarAlerta(3, amarelo_minimo_saldo, vermelho_minimo_saldo);
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
