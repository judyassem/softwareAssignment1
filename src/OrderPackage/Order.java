package OrderPackage;

import MenuPackage.Menu;
import MenuPackage.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> orders = new ArrayList<>();
    private double totalCost;

    public void addItem(MenuItem menuItem, int quantity) {
        orders.add(menuItem);
        totalCost += menuItem.getPrice();
    }

    public double getTotalCost() {
        return totalCost;
    }

}
