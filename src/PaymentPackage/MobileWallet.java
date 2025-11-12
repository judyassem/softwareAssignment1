package PaymentPackage;

public class MobileWallet implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " EGP using Mobile Wallet.");
    }

    @Override
    public String getPaymentMethod() {
        return "Mobile Wallet";
    }

}
