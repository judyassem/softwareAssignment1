package MenuPackage;
import java.util.*;

public class MenuDisplay {
    public static List<MenuItem> showMenu() {
        int counter = 1;
        Menu menu;

        System.out.println("-------------- MENU --------------");
        Map<String, Menu> menuMap = new LinkedHashMap<>();
        menuMap.put("Vegetarian Menu" , new VegetarianMenu().createMenu());
        menuMap.put("Non Vegetarian Menu" , new NonVegetarianMenu().createMenu());
        menuMap.put("Kids Menu" , new KidsMenu().createMenu());
        menuMap.put("Appetizers" , new Appetizers().createMenu());

        List<MenuItem> menuItems = new ArrayList<>();

        for (Map.Entry<String, Menu> menuEntry : menuMap.entrySet()) {
            String menuName = menuEntry.getKey();
            menu = menuEntry.getValue();
            System.out.println("-----------" + menuName + "------------");
            for (MenuItem item : menu.getItems()) {
                System.out.println(counter + ". " + item.getName() + " - " + item.getPrice() + " EGP");
                menuItems.add(item);
                counter++;
            }
        }

        System.out.println("----------------------------------");

        return menuItems;
    }

}
