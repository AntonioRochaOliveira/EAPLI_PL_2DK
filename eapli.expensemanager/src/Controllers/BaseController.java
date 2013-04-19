package Controllers;

import Model.ContaCorrente;

public class BaseController {
    ContaCorrente contaCorr = ContaCorrente.instance();
    public BaseController() {
    }
    
    public float getSaldo(){
        return contaCorr.getSaldo();
    }
}
