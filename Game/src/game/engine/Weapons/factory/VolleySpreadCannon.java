package game.engine.Weapons.factory;

import game.engine.Weapons.Weapons;

public class VolleySpreadCannon  extends Weapons{

    private final int minRange;
    private final int maxRange;
    public VolleySpreadCannon(int BaseDamage, int minRange, int maxRange) {
        super(BaseDamage);
        this.maxRange = maxRange;
        this.minRange = minRange;
    }
    
}
