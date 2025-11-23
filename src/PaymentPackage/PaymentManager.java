package PaymentPackage;
// PaymentManager Class to manage payment strategies
public class PaymentManager {
    private static PaymentStrategy paymentStrategy;

    public static void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        PaymentManager.paymentStrategy = paymentStrategy;
    }

    public static PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }


}
