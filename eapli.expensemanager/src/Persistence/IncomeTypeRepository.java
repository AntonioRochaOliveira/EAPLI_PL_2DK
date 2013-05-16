package Persistence;

import Model.IncomeTypes;
import java.util.ArrayList;
import java.util.List;

public interface IncomeTypeRepository {
   public List<IncomeTypes> getLista();
   public void addIncomeType(IncomeTypes type) throws DuplicateIncomeTypeException;
}
