package Persistence;

import Model.Saving;
import java.util.List;

public interface SavingRepository {
   public List<Saving> getLista();
   public void addSaving(Saving sav) throws DuplicateSavingException;
}