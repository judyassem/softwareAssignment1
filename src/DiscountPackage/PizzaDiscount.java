package DiscountPackage;
import MenuPackage.MenuItem;

public class PizzaDiscount implements DiscountHandling {
    @Override
    public void applyDiscount(MenuItem item) {
        item.setPrice(item.getPrice() * 0.15);
        System.out.println("Applying Pizza Discount: " + item.getPrice() + " EGP");
    }

}
