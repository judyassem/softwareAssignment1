package DiscountPackage;
import MenuPackage.Menu;
import MenuPackage.MenuItem;

public interface DiscountHandling {
    public double applyDiscount(MenuItem item, int quantity);
}
