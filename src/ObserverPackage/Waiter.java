package ObserverPackage;

public class Waiter implements Observer {

    @Override
    public void update() {
        System.out.println("\nWaiter : New order received! Serving order to customer...");
    }

}
