import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

     double getDiscountedPrice();
     void displayInfo();
}

class Electronics extends Product {
    double warranty;
    Electronics(String name, double price, double warranty) {
        super(name, price);
        this.warranty = warranty;
    }
    double getDiscountedPrice() {
        return price * 0.9; 
    }
 void displayInfo() {
        System.out.println("Electronics: " + name + ", Price: $" + price + ", Warranty: " + warranty + " years");
    }
}

class Clothing extends Product {
    String size;

    Clothing(String name, double price, String size, boolean isOrganic) {
        super(name, price);
        this.size = size;
        this.isOrganic = isOrganic;
    }
    double getDiscountedPrice() {
        return price * 0.85; 
    }
     void displayInfo() {
        System.out.println("Clothing: " + name + ", Price: $" + price + ", Size: " + size + ", Organic: " + (isOrganic ? "Yes" : "No"));
    }
}

class Groceries extends Product {
    boolean isOrganic;

    Groceries(String name, double price, boolean isOrganic) {
          super(name,price);
           this.isOrganic=isOrgainic;
}

     double getDiscountedPrice(){
         return isOrganic ? price * 0.9 : price;
       }
   void displayInfo() {
        System.out.println("Grocery: " + name + ", Price: $" + price + ", Organic: " + (isOrganic ? "Yes" : "No"));
    }
}
class ShoppingCart {
    List<Product> products;

    ShoppingCart() {
        products = new ArrayList<>();
    }

    void addProduct(Product product) {
        products.add(product);
    }

    double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getDiscountedPrice();
        }
        return total;
    }

    void displayCart() {
        System.out.println("Shopping Cart:");
        for (Product product : products) {
            product.displayInfo();
        }
        System.out.println("Total Price after Discounts: $" + calculateTotal());
    }
}
public class OnlineShoppingSystem {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new Electronics("Laptop", 1200, 2));
        cart.addProduct(new Clothing("T-Shirt", 25, "M", true));
        cart.addProduct(new Groceries("Organic Apples", 3, true));
        cart.addProduct(new Clothing("Jeans", 50, "L", false));
        cart.addProduct(new Groceries("Bananas", 1, false));

       
        cart.displayCart();//cart details are displayed here
    }
}
 
