import java.util.HashMap;

public class Room {
    private String name;
    private String description;
    public HashMap<String, Item> itemList = new HashMap<>();
    public HashMap<String, Room> links = new HashMap<>();

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void addItem(Item item) {
        itemList.put(item.getName(), item);
    }

    public void removeItem(String itemName) {
        itemList.remove(itemName);
    }

    public String getItemList() {
        String items = "";
        for (String key : itemList.keySet()) {
            items += key + " ";
        }
        return items;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        if (!n.equals("")) {
            name = n;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String d) {
        if (!d.equals("")) {
            description = d;
        }
    }

    public void setLink(Room room2, String direction) {
        links.put(direction, room2);
    }

    public boolean hasLink(String direction) {
        // look in hashmap to see if direction is a key
        return links.containsKey(direction);
    }

    public Room getLinkedRoom(String direction) {
        return links.get(direction);
    }
}
