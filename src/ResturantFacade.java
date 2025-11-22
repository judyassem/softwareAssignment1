import MenuPackage.Menu;
import MenuPackage.MenuDisplay;
import MenuPackage.MenuItem;
import OrderPackage.OrderController;
import PaymentPackage.PaymentDisplay;
import PaymentPackage.PaymentManager;
import ObserverPackage.*;
import AddOnPackage.*;
import OrderTypePackage.*;
import java.util.List;
import java.util.Map;
import DiscountPackage.*;


public class ResturantFacade {
    private OrderController orderController;
    private PaymentDisplay paymentDisplay;
    private MenuDisplay menuDisplay;
    private AddOnMenu addOnMenu;
    private Order orderObserver;
    private DiscountManager discountManager;
    private AddOnsDisplay addOnsDisplay;
    private OrderTypeDisplay orderTypeDisplay;
    private Kitchen kitchen;
    private Waiter waiter;


    public ResturantFacade() {
        orderController = new OrderController();
        menuDisplay = new MenuDisplay();
        orderObserver = new Order();
        discountManager = new DiscountManager();
        addOnMenu = new AddOnMenu();
        addOnsDisplay = new AddOnsDisplay();
        orderTypeDisplay = new OrderTypeDisplay();
        paymentDisplay = new PaymentDisplay();
        kitchen = new Kitchen();
        waiter = new Waiter();
    }

    public List<MenuPackage.MenuItem> showMenu() {
        return menuDisplay.showMenu();
    }

    public void addOnsDisplay(MenuItem item) {
        addOnsDisplay.displayAddOns(item);
    }

    public void orderTypeDisplay() {
        orderTypeDisplay.displayOrderType();
    }
    
    public void paymentDisplay() {
        paymentDisplay.showPaymentMethod();
    }

    public MenuItem addAddOns(MenuItem item, List<Integer> addOnChoices) {
        for (int choice : addOnChoices) {
            item = addOnMenu.createAddOnMenu(choice, item);
        }
        return item;
    }

    public void addItem(MenuItem item, int quantity) {
        orderController.addItem(item, quantity);
    }

    public void GenerateReciept() {
        GenerateReciept receipt = new GenerateReciept();
        receipt.generate(orderController, null);
    }

    void placeOrder() {
        for(Map.Entry<MenuItem, Integer> entry : orderController.getItems().entrySet()) {
            MenuItem currentItem = entry.getKey();
            int currentQuantity = entry.getValue();
            double discount = discountManager.checkDiscounts(currentItem,currentQuantity);
            orderController.addDiscount(discount);
        }
        orderObserver.registerObserver(kitchen);
        orderObserver.registerObserver(waiter);
        orderObserver.myNotify();
    }
}
