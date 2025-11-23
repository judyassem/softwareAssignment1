package MenuPackage;

import java.util.ArrayList;
import java.util.List;

// Menu Class to hold Menu Items
public class Menu {
    private List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public List<MenuItem> getItems() {
        return items;
    }

}
