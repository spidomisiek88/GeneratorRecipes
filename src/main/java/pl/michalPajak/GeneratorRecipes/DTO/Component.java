package pl.michalPajak.GeneratorRecipes.DTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Component {
    private String name;
    private List<Macroelement> macroelements;
    private int quantity;

    public Component() {
        this.name = "";
        this.macroelements = new ArrayList<>();
        this.quantity = 0;
    }

    public Component(String name, int quantity) {
        this.name = name;
        this.macroelements = new ArrayList<>();
        this.quantity = quantity;
    }

    public Component(String name, List<Macroelement> macroelements, int quantity) {
        this.name = name;
        this.macroelements = macroelements;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Macroelement> getMacroelements() {
        return macroelements;
    }

    public void setMacroelements(List<Macroelement> macroelements) {
        this.macroelements = macroelements;
    }

    public void addMacroelement(Macroelement macroelement) {
        this.macroelements.add(macroelement);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Component)) return false;
        Component component = (Component) o;
        return getQuantity() == component.getQuantity() &&
                getName().equals(component.getName()) &&
                getMacroelements().equals(component.getMacroelements());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMacroelements(), getQuantity());
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", macroelements=" + macroelements +
                ", quantity=" + quantity +
                '}';
    }
}
