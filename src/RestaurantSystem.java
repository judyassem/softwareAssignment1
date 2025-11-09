import MenuPackage.Menu;
import MenuPackage.MenuDisplay;
import OrderPackage.Order;
import OrderPackage.OrderDisplay;

public class RestaurantSystem {
    public static void main(String[] args) {
        Menu myMenu = MenuDisplay.showMenu();
        OrderDisplay.getOrder(myMenu);
    }
}