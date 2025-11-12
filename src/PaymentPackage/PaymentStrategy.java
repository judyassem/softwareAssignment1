package PaymentPackage;

public interface PaymentStrategy {
    public void pay(double amount);
    public String getPaymentMethod();
}
