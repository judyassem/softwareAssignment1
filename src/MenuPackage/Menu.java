package MenuPackage;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void display() {
        System.out.println("-------------- MENU --------------");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(i+1 + ". " + items.get(i).getName() + " - " + items.get(i).getPrice() + " EGP");
        }
        System.out.println("-----------------------------------");
    }
}
