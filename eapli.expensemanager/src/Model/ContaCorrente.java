/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import Persistence.*;
import java.math.BigDecimal;

/**
 *
 * @author TOSHIBA
 */
public class ContaCorrente {
    
    private static ExpenseRepository repo;
    private static List <Expense> lista_despesas=new ArrayList();
    private static ArrayList <Income> lista_rendimentos=new ArrayList();
    
    public float getSaldo(){
        repo = ExpenseRepository.getUniqueRepo();
        float saldoPositivo=0;
        float saldoNegativo=0;
        float saldo;
        BigDecimal bd;
        
        lista_despesas=repo.getListExpense();
        //lista_rendimentos.getLista_rendimentos();
        
        for(int i=0;i<lista_despesas.size();i++){
            bd=lista_despesas.get(i).getAmount();
            saldoNegativo+=bd.floatValue();
        }
        
        for(int i=0;i<lista_rendimentos.size();i++){
            saldoPositivo+=lista_rendimentos.get(i).getValor();
        }
        
        saldo=saldoPositivo-saldoNegativo;
        
        return saldo;
    }
}