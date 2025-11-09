package AddOnPackage;

import MenuPackage.MenuItem;

public abstract class Toppings extends AddOnDecorator{
    public Toppings(MenuItem base) {
        super(base);
    }
}
