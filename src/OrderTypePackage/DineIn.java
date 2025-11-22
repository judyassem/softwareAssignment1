package OrderTypePackage;

public class DineIn implements OrderTypeStrategy {
    @Override
    public double applyTaxes(double amount) {
        double tax = amount * 0.26;
        return amount + tax;
    }

    @Override
    public String getOrderType() {
        return "Dine-In";
    }
}
