package Persistence;

import Model.Saving;
import java.util.ArrayList;

public class SavingRepository {

    private static SavingRepository uniqueSavingsRepo = null;
    private static ArrayList<Saving> listSaving = new ArrayList();

    private SavingRepository() {
        listSaving = new ArrayList<Saving>();
    }

    public static SavingRepository getUniqueRepo() {
        if (uniqueSavingsRepo == null) {
            return uniqueSavingsRepo = new SavingRepository();
        } else {
            return uniqueSavingsRepo;
        }
    }

    public static void addSaving(Saving sav) throws DuplicateSavingException {
        for (int a = 0; a < listSaving.size(); a++) {
            if (listSaving.get(a) == sav) {
                throw new DuplicateSavingException();
            }
        }
        listSaving.add(sav);
    }

    public static ArrayList<Saving> getList() {
        ArrayList<Saving> list = new ArrayList<Saving>();
        for (Saving e : listSaving) {
            list.add(new Saving(e.getNome(), e.getQuantidade(), e.getAtual(), e.getDescriçao()));
        }
        return list;
    }
}