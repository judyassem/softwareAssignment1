package AddOnPackage;

import MenuPackage.Menu;
import MenuPackage.MenuFactory;
import MenuPackage.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class AddOnsDisplay{
    public void displayAddOns(MenuItem menuItem) {
        int counter = 1;
        List<AddOnDecorator> addOns = new ArrayList<>();
        addOns.add(new Cheese(menuItem));
        addOns.add(new ChickenTopping(menuItem));
        addOns.add(new jalapeno(menuItem));
        addOns.add(new Sauces(menuItem));

        System.out.println("-------------- Add Ons --------------");
        for (AddOnDecorator addOn : addOns) {
            double price = addOn.getPrice() - menuItem.getPrice();
            System.out.println(counter + ". " + addOn.getName() + " - " + price + " EGP");
            counter++;
        }
        System.out.println("-------------------------------------");

    }
}
