package OrderTypePackage;
// OrderTypeStrategy Interface for different order types
public interface OrderTypeStrategy {
    public double applyTaxes(double amount);
    public String getOrderType();

}
