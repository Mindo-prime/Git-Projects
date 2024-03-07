package game.engine.lanes;

import java.util.ArrayList;
import java.util.PriorityQueue;

import game.engine.base.Wall;
import game.engine.titans.Titan;
import game.engine.weapons.Weapon;



public class Lane implements Comparable<Lane>{
    private final Wall laneWall;
    private int dangerLevel;
    private final PriorityQueue<Titan> titans;
    private final ArrayList<Weapon> weapons;
    public Lane(Wall laneWall) {
        this.laneWall = laneWall;
        dangerLevel = 0;
        titans = new PriorityQueue<Titan>();
        weapons = new ArrayList<Weapon>();
    }
    public int getDangerLevel() {
        return dangerLevel;
    }

    public Wall getLaneWall() {
        return laneWall;
    }

    public PriorityQueue<Titan> getTitans() {
        return titans;
    }
    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }
    
    public void setDangerLevel(int dangerLevel) {
        if (dangerLevel < 0) {
            dangerLevel = 0;
        }
        this.dangerLevel = dangerLevel;
    }
    
    public int compareTo(Lane AnotherLane) {
        return this.dangerLevel - AnotherLane.dangerLevel;
    }
}
