package Presentation;

import Controllers.BaseController;
import Controllers.TipoAlertasController;
import eapli.util.Console;

/**
 *
 * @author 112Shaggy
 */
public class TipoAlertasUI extends BaseUI{
    
    private TipoAlertasController cont = new TipoAlertasController();
    
    public TipoAlertasUI(){}
    
    @Override
    public void showBody(){
        int id = Console.readInteger("Numero do Limite: ");
        String nome = Console.readLine("Nome do Limite: ");
        cont.criarTipoAlertas(id, nome);
    }
    
    @Override
    public String getTitle(){
        return "Configuração de Tipo de Limite";
    }

    @Override
    public BaseController getController() {
        return cont;
    }
}
