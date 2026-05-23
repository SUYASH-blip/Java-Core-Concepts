package CollectionsProject;
import java.util.*;
public class Product {


// Medium Level Collections Framework Program
// Online Shopping Cart System


    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product ID: " + id +
                " | Name: " + name +
                " | Price: ₹" + price;
    }
}



   class ShoppingCartSystem {

        public static void main(String[] args) {

            // ArrayList for storing products
            ArrayList<Product> products = new ArrayList<>();

            products.add(new Product(101, "Keyboard", 1200));
            products.add(new Product(102, "Mouse", 700));
            products.add(new Product(103, "Monitor", 9500));
            products.add(new Product(104, "Headphones", 1800));
            products.add(new Product(105, "Laptop Stand", 1500));

            // Display all products
            System.out.println("===== AVAILABLE PRODUCTS =====");

            for (Product p : products) {
                System.out.println(p);
            }

            // Sorting products by price
            products.sort(new Comparator<Product>() {
                @Override
                public int compare(Product p1, Product p2) {
                    return Double.compare(p1.price, p2.price);
                }
            });

            System.out.println("\n===== PRODUCTS SORTED BY PRICE =====");

            for (Product p : products) {
                System.out.println(p);
            }

            // HashMap for cart
            HashMap<String, Integer> cart = new HashMap<>();

            cart.put("Keyboard", 1);
            cart.put("Mouse", 2);
            cart.put("Headphones", 1);

            System.out.println("\n===== SHOPPING CART =====");

            for (Map.Entry<String, Integer> item : cart.entrySet()) {
                System.out.println(item.getKey() +
                        " -> Quantity: " + item.getValue());
            }

            // Queue for orders
            Queue<String> orders = new LinkedList<>();

            orders.add("Order #1001");
            orders.add("Order #1002");
            orders.add("Order #1003");

            System.out.println("\n===== ORDER PROCESSING =====");

            while (!orders.isEmpty()) {
                System.out.println("Processing " + orders.poll());
            }

            // Stack for recently viewed products
            Stack<String> recentViews = new Stack<>();

            recentViews.push("Monitor");
            recentViews.push("Mouse");
            recentViews.push("Laptop Stand");

            System.out.println("\n===== RECENTLY VIEWED PRODUCTS =====");

            while (!recentViews.isEmpty()) {
                System.out.println(recentViews.pop());
            }

            // TreeSet for unique categories
            TreeSet<String> categories = new TreeSet<>();

            categories.add("Electronics");
            categories.add("Accessories");
            categories.add("Electronics");
            categories.add("Gaming");

            System.out.println("\n===== PRODUCT CATEGORIES =====");

            for (String category : categories) {
                System.out.println(category);
            }
        }
    }


