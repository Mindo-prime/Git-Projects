package game.engine.weapons;

public class VolleySpreadCannon  extends Weapon{
    public static final int WEAPON_CODE = 3;
    private final int minRange;
    private final int maxRange;
    public VolleySpreadCannon(int BaseDamage, int minRange, int maxRange) {
        super(BaseDamage);
        this.maxRange = maxRange;
        this.minRange = minRange;
    }

    public int getMinRange() {
        return minRange;
    }
    
    public int getMaxRange() {
        return maxRange;
    }

    public static int getWeaponCode() {
        return WEAPON_CODE;
    }
    
}
