package OrderTypePackage;

public interface OrderTypeStrategy {
    public double applyTaxes(double amount);
    public String getOrderType();

}
