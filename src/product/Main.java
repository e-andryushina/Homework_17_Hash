package product;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введение в коллекции. Хеш и хеш-функции. Множества. ДЗ 1. Задание 1");
        Product apple = new Product("Яблоко", 150f, 1.55f);
        Product peach = new Product("Персик", 256f, 3.56f);
        Product pineapple = new Product ("Ананас", 455f, 2.55f);
        ProductList productList = new ProductList();
        productList.addProduct(apple);
        productList.addProduct(peach);
        productList.addProduct(pineapple);
        productList.checkProduct("Яблоко");
        productList.checkProduct("Персик");
        productList.checkProduct("Ананас");
        System.out.println(productList);
        productList.removeProduct("Ананас");
        System.out.println(productList);
//        Product Peach = new Product("Персик", 455f, 6f);
//        productList.addProduct(peach);


        System.out.println("Введение в коллекции. Хеш и хеш-функции. Множества. ДЗ 2. Задание 1");

        Set<Product> products = new HashSet<>();
        products.add(apple);
        products.add (peach);
        products.add(pineapple);
        Recipes fruitSalad = new Recipes("Фруктовый салат", products);
        RecipeList recipeList = new RecipeList();
        recipeList.addRecipe(fruitSalad);
        System.out.println(recipeList);

        System.out.println("Введение в коллекции. Хеш и хеш-функции. Множества. ДЗ 2. Задание 2");
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }

        System.out.println(numbers);
        Iterator <Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
