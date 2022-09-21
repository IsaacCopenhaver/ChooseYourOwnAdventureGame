import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Room kitchen = new Room("Kitchen", "A dank and dirty room buzzing with flies.");

        Room livingroom = new Room("Living Room", "A large room with a large couch.");

        Room bathroom = new Room("Bathroom", "A small room with a toilet and a sink.");

        Room bedroom = new Room("Bedroom", "A small room with a bed.");

        GameMap map = new GameMap();
        map.linkRooms(kitchen, livingroom, "north");
        map.linkRooms(livingroom, kitchen, "south");
        map.linkRooms(livingroom, bathroom, "east");
        map.linkRooms(bathroom, livingroom, "west");
        map.linkRooms(livingroom, bedroom, "west");
        map.linkRooms(bedroom, livingroom, "east");

        Player p1 = new Player();
        p1.setLocation(kitchen);

        Scanner in = new Scanner(System.in);
        kitchen.addItem(new Item("key", "A small key.", 1));
        kitchen.addItem(new Weapon("sword", "A sharp sword.", 10, 10));
        // "game loop"
        while (true) {
            // print location info
            System.out.println("You are in the " + p1.getLocation().getName());
            String command = in.next(); // single word
            if (command.equals("look")) {
                System.out.println(p1.getLocation().getDescription());
                System.out.println("Items: " + p1.getLocation().getItemList());
            } else if (command.equals("go")) {
                String direction = in.next();
                // check if direction is valid for this room
                if (p1.getLocation().hasLink(direction)) {
                    p1.setLocation(p1.getLocation().getLinkedRoom(direction));
                } else {
                    System.out.println("Bad direction.");
                }
            } else if (command.equals("pickup")) {
                String itemName = in.next();
                if (p1.getLocation().hasItem(itemName)) {
                    p1.pickUpItem(p1.getLocation().getItem(itemName));
                    System.out.println("You picked up the " + itemName);
                } else {
                    System.out.println("No such item.");
                }

            } else if (command.equals("inventory")) {
                System.out.println(p1.inventory.keySet());
            } else if (command.equals("drop")) {
                String itemName = in.next();
                p1.dropItem(itemName);
                System.out.println("You dropped the " + itemName);
            } else if (command.equals("quit")) {
                in.close();
                break;
            }
        }

    }
}
