package OrderTypePackage;

public class TakeAway implements OrderTypeStrategy {
    @Override
    public double applyTaxes(double amount) {
        double tax = 24;
        return amount + tax;
    }

    @Override
    public String getOrderType() {
        return "Take-Away";
    }
}
