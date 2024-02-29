package game.engine.titans;

import game.engine.interfaces.attackee;
import game.engine.interfaces.attacker;
import game.engine.interfaces.mobil;

public abstract class Titan implements attackee, attacker, mobil, Comparable<Titan> {
    private final int Basehealth;
    private int CurrentHealth;
    private final int Basedamage;
    private final int HeightInMeters;
    private int DistanceFromBase;
    private int Speed;
    private final int ResourceValue;
    private final int DangerLevel;
    
    public Titan(int Basehealth, int Basedamage, int HeightInMeters, int DistanceFromBase, int Speed, int ResourceValue, int DangerLevel) {
        this.Basehealth = Basehealth;
        this.Basedamage = Basedamage;
        this.HeightInMeters = HeightInMeters;
        this.DistanceFromBase = DistanceFromBase;
        this.Speed = Speed;
        this.ResourceValue = ResourceValue;
        this.DangerLevel = DangerLevel;
        CurrentHealth = Basehealth;
    }

    public void setCurrentHealth(int CurrentHealth) {
        this.CurrentHealth = CurrentHealth;
    }

    public int getCurrentHealth() {
        return CurrentHealth;
    }

    public int getDamage() {
        return Basedamage;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int Speed) {
        this.Speed = Speed;
    }

    public int getResouceValue() {
        return ResourceValue;
    }

    public int getBasehealth() {
        return Basehealth;
    }

    public int getBasedamage() {
        return Basedamage;
    }

    public int getHeightInMeters() {
        return HeightInMeters;
    }

    public int getResourceValue() {
        return ResourceValue;
    }

    public int getDangerLevel() {
        return DangerLevel;
    }

    public int getDistance() {
        return DistanceFromBase;
    }

    public void setDistance(int Distance) {
        DistanceFromBase = Distance;
    }

    public int compareTo(Titan anotherTitan) {
        return this.DistanceFromBase - anotherTitan.DistanceFromBase;
    }
    
}
