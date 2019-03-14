package pl.michalPajak.GeneratorRecipes.models.enums;

public enum MacroelementType {
    FAT("FAT", "Tłuszcz"),
    PROTEIN("PROTEIN", "Białko"),
    CARBOHYDRATES("CARBOHYDRATES", "Węglowodany"),
    ROUGHAGE("ROUGHAGE", "Błonnik"),
    SALT("SALT", "Sól"),;

    String name;
    String description;

    MacroelementType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

//    public static MacroelementType toMacroelementType(String string){
//        return;
//    }

    @Override
    public String toString() {
        return "MacroelementType{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
