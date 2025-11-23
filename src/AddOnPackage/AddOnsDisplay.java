package AddOnPackage;

import MenuPackage.MenuItem;
import java.util.LinkedHashMap;
import java.util.Map;

// Display Add-Ons for a Menu Item
// Uses Decorator Pattern to show available add-ons
public class AddOnsDisplay{
    public static void displayAddOns(MenuItem menuItem) {
        Map<Integer, AddOnDecorator> addOns = new LinkedHashMap<>();
        addOns.put(1, new Cheese(menuItem));
        addOns.put(2, new ChickenTopping(menuItem));
        addOns.put(3, new Jalapeno(menuItem));
        addOns.put(4, new Sauces(menuItem));

        System.out.println("-------------- Add Ons --------------");
        for (Map.Entry<Integer, AddOnDecorator> entry : addOns.entrySet()) {
            int addOnNumber = entry.getKey();
            AddOnDecorator addOn = entry.getValue();
            double price = addOn.getPrice() - menuItem.getPrice();
            System.out.println(addOnNumber + ". " + addOn.getDescription() + " - " + price + " EGP");
        }
        System.out.println("-------------------------------------");

    }
}
