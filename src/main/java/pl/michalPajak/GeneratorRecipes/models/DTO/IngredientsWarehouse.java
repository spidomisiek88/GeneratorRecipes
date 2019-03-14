package pl.michalPajak.GeneratorRecipes.models.DTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IngredientsWarehouse {
    private List<Component> componentList;

    public IngredientsWarehouse() {
        this.componentList = new ArrayList<>();
    }

    public IngredientsWarehouse(List<Component> componentList) {
        this.componentList = componentList;
    }

    public List<Component> getComponentList() {
        return componentList;
    }

    public void setComponentList(List<Component> componentList) {
        this.componentList = componentList;
    }

    public void addComponentToList(Component component) {
        this.componentList.add(component);
    }

    public void removeComponentFromList(Component component) {
        this.componentList.remove(component);
    }

    public Component findComponentInList(Component component) {
        return this.componentList.get(this.componentList.indexOf(component));
    }

    public Component checkAvailabilityComponent(Component component) {
        Component foundComponent = findComponentInList(component);

        if (foundComponent.getQuantity() < component.getQuantity())
            return null;

        return foundComponent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IngredientsWarehouse)) return false;
        IngredientsWarehouse that = (IngredientsWarehouse) o;
        return getComponentList().equals(that.getComponentList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getComponentList());
    }

    @Override
    public String toString() {
        return "IngredientsWarehouse{" +
                "componentList=" + componentList +
                '}';
    }
}
