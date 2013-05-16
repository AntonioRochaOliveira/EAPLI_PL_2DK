/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Alertas;
import java.util.List;

/**
 *
 * @author TOSHIBA
 */
public interface AlertasRepository {
    
    public List<Alertas> getListAlertas();
    public Alertas save(Alertas al);
}
