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
        return contaCorr.getGastoMensalAnterior();
    }

    public int GastosSemanalAnterior() {
        return 0;
    }
    
    public int GastosMensalActual() {
        return contaCorr.getGastoMensalActual();
    }

    public int GastosSemanalActual() {
        return 0;
    }
    
    
}
