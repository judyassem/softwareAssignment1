package DiscountPackage;
import MenuPackage.MenuItem;

public class PastaDiscount implements DiscountHandling {
    @Override
    public void applyDiscount(MenuItem item) {
        item.setPrice(item.getPrice() * 0.15);
        System.out.println("Applying Pasta Discount: " + item.getPrice() + " EGP");
    }
}
