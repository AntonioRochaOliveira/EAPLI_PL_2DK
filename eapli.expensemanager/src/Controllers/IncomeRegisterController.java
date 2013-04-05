package Controllers;

import java.util.Date;
import Persistence.IncomeRepository;
import Model.Income;
/**
 *
 * @author Antonio
 */
public class IncomeRegisterController {
    
    public IncomeRegisterController() {
    }

    public void registerIncome(int valor, Date date, String descriçao, String Tipo) {
        Income inc = new Income( valor, date, descriçao , Tipo);
        IncomeRepository inco = new IncomeRepository();
        inco.save(inc);
    }
}
