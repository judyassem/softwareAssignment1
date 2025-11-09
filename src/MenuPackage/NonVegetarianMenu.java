package MenuPackage;

import java.util.Scanner;

public class NonVegetarianMenu implements MenuFactory{
    @Override
    public Menu createMenu() {
        Menu nonVegMenu = new Menu();
        nonVegMenu.addItem(new Burger("Cheese MenuPackage.Burger", 200));
        nonVegMenu.addItem(new Burger("Chicken MenuPackage.Burger", 160));
        nonVegMenu.addItem(new Burger("Beef MenuPackage.Burger", 180));
        nonVegMenu.addItem(new ChickenWings("Spicy Chicken wings", 150));
        nonVegMenu.addItem(new ChickenWings("BBQ Chicken wings", 150));
        nonVegMenu.addItem(new Pizza("BBQ Chicken pizza", 140));
        nonVegMenu.addItem(new Pizza("Pepperoni pizza", 140));
        return nonVegMenu;
    }

    Scanner scan = new Scanner(System.in);

}
