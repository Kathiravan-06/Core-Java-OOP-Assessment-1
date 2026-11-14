import java.util.*;
class Product {
    int productId;
    String productName;
    double price;
    Product(int id, String name, double price) {
        productId = id;
        productName = name;
        this.price = price;
    }
    double calculateDiscount() {
        return 0;
    }
}
class ElectronicsProduct extends Product {
    ElectronicsProduct(int id, String name, double price) {
        super(id, name, price);
    }
    double calculateDiscount() {
        return price * 12 / 100;
    }
}
class ClothingProduct extends Product {
    ClothingProduct(int id, String name, double price) {
        super(id, name, price);
    }
    double calculateDiscount() {
        return price * 20 / 100;
    }
}
class GroceryProduct extends Product {
    GroceryProduct(int id, String name, double price) {
        super(id, name, price);
    }
    double calculateDiscount() {
        return price * 5 / 100;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        int id = sc.nextInt();
        String name = sc.next();
        double price = sc.nextDouble();
        Product product;
        switch (type) {
            case 1:
                product = new ElectronicsProduct(id, name, price);
                break;
            case 2:
                product = new ClothingProduct(id, name, price);
                break;
            default:
                product = new GroceryProduct(id, name, price);
        }
        double discount = product.calculateDiscount();
        double finalPrice = price - discount;
        System.out.println("Product ID: " + product.productId);
        System.out.println("Product Name: " + product.productName);
        System.out.printf(Locale.US, "Discount: %.2f%n", discount);
        System.out.printf(Locale.US, "Final Price: %.2f%n", finalPrice);
    }
}
