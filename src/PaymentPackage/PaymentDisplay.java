package PaymentPackage;

import java.util.Scanner;

public class PaymentDisplay {
    
    public void showPaymentMethod() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nPayment Methods:");
        System.out.println("\n1. Cash");
        System.out.println("2. Credit Card");
        System.out.println("3. Mobile Payment");
        System.out.print("\nPlease select your payment method: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                PaymentManager.setPaymentStrategy(new Cash());
                break;
            case 2:
                PaymentManager.setPaymentStrategy(new CreditCard());
                break;
            case 3:
                PaymentManager.setPaymentStrategy(new MobileWallet());
                break;
            default:
                break;
        }
        
    }
}
