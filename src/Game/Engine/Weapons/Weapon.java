package Game.Engine.Weapons;

public abstract class Weapon {
    private int BaseDamage;
    public Weapon(int BaseDamage) {
        this.BaseDamage = BaseDamage;
    }
    
    public int getBaseDamage() {
        return BaseDamage;
    }
}
