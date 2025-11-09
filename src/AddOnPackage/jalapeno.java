package AddOnPackage;

import MenuPackage.MenuItem;

public class jalapeno extends Toppings{
    public jalapeno(MenuItem base) {
        super(base);
    }

    @Override
    public String getName() {
        return base.getName() + " - extra jalapeno topping";
    }

    @Override
    public double getPrice() {
        return base.getPrice() + 8.5;
    }
}
