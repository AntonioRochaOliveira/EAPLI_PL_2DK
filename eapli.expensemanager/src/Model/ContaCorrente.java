/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import Persistence.*;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author TOSHIBA
 */
public class ContaCorrente {
    private static ExpenseRepository despesas;
    private static IncomeRepository rendimentos;
    private static List <Expense> lista_despesas = new ArrayList();
    private static ArrayList <Income> lista_rendimentos = new ArrayList();
    
    public ContaCorrente() {}
    
    
    public int GastosMensalAnterior() {
        despesas = ExpenseRepository.getUniqueRepo();
        int total = 0;
        Date dataActual = new Date();
        List<Expense> lista_despesas = despesas.getListExpense();
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
        despesas = ExpenseRepository.getUniqueRepo();
        int total = 0;
        Date dataActual = new Date();
        lista_despesas = despesas.getListExpense();
        for(int i=0; i<lista_despesas.size(); i++) {
            if(lista_despesas.get(i).getData().getMonth()==dataActual.getMonth() 
                    && lista_despesas.get(i).getData().getYear()==dataActual.getYear()) {
                total = total + lista_despesas.get(i).getAmount().intValue();
            }
        }
        return total;        
    }
    
    public int GastosSemanalAnterior() {
        despesas = ExpenseRepository.getUniqueRepo();
        lista_despesas = despesas.getListExpense();
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
        despesas = ExpenseRepository.getUniqueRepo();
        lista_despesas = despesas.getListExpense();
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
        despesas = ExpenseRepository.getUniqueRepo();
        rendimentos = IncomeRepository.getUniqueRepo();
        float saldoPositivo=0;
        float saldoNegativo=0;
        float saldo;
        BigDecimal bd1, bd2;
        
        lista_despesas=despesas.getListExpense();
        lista_rendimentos=rendimentos.getLista_rendimentos();
        
        for(int i=0;i<lista_despesas.size();i++){
            bd1=lista_despesas.get(i).getAmount();
            saldoNegativo+=bd1.floatValue();
        }
        
        for(int i=0;i<lista_rendimentos.size();i++){
            bd2=lista_rendimentos.get(i).getValor();
            saldoPositivo+=bd2.floatValue();
        }
        
        saldo=saldoPositivo-saldoNegativo;
        
        return saldo;
    }
}