import MenuPackage.MenuItem;
import java.util.List;
import java.util.Scanner;
public class RestaurantSystem {
    public static void main(String[] args) {

        ResturantFacade facade = new ResturantFacade();
        System.out.println("Welcome to the Restaurant System!");

        List<MenuItem> menuItems = facade.showMenu();
        System.out.println("Enter your choice of menu item(0 to finish):");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        MenuItem selectedItem = menuItems.get(choice - 1);

        System.out.println("Add-ons for " + selectedItem.getName() + "? [Y/N]");
        char ans = sc.next().charAt(0);

        if (Character.toUpperCase(ans) == 'Y') {
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
        }

        System.out.print("Enter quantity for " + selectedItem.getName() + ": ");
        int quantity = sc.nextInt();

        facade.orderTypeDisplay();
        facade.paymentDisplay();
        
        facade.placeOrder(quantity, selectedItem);
    }
}