package OrderTypePackage;

import java.util.Scanner;
// OrderTypeDisplay Class to handle order type selection
public class OrderTypeDisplay {
    public void displayOrderType() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nOrder Types:");
        System.out.println("\n1. Dine In");
        System.out.println("2. Take Away");
        System.out.println("3. Delivery");
        System.out.print("\nPlease select your order type: ");

        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                OrderTypeManager.setOrderTypeStrategy(new DineIn());
                break;
            case 2:
                OrderTypeManager.setOrderTypeStrategy(new TakeAway());
                break;
            case 3:
                OrderTypeManager.setOrderTypeStrategy(new Delivery());
                break;
            default:
                System.out.println( "Invalid choice. Please select again.");
                displayOrderType();
                break;
        }
    }

}
