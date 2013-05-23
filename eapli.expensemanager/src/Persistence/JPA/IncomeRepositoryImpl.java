/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.*;
import Persistence.*;
import Persistence.IncomeTypeRepository;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;


/**
 *
 * @author José
 */
public class IncomeRepositoryImpl extends JpaRepository<Income, String> implements IncomeRepository{

    @Override
    public List<Income> getListIncome() {    
        return all();
    }

}    
