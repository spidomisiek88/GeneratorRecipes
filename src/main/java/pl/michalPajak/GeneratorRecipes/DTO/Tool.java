package pl.michalPajak.GeneratorRecipes.DTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tool {
    private String name;
    private List<String> qualitys;

    public Tool(String name) {
        this.name = name;
        this.qualitys = new ArrayList<>();
    }

    public Tool(String name, List<String> qualitys) {
        this.name = name;
        this.qualitys = qualitys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getQualitys() {
        return qualitys;
    }

    public void setQualitys(List<String> qualitys) {
        this.qualitys = qualitys;
    }

    public void addQualitys(String quality) {
        this.qualitys.add(quality);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tool)) return false;
        Tool tool = (Tool) o;
        return getName().equals(tool.getName()) &&
                getQualitys().equals(tool.getQualitys());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getQualitys());
    }

    @Override
    public String toString() {
        return "Tool{" +
                "name='" + name + '\'' +
                ", qualitys=" + qualitys +
                '}';
    }
}
