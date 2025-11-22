package AddOnPackage;

import MenuPackage.MenuItem;

public abstract class AddOnDecorator extends MenuItem{

    protected MenuItem base;

    public AddOnDecorator(MenuItem base) {
        this.base = base;
    }

    public abstract String getName();
    public abstract double getPrice();
    public double getBasePrice() {
        return base.getBasePrice();
    }
    public abstract String getDescription();
}
