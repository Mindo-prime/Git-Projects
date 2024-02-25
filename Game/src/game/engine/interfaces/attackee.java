package game.engine.interfaces;

public class attackee {
    private int Health;
    private int ResourcesValue;
    public int getCurrentHealth() {
        return Health;
    }
    public void setCurrentHealth(int Health) {
        this.Health = Health;
    }
    public int getResourcesValue(){
        return ResourcesValue;
    }
}
