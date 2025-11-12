package PaymentPackage;

public class Cash implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " EGP in Cash.");
    }
    @Override
    public String getPaymentMethod() {
        return "Cash";
    }

}
