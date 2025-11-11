package MenuPackage;

public class Appetizers implements MenuFactory{
    @Override
    public Menu createMenu() {
        Menu appetizers = new Menu();
        appetizers.addItem(new OnionRings("Onion Rings" , 50));
        appetizers.addItem(new Fries("loaded fries", 90));
        appetizers.addItem(new Fries("curly fries", 60));
        appetizers.addItem(new Fries("french fries", 40));
        return appetizers;
    }
}
