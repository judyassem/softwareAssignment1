// package OrderPackage;
// import AddOnPackage.AddOnMenu;
// import AddOnPackage.AddOnsDisplay;
// import MenuPackage.MenuItem;
// import java.util.List;
// import java.util.Scanner;
// import ObserverPackage.Order;

// public class OrderDisplay {
//     private Order order = new Order();

//     public void getOrder(List<MenuItem> menu) {
//         Scanner sc = new Scanner(System.in);
//         while (true) {
//             System.out.println("\nEnter item number (or 0 to finish): ");
//             int choice = sc.nextInt();

//             if (choice == 0) {
//                 System.out.println("\nYour order total is: " + order.getTotalCost());
//                 order.placeOrder();
//                 break;
//             }

//             int index = choice - 1;
//             if (index >= 0 && index < menu.size()) {
//                 MenuItem item = menu.get(index);

//                 System.out.println("Add-ons for " + item.getName() + "? [Y/N]");
//                 char ans = sc.next().charAt(0);

//                 if (Character.toUpperCase(ans) == 'Y') {
//                     AddOnsDisplay.displayAddOns(item);
//                     System.out.println("Select add-ons (comma separated): ");
//                     sc.nextLine(); 
//                     String[] selected = sc.nextLine().split(",");
//                     for (String s : selected) {
//                         int addOnChoice = Integer.parseInt(s.trim());
//                         item = AddOnMenu.createAddOnMenu(addOnChoice, item);
//                     }
//                 }

//                 System.out.print("Enter quantity for " + item.getName() + ": ");
//                 int quantity = sc.nextInt();

//                 order.addItem(item, quantity);
//                 System.out.println(quantity + " x " + item.getName() + " added.");
//             }
//         }
//     }
// }