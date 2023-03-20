package Map.tesk1;
import java.util.*;

public class Person {
    private String name;
    private Map<String, Integer> items;

    public Person(String name) {
        this.name = name;
        this.items = new HashMap<>();
    }

    public void addItem(String itemName, int count) {
        if (items.containsKey(itemName)) {
            int newCount = items.get(itemName) + count;
            items.put(itemName, newCount);
        } else {
            items.put(itemName, count);
        }
    }

    public void removeItem(String itemName, int count) {
        if (items.containsKey(itemName)) {
            int currentCount = items.get(itemName);
            if (count >= currentCount) {
                items.remove(itemName);
            } else {
                int newCount = currentCount - count;
                items.put(itemName, newCount);
            }
        }
    }

    public int getItemCount(String itemName) {
        return items.getOrDefault(itemName, 0);
    }

    public Map<String, Integer> getItems() {
        return items;
    }

    public String getName() {
        return name;
    }
}
