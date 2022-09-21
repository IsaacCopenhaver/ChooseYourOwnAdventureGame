public class Weapon extends Item {
    public int damage;

    public Weapon(String name, String description, int value, int damage) {
        super(name, description, value);
        this.damage = damage;
    }
}
