/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.util.*;

/**
 *
 * @author i110558
 */
public class GastosController extends BaseController {
    public GastosController() {}
    
    public int GastosMensalAnterior() {
        return contaCorr.GastosMensalAnterior();
    }

    public int GastosSemanalAnterior() {
        return contaCorr.GastosSemanalAnterior();
    }
    
    public int GastosMensalActual() {
        return contaCorr.GastosMensalActual();
    }

    public int GastosSemanalActual() {
        return contaCorr.GastosSemanalActual();
    }
    
    
}
