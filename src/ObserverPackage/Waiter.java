package ObserverPackage;

public class Waiter implements Observer {

    @Override
    public void update() {
        System.out.println("Waiter: New order received");
    }

}
