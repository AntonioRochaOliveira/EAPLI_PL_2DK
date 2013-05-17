package Controllers;

import Model.TipoAlertas;
import Persistence.PersistenceFactory;
import Persistence.TipoAlertasRepository;

/**
 *
 * @author 112Shaggy
 */
public class TipoAlertasController extends BaseController{
    
    private TipoAlertasRepository repo = PersistenceFactory.buildPersistenceFactory().tipoAlertasRepository();
    
    public TipoAlertasController(){}
    
    public void criarTipoAlertas(int id, String nm){
        TipoAlertas ta = new TipoAlertas(id, nm);
        repo.save(ta);
    }
}
