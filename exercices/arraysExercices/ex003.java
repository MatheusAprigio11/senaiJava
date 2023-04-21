package exercices;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

class Product{
    private double price;
    private int quantity;

    public Product(double price, int quantity){
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}


public class ex003 {
    public static void main(String[] args) {
        Map<String, Product> listProduct = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--PRIJOLA STORE--");
            System.out.println("1 - Do you want to add a new product?");
            System.out.println("2 - Do you want to update?");
            System.out.println("3 - Do you want to search a product?");
            System.out.println("4 - Show the listProducts");
            System.out.println("5 - QUIT");
            System.out.println("Select>> ");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Input the name of product>> ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Input de price of product>> ");
                    double price = sc.nextDouble();
                    System.out.println("Input the quantity of product>> ");
                    int quantity = sc.nextInt();
                    Product product = new Product(price, quantity);
                    listProduct.put(name, product);
                    break;

                case 2:
                    System.out.println("Insert the name of the product: ");
                    name = sc.nextLine();
                    if (listProduct.containsKey(name)) {

                        product = listProduct.get(name);
                        System.out.println("Input the new price of product>> ");
                        price = sc.nextDouble();
                        System.out.println("Input the new quantity of product>> ");
                        quantity = sc.nextInt();

                        product.setPrice(price);
                        product.setQuantity(quantity);
                        System.out.println("The price and quantity has been updated");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 3:
                    System.out.println("What product do you wanna know? Insert the name>>");
                    name = sc.nextLine();

                    if (listProduct.containsKey(name)) {
                        product = listProduct.get(name);

                        System.out.println("price: " + product.getPrice());
                        System.out.println("quantity: " + product.getQuantity());
                    } else {
                        System.out.println("Product not found");
                    }
                    break;

                case 4:
                    for(String key : listProduct.keySet()) {
                        product = listProduct.get(key);
                        System.out.println("Product: " + key + " - price: "+ product.getPrice() + " - quantity: " + product.getQuantity());
                    }
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}
