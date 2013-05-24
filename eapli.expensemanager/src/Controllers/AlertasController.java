package Controllers;

import Model.Alertas;
import Model.TipoAlertas;
import Persistence.AlertasRepository;
import Persistence.PersistenceFactory;
import Persistence.TipoAlertasRepository;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author TOSHIBA
 */
public class AlertasController extends BaseController {
    
    AlertasRepository repo=PersistenceFactory.buildPersistenceFactory().alertasRepository();
    TipoAlertasRepository repoTipo=PersistenceFactory.buildPersistenceFactory().tipoAlertasRepository();
    
    public AlertasController() {}
    
    public void criarAlerta(TipoAlertas id, BigDecimal a, BigDecimal v){
        Alertas alerta=new Alertas(id, a, v);
        repo.save(alerta);
    }
    
    public List<TipoAlertas> getListTipoAlertas(){
        return repoTipo.getListTipoAlertas();
    }
}