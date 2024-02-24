package game.engine.interfaces;

public class attackee {
    private int health;
    private int ResourcesValue;
    public int getCurrentHealth() {
        return health;
    }
    public void setCurrentHealth(int health) {
        this.health = health;
    }
    public int getResourcesValue(){
        return ResourcesValue;
    }
}
