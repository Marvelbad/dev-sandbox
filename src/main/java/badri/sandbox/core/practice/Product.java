package badri.sandbox.core.practice;

import lombok.Getter;

import java.util.Comparator;

public class Product {
    @Getter
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static Comparator<Product> byName = new Comparator<Product>() {
        public int compare(Product o1, Product o2) {
            return o1.getName().compareToIgnoreCase(o2.getName());
        }
    };

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
