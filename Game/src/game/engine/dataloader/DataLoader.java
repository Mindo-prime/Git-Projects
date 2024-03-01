package Game.Engine.Dataloader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

import Game.Engine.Titans.TitanRegistry;
import Game.Engine.Weapons.WeaponRegistry;



public class DataLoader {
    private final static String Titan_File_Name = "Game/src/titans.csv";
    private final static String Wepon_File_Name = "Game/src/weapons.csv";
    
    public static HashMap<Integer, TitanRegistry> readTitanRegistry() {
        HashMap<Integer, TitanRegistry> TitanHashMap = new HashMap<>();
        try(BufferedReader BRead = new BufferedReader(new FileReader(Titan_File_Name))){
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
                    TitanRegistry TitanRegistry = new TitanRegistry(Code, BaseHealth, BaseDamage, HeightInMeters, Speed, ResourceValue, DangerLevel);
                    TitanHashMap.put(Code, TitanRegistry);
                }
            }
        }
        catch (Exception Error) {
            Error.printStackTrace();
        }
        return TitanHashMap;
    }

    public static HashMap<Integer, WeaponRegistry> readWeaponRegistry() {
        HashMap<Integer, WeaponRegistry> WeaponsHashMap = new HashMap<>();
        try(BufferedReader BRead = new BufferedReader(new FileReader(Wepon_File_Name))){
            String Read;
            while ((Read = BRead.readLine()) != null ) {
                String[] fields = Read.split(",");
                WeaponRegistry WeaponRegistry;
                if (fields.length >= 6) {
                    int Code = Integer.parseInt(fields[0]);
                    int Price = Integer.parseInt(fields[1]);
                    int Damage = Integer.parseInt(fields[2]);
                    String Name = fields[3];
                    int MaxRange = Integer.parseInt(fields[4]);
                    int MinRange = Integer.parseInt(fields[5]); 
                    WeaponRegistry = new WeaponRegistry(Code, Price, Damage, Name, MaxRange, MinRange);
                    WeaponsHashMap.put(Code, WeaponRegistry);
                }
                else if (fields.length >= 4) {
                    int Code = Integer.parseInt(fields[0]);
                    int Price = Integer.parseInt(fields[1]);
                    int Damage = Integer.parseInt(fields[2]);
                    String Name = fields[3];
                    WeaponRegistry = new WeaponRegistry(Code, Price, Damage, Name);
                }
                else if (fields.length >= 2) {
                    int Code = Integer.parseInt(fields[0]);
                    int Price = Integer.parseInt(fields[1]);
                    WeaponRegistry = new WeaponRegistry(Code, Price);
                }
            }
        }
        catch (Exception Error) {
            Error.printStackTrace();
        }
        return WeaponsHashMap;
    }
}
