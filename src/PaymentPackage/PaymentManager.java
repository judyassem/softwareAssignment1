package PaymentPackage;

public class PaymentManager {
    private static PaymentStrategy paymentStrategy;

    public static void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        PaymentManager.paymentStrategy = paymentStrategy;
    }

    public static void processPayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Payment method not selected.");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
