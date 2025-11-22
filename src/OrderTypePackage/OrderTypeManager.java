package OrderTypePackage;

public class OrderTypeManager {
    private static OrderTypeStrategy orderTypeStrategy;

    public static void setOrderTypeStrategy(OrderTypeStrategy orderTypeStrategy) {
        OrderTypeManager.orderTypeStrategy = orderTypeStrategy;
    }

    public double applyTaxes(double amount) {
        return orderTypeStrategy.applyTaxes(amount);
    }

    public String getOrderType() {
        return orderTypeStrategy.getOrderType();
    }
}
