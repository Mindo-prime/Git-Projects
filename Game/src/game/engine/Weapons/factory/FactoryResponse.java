package game.engine.Weapons.factory;

import game.engine.Weapons.Weapon;

public class FactoryResponse {
    private final Weapon Weapon;
    private final int RemainingResources;
    public FactoryResponse(Weapon Weapon, int RemainingResources) {
        this.Weapon = Weapon;
        this.RemainingResources = RemainingResources;
    }
    public Weapon getWeapon() {
        return Weapon;
    }
    public int getRemainingResources() {
        return RemainingResources;
    }
}
