package ObserverPackage;

public class Waiter implements Observer {

    @Override
    public void update() {
        System.out.println("WaiterObserver: New order received");
    }

}
