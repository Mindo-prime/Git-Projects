package game.engine.weapons;

public class WallTrap extends Weapon {
    public static final int WEAPON_CODE = 4;
    public WallTrap(int BaseDamage) {
        super(BaseDamage);
    }
    public static int getWeaponCode() {
        return WEAPON_CODE;
    }
    
}
