package MenuPackage;

public abstract class MenuItem {
    protected String name;
    protected double price;

    public MenuItem() {}
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getBasePrice() {
        return price;
    }

}
