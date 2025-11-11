import MenuPackage.MenuDisplay;
import MenuPackage.MenuItem;
import OrderPackage.Order;
import OrderPackage.OrderDisplay;

import java.util.List;

public class RestaurantSystem {
    public static void main(String[] args) {
        List<MenuItem> myMenu = MenuDisplay.showMenu();
        OrderDisplay.getOrder(myMenu);
    }
}