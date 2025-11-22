package AddOnPackage;

import MenuPackage.MenuItem;

public class Sauces extends AddOnDecorator{
    public Sauces(MenuItem base) {
        super(base);
    }

    @Override
    public String getName() {
        return base.getName() + " + Extra Sauces";
    }

    @Override
    public String getDescription() {
        return "Extra Sauces";
    }

    @Override
    public double getPrice() {
        return base.getPrice() + 10.0;
    }
}
