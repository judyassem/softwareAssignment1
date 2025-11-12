package PaymentPackage;

public class CreditCard implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " EGP using Credit Card.");
    }

    @Override
    public String getPaymentMethod() {
        return "Credit Card";
    }

}
