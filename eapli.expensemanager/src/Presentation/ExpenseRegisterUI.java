/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.*;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Paulo Gandra Sousa
 */
class ExpenseRegisterUI extends BaseUI {

    public void mainLoop() {
        ExpenseRegisterController cont = new ExpenseRegisterController();
        if (cont.getMeioDePagamento().size() > 0 && cont.getTypeExpense().size() > 0) {
            System.out.println("* * *  Registar despesa  * * *\n");
            
            String what = Console.readLine("Descricao: ");
            Date date = Console.readDate("Data (01-01-1990): ");
            double value = Console.readDouble("Montante: ");
            System.out.println("\nLista de meios de Pagamento");
            for (int i = 0; i < cont.getMeioDePagamento().size(); i++) {
                System.out.println(cont.getMeioDePagamento().get(i));
            }
            int opc_meio = Console.readInteger("Meio de Pagamento: ");
            while (opc_meio > cont.getMeioDePagamento().size() || opc_meio < 1) {
                opc_meio = Console.readInteger("Não existe esse meio de pagamento, Insira um válido: ");
            }
            System.out.println("\nLista de tipos de Despesa");
            for (int i = 0; i < cont.getTypeExpense().size(); i++) {
                System.out.println(cont.getTypeExpense().get(i));
            }

            int opc_tipo = Console.readInteger("Tipo de Despesa: ");
            while (opc_tipo > cont.getTypeExpense().size() || opc_tipo < 1) {
                opc_tipo = Console.readInteger("Não existe esse tipo de despesa, Insira um válido: ");
            }
            BigDecimal amount = new BigDecimal(value);
            cont.registerExpense(what, date, amount, opc_tipo-1, opc_meio-1);
            System.out.println("Despesa guardada com sucesso!\n");
            System.out.println(cont.getSaldo()+"");

        }
        else
            System.out.println("Não existe tipos de despesa ou meios de pagamento!");
    }
}
