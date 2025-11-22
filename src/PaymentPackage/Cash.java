package PaymentPackage;

public class Cash implements PaymentStrategy {

    @Override
    public String getPaymentMethod() {
        return "Cash";
    }

}
