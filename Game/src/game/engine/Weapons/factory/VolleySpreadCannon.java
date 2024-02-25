package game.engine.Weapons.factory;

import game.engine.Weapons.Weapons;

public class VolleySpreadCannon  extends Weapons{

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
