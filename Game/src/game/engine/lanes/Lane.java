package game.engine.lanes;

import java.util.ArrayList;
import java.util.PriorityQueue;

import game.engine.Weapons.Weapons;
import game.engine.base.Wall;
import game.engine.titans.Titan;

public class Lane {
    private final Wall LaneWall;
    private int DangerLevel;
    private final PriorityQueue<Titan> Titans;
    private final ArrayList<Weapons> Weapons;

    public Lane(Wall LaneWall) {
        this.LaneWall = LaneWall;
        DangerLevel = 0;
        Titans = new PriorityQueue<Titan>();
        Weapons = new ArrayList<Weapons>();
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

    public ArrayList<Weapons> getWeapons() {
        return Weapons;
    }
    
    public void setDangerLevel(int DangerLevel) {
        this.DangerLevel = DangerLevel;
    }
    
    public int compareTo(Lane AnotherLane) {
        return DangerLevel - AnotherLane.DangerLevel;
    }

}
