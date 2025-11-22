package DiscountPackage;
import MenuPackage.MenuItem;

public class PizzaDiscount implements DiscountHandling {
    @Override
    public double applyDiscount(MenuItem item, int quantity) {
        double discount = item.getBasePrice() * 0.15 * quantity;
        System.out.println("\nApplying Pizza Discount: -" + discount + " EGP");
        return discount;
    }

}
