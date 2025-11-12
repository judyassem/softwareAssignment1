package DiscountPackage;

public class PastaDiscount implements DiscountHandling {
    @Override
    public double applyDiscount(double amount) {
        System.out.println("Applying Pasta Discount: " + (amount * 0.15) + " EGP");
        return amount * 0.15;
    }
}
