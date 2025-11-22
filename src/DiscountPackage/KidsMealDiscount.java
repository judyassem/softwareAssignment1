package DiscountPackage;
import MenuPackage.MenuItem;

public class KidsMealDiscount implements DiscountHandling {
    @Override
    public void applyDiscount(MenuItem item) {
        item.setPrice(item.getPrice()* 0.20);
        System.out.println("Applying Kids Meal Discount: " + item.getPrice() + " EGP");
    }

}
