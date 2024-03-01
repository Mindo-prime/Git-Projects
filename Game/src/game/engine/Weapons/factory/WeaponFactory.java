package Game.Engine.Weapons.Factory;

import java.io.IOException;
import java.util.HashMap;

import Game.Engine.Weapons.WeaponRegistry;
import Game.Engine.Dataloader.DataLoader;

public class WeaponFactory {
    private final HashMap<Integer, WeaponRegistry> WeaponShop;
    public WeaponFactory() throws IOException{
        this.WeaponShop = DataLoader.readWeaponRegistry();
    }

    public HashMap<Integer, WeaponRegistry> getWeaponShop() {
        return WeaponShop;
    }
}
