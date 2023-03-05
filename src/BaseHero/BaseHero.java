package Unit;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements GameInterface {
    protected String name;
    protected int hp;
    protected int speed, attack;
    protected int maxHp, defense, damageMin, damageMax;
    protected String state;
    protected Vector2D pos;
    protected static int heroCnt;


    public BaseHero(String name, int speed, int maxHp, int defense, int damageMin, int damageMax,
                    int x, int y, int attack) {
        this.name = name;
        this.speed = speed;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.defense = defense;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        pos = new Vector2D(x, y);
        this.attack = attack;
        state = "Stand";
        heroCnt++;
    }
    public static String getName() { // random name
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }

    public String toString() {
        return String.format("Name: %5s | Hp: %2d | Speed: %d | Defense: %d | X,Y: (%d,%d) | State: %s\n",
                this.name, this.hp, this.speed, this.defense, this.pos.x, this.pos.y, this.state);
    }

    public String getInfo() {
        return "Name: " + getName() + "HP: " + this.hp;
    }
    public int getSpeed() {return speed; }
    public float getHp() {return hp; }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) { }

    protected int findNearest(ArrayList<BaseHero> team) {
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



//    public void healer(int Hp) {
//        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
//    }


}


