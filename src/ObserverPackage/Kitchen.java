package ObserverPackage;

public class Kitchen implements Observer {

    @Override
    public void update() {
        System.out.println("\nKitchen: New order received!");
    }

}
