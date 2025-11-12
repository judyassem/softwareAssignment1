package OrderTypePackage;

public class Delivery implements OrderTypeStrategy {
    @Override
    public double applyTaxes(double amount) {
        System.out.println("Applying Delivery Charges (+40 EGP)");
        return 40;
    }

    @Override
    public String getOrderType() {
        return "Delivery";
    }

}
