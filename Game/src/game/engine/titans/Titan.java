package game.engine.titans;

public abstract class Titan {
    private final int basehealth;
    private int currenthealth;
    private final int basedamage;
    private final int heightInMeters;
    private int distanceFromBase;
    private int speed;
    private final int resourceValue;
    private final int dangerLevel;
    
    public Titan(int basehealth, int basedamage, int heightInMeters, int distanceFromBase, int speed, int resourceValue, int dangerLevel) {
        this.basehealth = basehealth;
        this.basedamage = basedamage;
        this.heightInMeters = heightInMeters;
        this.distanceFromBase = distanceFromBase;
        this.speed = speed;
        this.resourceValue = resourceValue;
        this.dangerLevel = dangerLevel;
        currenthealth = basehealth;
    }

    public void setCurrentHealth(int currenthealth) {
        this.currenthealth = currenthealth;
    }

    public int getCurrentHealth() {
        return currenthealth;
    }

    public int getDamage() {
        return basedamage;
    }

    public int getDistanceFromBase() {
        return distanceFromBase;
    }

    public void setDistance(int distanceFromBase) {
        this.distanceFromBase = distanceFromBase;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getResouceValue() {
        return resourceValue;
    }

    public int compareTo(Titan anotherTitan) {
        return distanceFromBase - anotherTitan.distanceFromBase;
    }
    
}
