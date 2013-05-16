package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IncomeTypes implements Serializable {

    @Id
    private int pk = 0;
    private String IncomeType;

    public IncomeTypes() {
    }

    public IncomeTypes(String IncomeType, int pk) {
        if (IncomeType == null || IncomeType == "" || pk == 0 ) {
            throw new IllegalArgumentException();
        }
        this.IncomeType = IncomeType;
        this.pk=pk;
    }

    public String getIncomeType() {
        return IncomeType;
    }

    public void setIncomeType(String IncomeType) {
        this.IncomeType = IncomeType;
    }

    public String toString() {
        return IncomeType;
    }
}
