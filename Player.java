import java.util.HashMap;

public class Player {
    public HashMap<String, Item> inventory = new HashMap<>(10);
    private Room location;
    private String name;
    private int health;
    private int maxHealth;

    public void dropItem(String itemName) {
        if (inventory.containsKey(itemName)) {
            location.addItem(inventory.get(itemName));
            inventory.remove(itemName);
        } else {
            System.out.println("You don't have that item.");
        }
    }

    public void pickUpItem(Item item) {
        inventory.put(item.getName(), item);
        location.removeItem(item.getName());
    }

    public void useItem() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public Room getLocation() {
        return location;
    }

    public void setLocation(Room loc) {
        location = loc;
    }

}
