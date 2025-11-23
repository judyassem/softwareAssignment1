package ObserverPackage;
// Kitchen Observer Class implementing Observer Interface
public class Kitchen implements Observer {

    @Override
    public void update() {
        System.out.println("\nKitchen : New order received! Preparing order...");
    }

}
