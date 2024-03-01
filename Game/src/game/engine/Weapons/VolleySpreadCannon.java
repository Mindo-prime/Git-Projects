package game.engine.Weapons;

public class VolleySpreadCannon  extends Weapon{
    public static final int WEAPON_CODE = 3;
    private final int MinRange;
    private final int MaxRange;
    public VolleySpreadCannon(int BaseDamage, int MinRange, int MaxRange) {
        super(BaseDamage);
        this.MaxRange = MaxRange;
        this.MinRange = MinRange;
    }

    public int getMinRange() {
        return MinRange;
    }
    
    public int getMaxRange() {
        return MaxRange;
    }
}
