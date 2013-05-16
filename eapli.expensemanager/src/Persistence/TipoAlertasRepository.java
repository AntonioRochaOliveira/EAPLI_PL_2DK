package Persistence;

import Model.TipoAlertas;
import java.util.List;

/**
 *
 * @author TOSHIBA
 */
public interface TipoAlertasRepository {
    
    public List<TipoAlertas> getListAlertas();
    public TipoAlertas save(TipoAlertas ta);
}
