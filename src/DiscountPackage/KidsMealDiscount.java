package DiscountPackage;
import MenuPackage.MenuItem;

public class KidsMealDiscount implements DiscountHandling {
    @Override
    public double applyDiscount(MenuItem item, int quantity) {
        double discount = item.getBasePrice() * 0.20 * quantity;
        System.out.println("\nApplying Kids Meal Discount: -" + discount + " EGP");
        return discount;
    }

}
