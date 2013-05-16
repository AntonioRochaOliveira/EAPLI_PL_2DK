package Persistence.InMemory;

import Model.Alertas;
import Persistence.AlertasRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TOSHIBA
 */
public class AlertasRepositoryImpl implements AlertasRepository {
    
    private static AlertasRepository uniqueRepo = null;
    private static List<Alertas> listAlertas= new ArrayList<Alertas>();
    
    public static AlertasRepository GetInstance() {
        if (uniqueRepo == null)
            uniqueRepo = new AlertasRepositoryImpl();
        return uniqueRepo;
    }
    
    @Override
    public List<Alertas> getListAlertas(){
        return listAlertas;
    }
    
    @Override
    public Alertas save(Alertas al)
    {  if (al == null) {
            throw new IllegalArgumentException();
        }
        listAlertas.add(al);
        return al;
    }
}
