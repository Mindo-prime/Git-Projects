package game.engine.dataloader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import game.engine.titans.TitanRegistry;
import game.engine.weapons.WeaponRegistry;

public class DataLoader {
    private static final String TITANS_FILE_NAME = "titans.csv";
    private static final String WEAPONS_FILE_NAME = "weapons.csv";
    public static HashMap<Integer, TitanRegistry> readTitanRegistry() throws IOException{
        HashMap<Integer, TitanRegistry> TitanHashMap = new HashMap<Integer, TitanRegistry>();
        try(BufferedReader BRead = new BufferedReader(new FileReader(TITANS_FILE_NAME))){
            String Read;
            while ((Read = BRead.readLine()) != null ) {
                String[] fields = Read.split(",");
                if (fields.length == 7) {
                    int code = Integer.parseInt(fields[0]);
                    int baseHealth = Integer.parseInt(fields[1]);
                    int basedamage = Integer.parseInt(fields[2]);
                    int heightInMeters = Integer.parseInt(fields[3]);
                    int speed = Integer.parseInt(fields[4]);
                    int resourcesValue = Integer.parseInt(fields[5]);
                    int dangerLevel = Integer.parseInt(fields[6]); 
                    TitanRegistry TitanRegistry = new TitanRegistry(code, baseHealth, basedamage, heightInMeters, speed, resourcesValue, dangerLevel);
                    TitanHashMap.put(code, TitanRegistry);
                }
            }
        }
        catch (Exception Error) {
            Error.printStackTrace();
        }
        return TitanHashMap;
    }
    public static HashMap<Integer, WeaponRegistry> readWeaponRegistry() {
        HashMap<Integer, WeaponRegistry> WeaponsHashMap = new HashMap<Integer, WeaponRegistry>();
        try(BufferedReader BRead = new BufferedReader(new FileReader(WEAPONS_FILE_NAME))){
            String Read;
            while ((Read = BRead.readLine()) != null ) {
                String[] fields = Read.split(",");
                WeaponRegistry WeaponRegistry;
                if (fields.length == 6) {
                    int code = Integer.parseInt(fields[0]);
                    int price = Integer.parseInt(fields[1]);
                    int damage = Integer.parseInt(fields[2]);
                    String name = fields[3];
                    int maxRange = Integer.parseInt(fields[4]);
                    int minRange = Integer.parseInt(fields[5]); 
                    WeaponRegistry = new WeaponRegistry(code, price, damage, name, maxRange, minRange);
                    WeaponsHashMap.put(code, WeaponRegistry);
                }
                else if (fields.length == 4) {
                    int code = Integer.parseInt(fields[0]);
                    int price = Integer.parseInt(fields[1]);
                    int damage = Integer.parseInt(fields[2]);
                    String name = fields[3];
                    WeaponRegistry = new WeaponRegistry(code, price, damage, name);
                    WeaponsHashMap.put(code, WeaponRegistry);
                }
            }
        }
        catch (Exception Error) {
            Error.printStackTrace();
        }
        return WeaponsHashMap;
    }
}
