package AddOnPackage;

import MenuPackage.MenuItem;

public class Cheese extends AddOnDecorator{

    public Cheese(MenuItem base) {
        super(base);
    }
    @Override
    public String getDescription() {
        return "Extra Cheese";
    }

    @Override
    public String getName() {
        return base.getName() + " + Extra Cheese";
    }

    @Override
    public double getPrice() {
        return base.getPrice() + 15.0;
    }
}
