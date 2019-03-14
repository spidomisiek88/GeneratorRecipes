package pl.michalPajak.GeneratorRecipes.models.DTO;

import java.util.ArrayList;
import java.util.List;

public class RecipesList {
    private List<Recipe> recipeList;

    public RecipesList() {
        this.recipeList = new ArrayList<>();
    }

    public RecipesList(List<Recipe> recipeList) {
        this.recipeList = recipeList;
    }

    public List<Recipe> getRecipeList() {
        return recipeList;
    }

    public void setRecipeList(List<Recipe> recipeList) {
        this.recipeList = recipeList;
    }

    public void addRecipe(Recipe recipe) {
        this.recipeList.add(recipe);
    }

    public void removeRecipe(Recipe recipe) {
        this.recipeList.remove(recipe);
    }

    public Recipe findRecipe(Recipe recipe) {
        return this.recipeList.get(this.recipeList.indexOf(recipe));
    }

    public void editRecipe(int index, Recipe recipe) {
        this.recipeList.set(index, recipe);
    }
}
