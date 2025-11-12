package DiscountPackage;

public class PizzaDiscount implements DiscountHandling {
    @Override
    public double applyDiscount(double amount) {
        System.out.println("Applying Pizza Discount: " + (amount * 0.10) + " EGP");
        return amount * 0.10;
    }

}
