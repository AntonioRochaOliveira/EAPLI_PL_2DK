/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import Persistence.*;
import Persistence.InMemory.*;
import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author TOSHIBA
 */


@Entity
public class ContaCorrente implements Serializable{
   
     @Id
     String owner;
     
  protected ContaCorrente() {
        owner ="";
    }

  public ContaCorrente( String owner) {
        if (owner == null || owner == "") {
            throw new IllegalArgumentException();
        }
        this.owner = owner;
    }

    /**
     * @return the name
     */
    public String getOwner() {
        return owner;
    }
    
    
   public int GastosMensalAnterior() {
        int total = 0;
        Date dataActual = new Date();
        List<Expense> lista_despesas = PersistenceFactory.buildPersistenceFactory().expenseRepository().getListExpense();
        for(int i=0; i<lista_despesas.size(); i++) {
            if((lista_despesas.get(i).getData().getMonth()+1)==dataActual.getMonth() && 
                    lista_despesas.get(i).getData().getYear()==dataActual.getYear()) {
                total = total + lista_despesas.get(i).getAmount().intValue();
            }
            else if(lista_despesas.get(i).getData().getMonth()==12 && dataActual.getMonth()==1 && (lista_despesas.get(i).getData().getYear()+1)==dataActual.getYear()) {
                total = total + lista_despesas.get(i).getAmount().intValue();
            }
        }
        return total;        
    }
    
    public int GastosMensalActual() {
        int total = 0;
        Date dataActual = new Date();
        List<Expense> lista_despesas = PersistenceFactory.buildPersistenceFactory().expenseRepository().getListExpense();        
        for(int i=0; i<lista_despesas.size(); i++) {
            if(lista_despesas.get(i).getData().getMonth()==dataActual.getMonth() 
                    && lista_despesas.get(i).getData().getYear()==dataActual.getYear()) {
                total = total + lista_despesas.get(i).getAmount().intValue();
            }
        }
        return total;        
    }
    
    public int GastosSemanalAnterior() {
        List<Expense> lista_despesas = PersistenceFactory.buildPersistenceFactory().expenseRepository().getListExpense();
        Calendar dataActual = Calendar.getInstance();
        dataActual.setTime(new Date());
        int total = 0;
        for(int i=0; i<lista_despesas.size(); i++) {
            Calendar data = Calendar.getInstance();
            data.setTime(lista_despesas.get(i).getData());
            if(dataActual.get(Calendar.WEEK_OF_YEAR)==data.get(Calendar.WEEK_OF_YEAR)+1)
                total = total + lista_despesas.get(i).getAmount().intValue();           
        }
        return total;
    }
    
    public int GastosSemanalActual() {
        List<Expense> lista_despesas = PersistenceFactory.buildPersistenceFactory().expenseRepository().getListExpense();
        Calendar dataActual = Calendar.getInstance();
        dataActual.setTime(new Date());
        int total = 0;
        for(int i=0; i<lista_despesas.size(); i++) {
            Calendar data = Calendar.getInstance();
            data.setTime(lista_despesas.get(i).getData());            
            if(dataActual.get(Calendar.WEEK_OF_YEAR)==data.get(Calendar.WEEK_OF_YEAR))
                total = total + lista_despesas.get(i).getAmount().intValue();           
        }
        return total;
    }
    
    
   public float getSaldo(){
        List<Expense> lista_despesas = PersistenceFactory.buildPersistenceFactory().expenseRepository().getListExpense();
        List<Income> lista_rendimentos = PersistenceFactory.buildPersistenceFactory().IncomeRepository().getListIncome();
        float saldoPositivo=0;
        float saldoNegativo=0;
        float saldo;
        BigDecimal bd1, bd2;
        
        for(int i=0;i<lista_despesas.size();i++){
            bd1=lista_despesas.get(i).getAmount();
            saldoNegativo+=bd1.floatValue();
        }
        
        for(int i=0;i<lista_rendimentos.size();i++){
            bd2=lista_rendimentos.get(i).getAmount();
            saldoPositivo+=bd2.floatValue();
        }
              
        saldo=saldoPositivo-saldoNegativo;       
       
        return saldo;
    }  
}
