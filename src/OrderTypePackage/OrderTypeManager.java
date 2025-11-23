package OrderTypePackage;
// OrderTypeManager Class to manage order type strategies
public class OrderTypeManager {
    private static OrderTypeStrategy orderTypeStrategy;

    public static void setOrderTypeStrategy(OrderTypeStrategy orderTypeStrategy) {
        OrderTypeManager.orderTypeStrategy = orderTypeStrategy;
    }

    public double applyTaxes(double amount) {
        return orderTypeStrategy.applyTaxes(amount);
    }

    public static OrderTypeStrategy getOrderTypeStrategy() {
        return orderTypeStrategy;
    }

    public double getTaxAmount(double amount) {
        double afterTax = orderTypeStrategy.applyTaxes(amount);
        return afterTax - amount;
    }
}
