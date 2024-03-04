package Game.Engine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

import Game.Engine.Base.Wall;
import Game.Engine.Dataloader.DataLoader;
import Game.Engine.Lanes.Lane;
import Game.Engine.Titans.Titan;
import Game.Engine.Titans.TitanRegistry;
import Game.Engine.Weapons.Factory.WeaponFactory;

public class Battle {
    private final int[][] Phase_Approaching_Titans;
    private final int Wall_Base_Health;
    private int NumberOfTurns;
    private int ResourceGathered;
    private BattlePhase BattlePhase;
    private int NumberOfTitansPerTurn;
    private int Score;
    private int TitanSpawnDistance;
    private final WeaponFactory WeaponFactory;
    private final HashMap<Integer, TitanRegistry> TitanArchives;
    private final ArrayList<Titan> Approaching_Titans;
    private final PriorityQueue<Lane> Lanes;
    private final ArrayList<Lane> OriginalLanes;
    public Battle(int NumberOfTurns, int Score, int TitanSpawnDistance, int InitialNumOfLanes, int InitialResourcesPerLane) throws IOException{
        this.Phase_Approaching_Titans = new int[][]{{1},{2},{3},{4}};
        this.Wall_Base_Health = 10000;
        this.NumberOfTurns = NumberOfTurns;
        this.ResourceGathered = InitialNumOfLanes * InitialResourcesPerLane;
        this.BattlePhase = BattlePhase.Early;
        this.NumberOfTitansPerTurn = 1;
        this.Score = Score;
        this.TitanSpawnDistance = TitanSpawnDistance;
        this.WeaponFactory = new WeaponFactory();
        this.TitanArchives = DataLoader.readTitanRegistry();
        this.Approaching_Titans = new ArrayList<Titan>();
        this.Lanes = new PriorityQueue<Lane>();
        this.OriginalLanes = new ArrayList<Lane>(InitialNumOfLanes);
    }

    private void initializeLanes(int numOfLanes) {
        for (int i = 0; i < numOfLanes; i++) {
            Lane Lane = new Lane(new Wall(Wall_Base_Health));
            Lanes.add(Lane);
            OriginalLanes.add(Lane);
        }
    }

    public void setNumberOfTurns(int numberOfTurns) {
        NumberOfTurns = numberOfTurns;
    }

    public void setResourceGathered(int resourceGathered) {
        ResourceGathered = resourceGathered;
    }

    public void setBattlePhase(BattlePhase battlePhase) {
        BattlePhase = battlePhase;
    }

    public void setNumberOfTitansPerTurn(int numberOfTitansPerTurn) {
        NumberOfTitansPerTurn = numberOfTitansPerTurn;
    }

    public void setScore(int score) {
        Score = score;
    }

    public void setTitanSpawnDistance(int titanSpawnDistance) {
        TitanSpawnDistance = titanSpawnDistance;
    }

    public int[][] getPhase_Approaching_Titans() {
        return Phase_Approaching_Titans;
    }
    
    public int getWall_Base_Health() {
        return Wall_Base_Health;
    }

    public int getNumberOfTurns() {
        return NumberOfTurns;
    }

    public int getResourceGathered() {
        return ResourceGathered;
    }

    public BattlePhase getBattlePhase() {
        return BattlePhase;
    }

    public int getNumberOfTitansPerTurn() {
        return NumberOfTitansPerTurn;
    }

    public int getScore() {
        return Score;
    }

    public int getTitanSpawnDistance() {
        return TitanSpawnDistance;
    }

    public WeaponFactory getWeaponFactory() {
        return WeaponFactory;
    }

    public HashMap<Integer, TitanRegistry> getTitanArchives() {
        return TitanArchives;
    }

    public ArrayList<Titan> getApproaching_Titans() {
        return Approaching_Titans;
    }

    public PriorityQueue<Lane> getLanes() {
        return Lanes;
    }

    public ArrayList<Lane> getOriginalLanes() {
        return OriginalLanes;
    }
}
