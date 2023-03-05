package BaseHero;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements GameInterface {
    protected String name;
    protected int hp;
    protected int maxHp, defense, damageMin, damageMax;
    protected int speed, attack;
    protected String state;
    protected Vector2D pos;
    protected static int heroCnt;


    @Override
    public String toString() {
        return "\uD83E\uDD34" +
                " H:" + Math.round(hp) +
                " D:" + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin + damageMax)/2)) +
                state;
    }

    public int[] getCoords() {return new int[]{pos.x, pos.y};}

    public BaseHero(String name, int hp, int maxHp, int defense,
                    int damageMin, int damageMax, int speed, int attack,
                    int x, int y) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.defense = defense;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.speed = speed;
        this.attack = attack;
        this.state = "Stand";
        pos = new Vector2D(x, y);
        heroCnt++;
    }

    public static String getName() { // random name
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }
    public int getSpeed() {return speed; }
    public float getHp() {return hp; }
    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) { }
    public int findNearest(ArrayList<BaseHero> team) {
        double min = 100;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if (min > pos.getDistance(team.get(i).pos) & !team.get(i).state.equals("Die")) {
                index = i;
                min = pos.getDistance(team.get(i).pos);
            }
        }
        return index;
    }
    protected void getDamage(float damage) {
        hp -= damage;
        if (hp > maxHp) hp = maxHp;
        if (hp < 0) state = "Die";
        System.out.println(getInfo() + " " + name + " Death ");
        state = "Die";
    }
    public StringBuilder getInfo() {
        return new StringBuilder("");
    }

    public StringBuilder getEmoji() {
        return new StringBuilder("");
    }
    public String getState() {
        return state;
    }
}


