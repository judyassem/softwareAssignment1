package OrderTypePackage;

public class DineIn implements OrderTypeStrategy {
    @Override
    public double applyTaxes(double amount) {
        amount += amount * 0.26;
        System.out.println("Applying dine-in taxes (+26%)");
        return amount;
    }

    @Override
    public String getOrderType() {
        return "Dine-In";
    }
}
