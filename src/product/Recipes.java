package product;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Recipes {
    private String name;
    private Map<Product, Float> products;


    public Recipes(String name, Map<Product, Float> products) {
        if (name == null || name.isBlank() || products == null || products.size() == 0) {
            throw new IllegalArgumentException("Пожалуйста, заполните все поля.");
        }
        for (Map.Entry<Product, Float> product: products.entrySet()) {
            if (product.getValue() <= 0) {
                product.setValue(1f);
            }
            else if (product.getKey() == null || product.getKey().getName().isBlank()) {
                throw new IllegalArgumentException("Пожалуйста, заполните все поля.");
            }
        }

        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public Map<Product, Float> getProducts() {
        return products;
    }

    public float getRecipePrice () {
        float sum = 0;
        for (Map.Entry<Product, Float> product: products.entrySet()) {
           sum += product.getKey().getPrice() * product.getValue();
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
        return name.equals(recipes.name) && products.equals(recipes.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, products);
    }

}
