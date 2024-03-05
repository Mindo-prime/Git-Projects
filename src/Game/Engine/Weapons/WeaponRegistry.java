package game.engine.weapons;

public class WeaponRegistry {
    private final int code;
    private int price;
    private int damage;
    private String name;
    private int maxRange;
    private int minRange;

    public WeaponRegistry(int code, int price) {
        this.code = code;
        this.price = price;
    }

    public WeaponRegistry(int code, int price, int damage, String name) {
        this.code = code;
        this.price = price;
        this.damage = damage;
        this.name = name;
    }

    public WeaponRegistry(int code, int price, int damage, String name, int maxRange, int minRange) {
        this.code = code;
        this.price = price;
        this.damage = damage;
        this.name = name;
        this.maxRange = maxRange;
        this.minRange = minRange;
    }

    public int getCode() {
        return code;
    }

    public int getPrice() {
        return price;
    }

    public int getdamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public int getMinRange() {
        return minRange;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }

    public void setminRange(int minRange) {
        this.minRange = minRange;
    }
}
