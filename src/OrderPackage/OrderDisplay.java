package OrderPackage;

import MenuPackage.Menu;
import MenuPackage.MenuItem;

import java.util.Scanner;

public class OrderDisplay {
    static Order order = new Order();

    public static void getOrder(Menu menu) {
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter the item number you want to order (or 0 to finish): ");
            int choice = sc.nextInt();

            // Exit condition
            if (choice == 0) {
                System.out.println("your orders total cost is: " +  order.getTotalCost());
                break;
            }

            int index = choice - 1;
            if (index >= 0 && index < menu.getItems().size()) {
                MenuItem item = menu.getItems().get(index);

                System.out.print("Enter quantity for " + item + ": ");
                int quantity = sc.nextInt();

                // Add to order
                order.addItem(item, quantity);
                System.out.println(quantity + " x " + item + " added to order.");

            } else {
                System.out.println("Invalid selection. Try again.");
            }
        }
    }
}
