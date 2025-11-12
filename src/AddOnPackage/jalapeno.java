package AddOnPackage;

import MenuPackage.MenuItem;

public class Jalapeno extends Toppings{
    public Jalapeno(MenuItem base) {
        super(base);
    }

    @Override
    public String getName() {
        return base.getName() + " + Extra jalapeno topping";
    }

    @Override
    public double getPrice() {
        return base.getPrice() + 8.5;
    }
}
