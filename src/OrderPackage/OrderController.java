package OrderPackage;
import java.util.Map;
import java.util.LinkedHashMap;

import MenuPackage.MenuItem;
import OrderTypePackage.OrderTypeManager;
import OrderTypePackage.OrderTypeStrategy;

public class OrderController {

    private Map<MenuItem, Integer> items = new LinkedHashMap<>();
    private double subtotal = 0.0;
    private double totalDiscount = 0.0;

    public void addItem(MenuItem item, int quantity) {
        items.put(item, quantity);
        subtotal += item.getPrice() * quantity;
    }

    public void addDiscount(double discountAmount) {
        totalDiscount += discountAmount;
    }
    public double calculateFinalTotal() {

        double afterDiscount = subtotal - totalDiscount;
        OrderTypeStrategy orderType = OrderTypeManager.getOrderTypeStrategy();

        if (orderType != null) {
            return orderType.applyTaxes(afterDiscount);
        }

        return afterDiscount;
    }
    
    public double getSubtotal() {
        return subtotal;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public Map<MenuItem, Integer> getItems() {
        return items;
    }

}
