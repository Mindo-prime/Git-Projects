package Game.Engine.Weapons;

public class WeaponRegistry {
    private final int Code;
    private int Price;
    private int Damage;
    private String Name;
    private int MaxRange;
    private int MinRange;

    public WeaponRegistry(int Code, int Price) {
        this.Code = Code;
        this.Price = Price;
    }

    public WeaponRegistry(int Code, int Price, int Damage, String Name) {
        this.Code = Code;
        this.Price = Price;
        this.Damage = Damage;
        this.Name = Name;
    }

    public WeaponRegistry(int Code, int Price, int Damage, String Name, int MaxRange, int MinRange) {
        this.Code = Code;
        this.Price = Price;
        this.Damage = Damage;
        this.Name = Name;
        this.MaxRange = MaxRange;
        this.MinRange = MinRange;
    }

    public int getCode() {
        return Code;
    }

    public int getPrice() {
        return Price;
    }

    public int getDamage() {
        return Damage;
    }

    public String getName() {
        return Name;
    }

    public int getMaxRange() {
        return MaxRange;
    }

    public int getMinRange() {
        return MinRange;
    }
    
}
