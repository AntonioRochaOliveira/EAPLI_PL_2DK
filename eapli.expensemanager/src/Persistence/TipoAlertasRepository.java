package Persistence;

import Model.TipoAlertas;
import java.util.List;

/**
 *
 * @author TOSHIBA
 */
public interface TipoAlertasRepository {
    
    public List<TipoAlertas> getListTipoAlertas();
    public TipoAlertas save(TipoAlertas ta);
}
