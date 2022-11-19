package product;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class RecipeList {
    private Set<Recipes> recipes = new HashSet<>();

    public void addRecipe(Recipes recipe) {
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("Рецепт с таким названием уже существует");
        }

        recipes.add(recipe);
    }

    public Set<Recipes> getRecipes() {
        return recipes;
    }

    @Override
    public String toString () {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список рецептов: ").append('\n');
        for (Recipes recipe : this.recipes) {
            stringBuilder.append(recipe).append('\n');
        }
        return stringBuilder.toString();
    }
}

