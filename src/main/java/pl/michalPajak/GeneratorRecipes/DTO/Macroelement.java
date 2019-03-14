package pl.michalPajak.GeneratorRecipes.DTO;

import pl.michalPajak.GeneratorRecipes.enums.MacroelementType;

import java.util.Objects;

public class Macroelement {
    MacroelementType macroelementType;
    int quantityKcal;

    public Macroelement(MacroelementType macroelementType, int quantityKcal) {
        this.macroelementType = macroelementType;
        this.quantityKcal = quantityKcal;
    }

    public MacroelementType getMacroelementType() {
        return macroelementType;
    }

    public void setMacroelementType(MacroelementType macroelementType) {
        this.macroelementType = macroelementType;
    }

    public int getQuantityKcal() {
        return quantityKcal;
    }

    public void setQuantityKcal(int quantityKcal) {
        this.quantityKcal = quantityKcal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Macroelement)) return false;
        Macroelement that = (Macroelement) o;
        return getQuantityKcal() == that.getQuantityKcal() &&
                getMacroelementType() == that.getMacroelementType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMacroelementType(), getQuantityKcal());
    }

    @Override
    public String toString() {
        return "Macroelement{" +
                "macroelementType=" + macroelementType +
                ", quantityKcal=" + quantityKcal +
                '}';
    }
}
