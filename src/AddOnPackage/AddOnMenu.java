package AddOnPackage;
import MenuPackage.Menu;
import MenuPackage.MenuItem;

// Create Add-On Menu using Decorator Pattern
public class AddOnMenu {
    public static MenuItem createAddOnMenu (int choice, MenuItem item) {
        switch (choice) {
            case 1:
                return new Cheese(item);
            case 2:
                return new ChickenTopping(item);
            case 3:
                return new Jalapeno(item);
            case 4:
                return new Sauces(item);
            default:
                throw new IllegalArgumentException("Invalid add-on item: " + choice);
        }
    }
}