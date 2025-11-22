package AddOnPackage;

import MenuPackage.MenuItem;

public class ChickenTopping extends Toppings{
    public ChickenTopping(MenuItem base) {
        super(base);
    }

    @Override
    public String getName() {
        return base.getName() + " + Extra Chicken Topping";
    }

    @Override
    public String getDescription() {
        return "Extra Chicken Topping";
    }

    @Override
    public double getPrice() {
        return base.getPrice() + 30;
    }
}
