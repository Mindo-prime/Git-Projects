package game.engine.Weapons;

public abstract class Weapons {
    private int BaseDamage;

    public Weapons(int BaseDamage) {
        this.BaseDamage = BaseDamage;
    }

    public int getBaseDamage() {
        return BaseDamage;
    }
}
