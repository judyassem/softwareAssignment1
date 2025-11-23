import OrderPackage.*;
import MenuPackage.MenuItem;
import OrderTypePackage.*;
import PaymentPackage.*;
import java.util.List;

// GenerateReciept Class to print the order receipt
public class GenerateReciept {
    OrderTypeManager orderTypeManager = new OrderTypeManager();
    PaymentManager paymentManager = new PaymentManager();
    public void generate(OrderController orderController, List<MenuItem> items) {
        System.out.println("---------------- Order Receipt ----------------");
        for (MenuItem item : orderController.getItems().keySet()) {
            int quantity = orderController.getItems().get(item);
            System.out.println("  " + quantity +" x " + item.getName() +  " - " + (item.getPrice() * quantity) + " EGP");
        }
        System.out.println("\n  Subtotal: " + orderController.getSubtotal() + " EGP");
        System.out.println("  Total Discount: -" + orderController.getTotalDiscount() + " EGP");
        System.out.println("  Taxes for " + orderTypeManager.getOrderTypeStrategy().getOrderType() +" = "+ orderTypeManager.getTaxAmount(orderController.getSubtotal()) + " EGP");
        System.out.println("  Payment Method: " + paymentManager.getPaymentStrategy().getPaymentMethod());
        System.out.println("\n  Final Total: " + orderController.calculateFinalTotal() + " EGP");
        System.out.println("-----------------------------------------------");
    }

}
