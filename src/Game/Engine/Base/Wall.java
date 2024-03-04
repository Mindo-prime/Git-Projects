package Game.Engine.Base;

public class Wall {
    private final int BaseHealth;
    private int CurrentHealth;
    public Wall(int BaseHealth) {
        this.BaseHealth = BaseHealth;
        CurrentHealth = BaseHealth;
    }

    public int getBaseHealth() {
        return BaseHealth;
    }

    public int getCurrentHealth() {
        return CurrentHealth;
    }

    public void setCurentHealth(int CurrentHealth) {
        this.CurrentHealth = CurrentHealth;
    }
}
