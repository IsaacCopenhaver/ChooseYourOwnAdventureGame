public class Item {
    private String description;
    private String name;
    private int value;
    private boolean isWeapon;
    private boolean isArmor;
    private boolean isConsumable;
    private boolean isKey;
    private boolean isQuestItem;

    public Item(String name, String description, int value, boolean isWeapon, boolean isArmor, boolean isConsumable,
            boolean isKey, boolean isQuestItem) {
        this.name = name;
        this.description = description;
        this.value = value;
        this.isWeapon = isWeapon;
        this.isArmor = isArmor;
        this.isConsumable = isConsumable;
        this.isKey = isKey;
        this.isQuestItem = isQuestItem;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isIsWeapon() {
        return this.isWeapon;
    }

    public boolean getIsWeapon() {
        return this.isWeapon;
    }

    public void setIsWeapon(boolean isWeapon) {
        this.isWeapon = isWeapon;
    }

    public boolean isIsArmor() {
        return this.isArmor;
    }

    public boolean getIsArmor() {
        return this.isArmor;
    }

    public void setIsArmor(boolean isArmor) {
        this.isArmor = isArmor;
    }

    public boolean isIsConsumable() {
        return this.isConsumable;
    }

    public boolean getIsConsumable() {
        return this.isConsumable;
    }

    public void setIsConsumable(boolean isConsumable) {
        this.isConsumable = isConsumable;
    }

    public boolean isIsKey() {
        return this.isKey;
    }

    public boolean getIsKey() {
        return this.isKey;
    }

    public void setIsKey(boolean isKey) {
        this.isKey = isKey;
    }

    public boolean isIsQuestItem() {
        return this.isQuestItem;
    }

    public boolean getIsQuestItem() {
        return this.isQuestItem;
    }

    public void setIsQuestItem(boolean isQuestItem) {
        this.isQuestItem = isQuestItem;
    }
}
