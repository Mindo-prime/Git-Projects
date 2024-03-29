package game.engine.titans;

import game.engine.interfaces.Attackee;
import game.engine.interfaces.Attacker;
import game.engine.interfaces.Mobil;

public abstract class Titan implements Attackee, Attacker, Mobil, Comparable<Titan> {
    private final int baseHealth;
    private int currentHealth;
    private final int baseDamage;
    private final int heightInMeters;
    private int distanceFromBase;
    private int speed;
    private final int resourcesValue;
    private final int dangerLevel;
    
    public Titan(int baseHealth, int baseDamage, int heightInMeters, int distanceFromBase, int speed, int resourcesValue, int dangerLevel) {
        this.baseHealth = baseHealth;
        this.baseDamage = baseDamage;
        this.heightInMeters = heightInMeters;
        this.distanceFromBase = distanceFromBase;
        this.speed = speed;
        this.resourcesValue = resourcesValue;
        this.dangerLevel = dangerLevel;
        currentHealth = baseHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        if (currentHealth < 0) {
            currentHealth = 0;
        }
        this.currentHealth = currentHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getDamage() {
        return baseDamage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            speed = 0;
        }
        this.speed = speed;
    }

    public int getResoucesValue() {
        return resourcesValue;
    }
    
    public int getResourcesValue() {
        return resourcesValue;
    }

    public int getBasehealth() {
        return baseHealth;
    }

    public int getBasedamage() {
        return baseDamage;
    }

    public int getHeightInMeters() {
        return heightInMeters;
    }

    public int getDangerLevel() {
        return dangerLevel;
    }

    public int getDistance() {
        return distanceFromBase;
    }

    public void setDistance(int Distance) {
        if (Distance < 0) {
            Distance = 0;
        }
        distanceFromBase = Distance;
    }

    public int compareTo(Titan anotherTitan) {
        return this.distanceFromBase - anotherTitan.distanceFromBase;
    }
    
}
