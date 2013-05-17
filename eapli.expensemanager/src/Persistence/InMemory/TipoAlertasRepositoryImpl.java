package Persistence.InMemory;

import Model.TipoAlertas;
import Persistence.TipoAlertasRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TOSHIBA
 */
public class TipoAlertasRepositoryImpl implements TipoAlertasRepository{
    
    private static TipoAlertasRepository uniqueTipoAlertasRepo = null;
    private static List<TipoAlertas> listTipoAlertas= new ArrayList<TipoAlertas>();
    
    public static TipoAlertasRepository instance(){
        if(uniqueTipoAlertasRepo==null)
            uniqueTipoAlertasRepo = (TipoAlertasRepository) new TipoAlertasRepositoryImpl();
        return uniqueTipoAlertasRepo;
    }
    
    @Override
    public List<TipoAlertas> getListTipoAlertas(){
        return listTipoAlertas;
    }
    
    @Override
    public TipoAlertas save(TipoAlertas ta)
    {  if (ta == null) {
            throw new IllegalArgumentException();
        }
        listTipoAlertas.add(ta);
        return ta;
    }
}
