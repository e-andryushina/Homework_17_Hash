package product;

import java.util.Objects;

public class Product {
    private final String name;
    private float price;
    private float weight;

    private boolean isInBucket;

    public Product(String name, float price, float weight) {
        if (name == null || name.isBlank() || price < 0 || weight < 0) {
         throw new IllegalArgumentException("Заполните карточку товара");
        }
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.isInBucket = false;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isInBucket() {
        return isInBucket;
    }

    public void setInBucket() {
        isInBucket = true;
    }


    @Override
    public String toString() {
        String checkedProduct = this.isInBucket() ? "да" : "нет";
        return String.format ("%s , Цена: %s, Количество: %s, Куплен: %s", this.name, this.price, this.weight,
        checkedProduct);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return  Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
