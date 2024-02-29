package game.engine.dataloader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

import game.engine.titans.TitanRegistry;
import game.engine.Weapons.WeaponRegistry;

public class DataLoader {
    private final String Titan_File_Name;
    private final String Wepon_File_Name;
    public DataLoader(String Titan_File_Name, String Wepon_File_Name) {
        this.Titan_File_Name = Titan_File_Name;
        this.Wepon_File_Name = Wepon_File_Name;
    }
    public static HashMap<Integer, TitanRegistry> readTitanRegistry() {
        HashMap<Integer, TitanRegistry> TitanHashMap = new HashMap<>();
        try(BufferedReader BRead = new BufferedReader(new FileReader("Game/src/titans.csv"))){
            String Read;
            while ((Read = BRead.readLine()) != null ) {
                String[] fields = Read.split(",");
                if (fields.length >= 7) {
                    int Code = Integer.parseInt(fields[0]);
                    int BaseHealth = Integer.parseInt(fields[1]);
                    int BaseDamage = Integer.parseInt(fields[2]);
                    int HeightInMeters = Integer.parseInt(fields[3]);
                    int Speed = Integer.parseInt(fields[4]);
                    int ResourceValue = Integer.parseInt(fields[5]);
                    int DangerLevel = Integer.parseInt(fields[6]); 
                    // Create a new TitanRegistry and add it to the map
                TitanRegistry TitanRegistry = new TitanRegistry(Code, BaseHealth, BaseDamage, HeightInMeters, Speed, ResourceValue, DangerLevel);
                    TitanHashMap.put(Code, TitanRegistry);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return TitanHashMap;
    }
    public static HashMap<Integer, WeaponRegistry> readWeaponRegistry() {
        HashMap<Integer, WeaponRegistry> WeaponsHashMap = new HashMap<>();
        try(BufferedReader BRead = new BufferedReader(new FileReader("Game/src/weapons.csv"))){
            String Read;
            while ((Read = BRead.readLine()) != null ) {
                String[] fields = Read.split(",");
                if (fields.length >= 6) {
                    int Code = Integer.parseInt(fields[0]);
                    int Price = Integer.parseInt(fields[1]);
                    int Damage = Integer.parseInt(fields[2]);
                    String Name = fields[3];
                    int MaxRange = Integer.parseInt(fields[4]);
                    int MinRange = Integer.parseInt(fields[5]); 
                    // Create a new WeaponRegistry and add it to the map
                WeaponRegistry WeaponRegistry = new WeaponRegistry(Code, Price, Damage, Name, MaxRange, MinRange);
                    WeaponsHashMap.put(Code, WeaponRegistry);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return WeaponsHashMap;
    }
}
