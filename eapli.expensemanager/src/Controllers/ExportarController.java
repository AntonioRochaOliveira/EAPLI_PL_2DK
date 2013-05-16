package Controllers;

import Model.Expense;
import Model.Income;
import Persistence.ExpenseRepository;
import Persistence.PersistenceFactory;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class ExportarController extends BaseController {

    public static void exportarGastosCSV(String nome, Date data1, Date data2) throws IOException {
        FileWriter ficheiro = new FileWriter(nome);
        BufferedWriter output = new BufferedWriter(ficheiro);

        output.write("Gastos");
        List<Expense> gastos = PersistenceFactory.buildPersistenceFactory().expenseRepository().getListExpense();

        for (int i = 0; i < gastos.size(); i++) {
            output.write(gastos.get(i).getDescricao() + "," + gastos.get(i).getAmount() + "," + gastos.get(i).getMeioPag().getDescricao() + "\n");
        }

        output.close();
        ficheiro.close();
    }

//    public static void exportarReceitasCSV(String nome, Date data1, Date data2) throws IOException {
//        FileWriter ficheiro = new FileWriter(nome);
//        BufferedWriter output = new BufferedWriter(ficheiro);
//
//        output.write("Receitas");
//        List<Income> receitas = PersistenceFactory.buildPersistenceFactory().;
//
//        for (int i = 0; i < receitas.size(); i++) {
//            output.write(receitas.get(i).getDescricao() + "," + receitas.get(i).getValor() + "\n");
//        }
//
//        output.close();
//        ficheiro.close();
//    }
}
