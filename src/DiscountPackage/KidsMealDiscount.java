package DiscountPackage;

public class KidsMealDiscount {
    public double applyDiscount(double amount) {
        System.out.println("Applying Kids Meal Discount: " + (amount * 0.20) + " EGP");
        return amount * 0.20;
    }

}
