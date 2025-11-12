package ObserverPackage;

public class Kitchen implements Observer {

    @Override
    public void update() {
        System.out.println("KitchenObserver: New order received");
    }

}
