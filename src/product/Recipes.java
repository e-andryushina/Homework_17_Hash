package product;

import java.util.Objects;
import java.util.Set;

public class Recipes {
    private String name;
    private Set<Product> products;

    public Recipes(String name, Set<Product> products) {
        if (name == null || name.isBlank() || products == null || products.size() == 0) {
        throw new IllegalArgumentException("Пожалуйста, заполните все поля.");
        }
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public float getRecipePrice () {
        float sum = 0;
        for (Product product : products) {
           sum += product.getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Recipes{" +
                "name='" + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return name.equals(recipes.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
