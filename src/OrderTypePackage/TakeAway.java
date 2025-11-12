package OrderTypePackage;

public class TakeAway implements OrderTypeStrategy {
    @Override
    public double applyTaxes(double amount) {
        System.out.println("Applying Service Fees (+24 EGP)");
        return 24;
    }

    @Override
    public String getOrderType() {
        return "Take-Away";
    }
}
