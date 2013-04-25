package Presentation;

import Controllers.BaseController;
import Model.Saving;
import eapli.util.Console;
import java.util.ArrayList;
import Controllers.StablishSavingController;
import Persistence.DuplicateSavingException;

public class StablishSavingUI extends BaseUI {

    StablishSavingController cn = new StablishSavingController();

    public String getTitle() {
        return "NOVO OBJECTIVO DE POUPANÇA";
    }

    public BaseController getController() {
        return cn;
    }

    public void showBody() {
        mainLoop();
    }

    public void mainLoop() {
        ArrayList<Saving> lista = cn.getList();
        if (lista.size() != 0) {
            System.out.println("Objectivos de poupança já existentes:");
            for (int a = 0; a < lista.size(); a++) {
                System.out.println(" - " + lista.get(a).getNome() + ";");
            }
        }

        String input = Console.readLine("Nome do tipo de rendimento a criar - deixar em branco para anular");
        while (!input.equals("")) {
            try {
                double valor = Console.readDouble("Valor");
                String desc = Console.readLine("Descrição [opcional]");
                cn.stablishSaving(input, valor, desc);
                input = "";
            } catch (DuplicateSavingException a) {
                input = Console.readLine("Já existe - introduza de novo ou deixe em branco");
            }
        }
    }
}
