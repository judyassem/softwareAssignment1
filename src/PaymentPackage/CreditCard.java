package PaymentPackage;

public class CreditCard implements PaymentStrategy {

    @Override
    public String getPaymentMethod() {
        return "Credit Card";
    }

}
