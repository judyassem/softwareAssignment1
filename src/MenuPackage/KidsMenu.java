package MenuPackage;
// Factory Class for Kids Menu
public class KidsMenu implements MenuFactory{

    @Override
    public Menu createMenu() {
        Menu kidsMenu = new Menu();
        kidsMenu.addItem(new KidsMeal("chicken Kids meal", 180));
        kidsMenu.addItem(new KidsMeal("beef Kids meal", 200));
        kidsMenu.addItem(new Nuggets("Chicken Nuggets", 120));
        return kidsMenu;
    }
}
