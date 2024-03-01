package game.engine.lanes;

import java.util.ArrayList;
import java.util.PriorityQueue;

import game.engine.Weapons.Weapon;
import game.engine.base.Wall;
import game.engine.titans.Titan;

public class Lane implements Comparable<Lane>{
    private final Wall LaneWall;
    private int DangerLevel;
    private final PriorityQueue<Titan> Titans;
    private final ArrayList<Weapon> Weapons;
    public Lane(Wall LaneWall) {
        this.LaneWall = LaneWall;
        DangerLevel = 0;
        Titans = new PriorityQueue<Titan>();
        Weapons = new ArrayList<Weapon>();
    }
    public int getDangerLevel() {
        return DangerLevel;
    }

    public Wall getLaneWall() {
        return LaneWall;
    }

    public PriorityQueue<Titan> getTitans() {
        return Titans;
    }
    public ArrayList<Weapon> getWeapons() {
        return Weapons;
    }
    
    public void setDangerLevel(int DangerLevel) {
        this.DangerLevel = DangerLevel;
    }
    
    public int compareTo(Lane AnotherLane) {
        return this.DangerLevel - AnotherLane.DangerLevel;
    }

}
