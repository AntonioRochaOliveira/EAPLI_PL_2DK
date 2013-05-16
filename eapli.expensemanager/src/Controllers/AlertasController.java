package Controllers;

import Model.Alertas;
import Model.TipoAlertas;
import Persistence.AlertasRepository;
import Persistence.PersistenceFactory;
import java.math.BigDecimal;

/**
 *
 * @author TOSHIBA
 */
public class AlertasController extends BaseController {
    
    AlertasRepository repo=PersistenceFactory.buildPersistenceFactory().alertasRepository();
    
    public AlertasController() {}
    
    public void criarAlerta(int id, BigDecimal a, BigDecimal v){
        TipoAlertas t=new TipoAlertas(id, null);
        Alertas alerta=new Alertas(t, a, v);
        repo.save(alerta);
    }
}
