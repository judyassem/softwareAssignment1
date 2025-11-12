package ObserverPackage;
import MenuPackage.MenuItem;
import java.util.LinkedHashMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Order implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private Map<MenuItem, Integer> items = new LinkedHashMap<>();
    private double totalCost;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void addItem(MenuItem item, int quantity) {
        items.put(item, quantity);
        totalCost += item.getPrice() * quantity;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public Map<MenuItem, Integer> getItems() {
        return items;
    }

    public void placeOrder() {
        System.out.println("Order placed successfully!");
        notifyObservers();
    }

}
