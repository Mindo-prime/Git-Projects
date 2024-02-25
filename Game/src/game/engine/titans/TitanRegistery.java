package game.engine.titans;

public class TitanRegistery {
    private final int Code;
    private int BaseHealth;
    private int BaseDamage;
    private int HeightInMeters;
    private int Speed;
    private int ResourceValue;
    private int DangerLevel;

    public TitanRegistery(int Code, int BaseHealth, int BaseDamage, int HeightInMeters, int Speed, int ResourceValue, int DangerLevel) {
        this.Code = Code;
        this.BaseHealth = BaseHealth;
        this.BaseDamage = BaseDamage;
        this.HeightInMeters = HeightInMeters;
        this.Speed = Speed;
        this.ResourceValue = ResourceValue;
        this.DangerLevel = DangerLevel;
    }

    public int getCode() {
        return Code;
    }

    public int getBaseHealth() {
        return BaseHealth;
    }

    public int getBaseDamage() {
        return BaseDamage;
    }

    public int getHeightInMeters() {
        return HeightInMeters;
    }

    public int getSpeed() {
        return Speed;
    }

    public int getResourceValue() {
        return ResourceValue;
    }

    public int getDangerLevel() {
        return DangerLevel;
    }
    
}
