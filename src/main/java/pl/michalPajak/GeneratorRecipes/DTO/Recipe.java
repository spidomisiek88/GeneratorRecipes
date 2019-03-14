package pl.michalPajak.GeneratorRecipes.DTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Recipe {
    private String topic;
    private String description;
    private List<Tool> tools;
    private List<Component> components;

    public Recipe(String topic, String description) {
        this.topic = topic;
        this.description = description;
        this.tools = new ArrayList<>();
        this.components = new ArrayList<>();
    }

    public Recipe(String topic, String description, List<Tool> tools, List<Component> components) {
        this.topic = topic;
        this.description = description;
        this.tools = tools;
        this.components = components;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Tool> getTools() {
        return tools;
    }

    public void setTools(List<Tool> tools) {
        this.tools = tools;
    }

    public void addTool(Tool tool) {
        this.tools.add(tool);
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe)) return false;
        Recipe recipe = (Recipe) o;
        return getTopic().equals(recipe.getTopic()) &&
                getDescription().equals(recipe.getDescription()) &&
                getTools().equals(recipe.getTools()) &&
                getComponents().equals(recipe.getComponents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTopic(), getDescription(), getTools(), getComponents());
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "topic='" + topic + '\'' +
                ", description='" + description + '\'' +
                ", tools=" + tools +
                ", components=" + components +
                '}';
    }
}
