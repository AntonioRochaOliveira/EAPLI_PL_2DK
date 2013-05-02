package Controllers;

import Model.ContaCorrente;

public class BaseController {

    ContaCorrente contaCorr = new ContaCorrente();

    public BaseController() {
    }

    public float getSaldo() {
      // ToDo
        return 0;
//        return contaCorr.getSaldo();
    }
}
