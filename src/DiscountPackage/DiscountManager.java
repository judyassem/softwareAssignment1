package DiscountPackage;
import MenuPackage.MenuItem;

public class DiscountManager {
    public double checkDiscounts(MenuItem Item, int quantity) {
        double discount = 0.0;

        if(Item.getName().contains("pizza")) {
            PizzaDiscount pizzaDiscount = new PizzaDiscount();
            discount = pizzaDiscount.applyDiscount(Item, quantity);
        } else if(Item.getName().contains("Kids")) {
            KidsMealDiscount kidsMealDiscount = new KidsMealDiscount();
            discount = kidsMealDiscount.applyDiscount(Item, quantity);
        } else if (Item.getName().contains("pasta")) {
            PastaDiscount pastaDiscount = new PastaDiscount();
            discount = pastaDiscount.applyDiscount(Item, quantity);
        }   
        return discount;
    }
}
