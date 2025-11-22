package OrderTypePackage;

public class Delivery implements OrderTypeStrategy {
    @Override
    public double applyTaxes(double amount) {
        amount +=  40;
        System.out.println("Applying Delivery Charges (+40 EGP)");
        return amount;
    }

    @Override
    public String getOrderType() {
        return "Delivery";
    }

}
