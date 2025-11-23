import MenuPackage.MenuItem;
import java.util.List;
import java.util.Scanner;

// RestaurantSystem Class to run the restaurant ordering system
public class RestaurantSystem {
    public static void main(String[] args) {

        ResturantFacade facade = new ResturantFacade();
        System.out.println("Welcome to the Restaurant System!");
        List<MenuItem> menuItems = facade.showMenu();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnter your choice of menu item(0 to finish):");
            int choice = sc.nextInt();

            if (choice == 0) {
                break;
            }

            if (choice < 1 || choice > menuItems.size()) {
                System.out.println("Invalid choice, please try again.");
                continue;
            }

            MenuItem selectedItem = menuItems.get(choice - 1);

            System.out.println("Add-ons for " + selectedItem.getName() + "? [Yes/No]");
            String ans = sc.next();

            if (ans.equalsIgnoreCase("Yes")) {
                facade.addOnsDisplay(selectedItem);
                System.out.println("Select add-ons (comma separated): ");
                sc.nextLine(); 
                String[] selected = sc.nextLine().split(",");
                List<Integer> addOnChoices = new java.util.ArrayList<>();
                for (String s : selected) {
                    int addOnChoice = Integer.parseInt(s.trim());
                    addOnChoices.add(addOnChoice);
                }
                selectedItem = facade.addAddOns(selectedItem, addOnChoices);
            } else {
                System.out.println("No add-ons selected.\n");
            }

            System.out.print("Enter quantity for " + selectedItem.getName() + ": ");
            int quantity = sc.nextInt();
            facade.addItem(selectedItem, quantity);
            
        }
        facade.orderTypeDisplay();
        facade.paymentDisplay();
        facade.placeOrder();
        facade.GenerateReciept();
    }
}