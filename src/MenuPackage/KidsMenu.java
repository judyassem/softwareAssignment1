package MenuPackage;

public class KidsMenu implements MenuFactory{

    @Override
    public Menu createMenu() {
        Menu kidsMenu = new Menu();
        kidsMenu.addItem(new Fries("loaded fries", 90));
        kidsMenu.addItem(new Fries("curly fries", 60));
        kidsMenu.addItem(new KidsMeal("chicken Kids meal", 180));
        kidsMenu.addItem(new KidsMeal("beef Kids meal", 200));
        kidsMenu.addItem(new Nuggets("Chicken MenuPackage.Nuggets", 120));
        return kidsMenu;
    }
}
