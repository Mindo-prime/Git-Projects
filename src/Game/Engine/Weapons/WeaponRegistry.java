package game.engine.weapons;

public class WeaponRegistry {
    private final int code;
    private final int price;
    private final int damage;
    private final String name;
    private final int maxRange;
    private final int minRange;

    public WeaponRegistry(int code, int price) {
        this.code = code;
        this.price = price;
        this.damage = 0;
        this.name = "";
        this.maxRange = 0;
        this.minRange = 0;
    }

    public WeaponRegistry(int code, int price, int damage, String name) {
        this.code = code;
        this.price = price;
        this.damage = damage;
        this.name = name;
        this.maxRange = 0;
        this.minRange = 0;
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

    public int getDamage() {
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
}
