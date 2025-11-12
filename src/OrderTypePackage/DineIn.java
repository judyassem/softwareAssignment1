package OrderTypePackage;

public class DineIn implements OrderTypeStrategy {
    @Override
    public double applyTaxes(double amount) {
        System.out.println("Applying dine-in taxes (+14%)");
        return amount * 0.14;
    }

    @Override
    public String getOrderType() {
        return "Dine-In";
    }
}
