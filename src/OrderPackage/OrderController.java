package OrderPackage;
import java.util.Map;
import java.util.LinkedHashMap;

import MenuPackage.MenuItem;

public class OrderController {
    
    private Map<MenuItem, Integer> items = new LinkedHashMap<>();
    private double totalCost;

    public void addItem(MenuItem item, int quantity) {
        items.put(item, quantity);
        totalCost += item.getPrice() * quantity;
    }

    public double getTotalCost() {
        return totalCost;
    }

}
