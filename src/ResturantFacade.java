import MenuPackage.MenuDisplay;
import MenuPackage.MenuItem;
import OrderPackage.OrderController;
import PaymentPackage.PaymentDisplay;
import PaymentPackage.PaymentManager;
import ObserverPackage.*;
import AddOnPackage.*;
import OrderTypePackage.*;

import java.util.List;

import DiscountPackage.*;


public class ResturantFacade {
    private OrderController orderController;
    private OrderTypeManager orderTypeManager;
    private PaymentManager paymentManager;
    private PaymentDisplay paymentDisplay;
    private MenuDisplay menuDisplay;
    private AddOnMenu addOnMenu;
    private Order orderObserver;
    private DiscountManager discountManager;
    private AddOnsDisplay addOnsDisplay;
    private OrderTypeDisplay orderTypeDisplay;
    private OrderTypeManager orderTypeMgr;

    public ResturantFacade() {
        orderController = new OrderController();
        orderTypeManager = new OrderTypeManager();
        paymentManager = new PaymentManager();
        menuDisplay = new MenuDisplay();
        orderObserver = new Order();
        discountManager = new DiscountManager();
        addOnMenu = new AddOnMenu();
        addOnsDisplay = new AddOnsDisplay();
        orderTypeDisplay = new OrderTypeDisplay();
        orderTypeMgr = new OrderTypeManager();
        paymentDisplay = new PaymentDisplay();
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

    void placeOrder(int quantity, MenuItem item) {
        orderController.addItem(item, quantity);
        discountManager.checkDiscounts(item);
        paymentManager.processPayment(orderController.getTotalCost());
        orderObserver.myNotify();
    }
}
