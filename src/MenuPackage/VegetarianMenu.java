package MenuPackage;
// Factory Class for Vegetarian Menu
public class VegetarianMenu implements MenuFactory{

    @Override
    public Menu createMenu() {
        Menu vegMenu = new Menu();
        vegMenu.addItem(new Salad("Greek salad", 80));
        vegMenu.addItem(new Salad("Yogurt salad", 70));
        vegMenu.addItem(new Salad("coleslaw", 85));
        vegMenu.addItem(new Risotto("risotto", 120));
        vegMenu.addItem(new Risotto("Mushroom risotto", 150));
        vegMenu.addItem(new Pasta("penna white sauce pasta", 155));
        vegMenu.addItem(new Pasta("cannelloni pasta", 300));
        return vegMenu;
    }
}
