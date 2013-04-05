/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

//import Model.Rendimento;
import java.util.Date;
import Persistence.*;
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
