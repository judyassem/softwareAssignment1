package OrderPackage;
import AddOnPackage.AddOnsDisplay;
import MenuPackage.MenuItem;

import java.util.List;
import java.util.Scanner;

public class OrderDisplay {
    static Order order = new Order();

    public static void getOrder(List<MenuItem> menu) {
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
            if (index >= 0 && index < menu.size()) {
                MenuItem item = menu.get(index);

                System.out.println("Do you want addons to the order? [Y/N]: ");
                char choice2 = sc.next().charAt(0);
                if (choice2 == 'Y') {
                    AddOnsDisplay addOnsDisplay = new AddOnsDisplay();
                    addOnsDisplay.displayAddOns(item);
                }
                else if (choice2 == 'N') {
                    continue;
                }

                System.out.print("Enter quantity for " + item.getName() + ": ");
                int quantity = sc.nextInt();

                // Add to order
                order.addItem(item, quantity);
                System.out.println(quantity + " x " + item.getName() + " added to order.");

            } else {
                System.out.println("Invalid selection. Try again.");
            }
        }
    }
}
