package OrderTypePackage;

public class Delivery implements OrderTypeStrategy {
    @Override
    public double applyTaxes(double amount) {
        double tax = 40;
        return amount + tax;
    }

    @Override
    public String getOrderType() {
        return "Delivery";
    }

}
