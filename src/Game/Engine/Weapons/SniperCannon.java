package game.engine.weapons;

public class SniperCannon extends Weapon{
    public static final int WEAPON_CODE = 2;
    public SniperCannon(int baseDamage) {
        super(baseDamage);
    }
    public int getDamage() {
        return super.getBaseDamage();
    }
    public static int getWeaponCode() {
        return WEAPON_CODE;
    }
}
