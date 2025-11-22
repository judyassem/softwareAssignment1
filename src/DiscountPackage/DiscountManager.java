package DiscountPackage;
import MenuPackage.MenuItem;

public class DiscountManager {
    public void checkDiscounts(MenuItem Item) {
        if(Item.getName().contains("pizza")) {
            PizzaDiscount pizzaDiscount = new PizzaDiscount();
            pizzaDiscount.applyDiscount(Item);
        } else if(Item.getName().contains("Kids")) {
            KidsMealDiscount kidsMealDiscount = new KidsMealDiscount();
            kidsMealDiscount.applyDiscount(Item);
        } else if (Item.getName().contains("pasta")) {
            PastaDiscount pastaDiscount = new PastaDiscount();
            pastaDiscount.applyDiscount(Item);
        }     
    }
}
