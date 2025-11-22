package PaymentPackage;

public class MobileWallet implements PaymentStrategy {


    @Override
    public String getPaymentMethod() {
        return "Mobile Wallet";
    }

}
