package game.engine.titans;

public class AbnormalTitan extends Titan {
    public static final int TITAN_CODE = 2;
    public AbnormalTitan(int Basehealth, int Basedamage, int HeightInMeters, int DistanceFromBase, int Speed, int ResourceValue, int DangerLevel) {
        super(Basehealth, Basedamage, HeightInMeters, DistanceFromBase, Speed, ResourceValue, DangerLevel);
    }
    public int compareTo(Titan anotherTitan) {
        return super.compareTo(anotherTitan);
    }
    public int getBasedamage() {
        return super.getBasedamage();
    }
    public int getBasehealth() {
        return super.getBasehealth();
    }
    public int getCurrentHealth() {
        return super.getCurrentHealth();
    }
    public int getDamage() {
        return super.getDamage();
    }
    public int getDangerLevel() {
        return super.getDangerLevel();
    }
    public int getDistance() {
        return super.getDistance();
    }
    public int getHeightInMeters() {
        return super.getHeightInMeters();
    }
    public int getResoucesValue() {
        return super.getResoucesValue();
    }
    public int getResourcesValue() {
        return super.getResourcesValue();
    }
    public int getSpeed() {
        return super.getSpeed();
    }
    public void setCurrentHealth(int CurrentHealth) {
        super.setCurrentHealth(CurrentHealth);
    }
    public void setDistance(int Distance) {
        super.setDistance(Distance);
    }
    public void setSpeed(int Speed) {
        super.setSpeed(Speed);
    }
    
}
