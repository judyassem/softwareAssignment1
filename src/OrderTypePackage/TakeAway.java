package OrderTypePackage;

public class TakeAway implements OrderTypeStrategy {
    @Override
    public double applyTaxes(double amount) {
        amount += 24;
        System.out.println("Applying Service Fees (+24 EGP)");
        return amount;
    }

    @Override
    public String getOrderType() {
        return "Take-Away";
    }
}
