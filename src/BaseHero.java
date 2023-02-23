import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements GameInterface {
    static int number;
    static Random r;

    protected String name;
    protected int hp;
    protected int maxHp;
    protected int attack;
    protected int damageMin;
    protected int damageMax;
    protected int defense;
    protected int speed;
    public Vector2D pos;


    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }

    public BaseHero(String name, int hp, int maxHp, int attack, int damageMin, int damageMax,
                    int defense, int speed, int x, int y) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.defense = defense;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.speed = speed;
        pos = new Vector2D(x, y);


    }

    public BaseHero() {
        this(String.format("Hero_BaseHero #%d", ++BaseHero.number), /** Name */
                BaseHero.r.nextInt(1, 30), 30, /** HP and MaxHP */
                BaseHero.r.nextInt(1, 17), /** Attack */
                10, 10, /** Damage Min & Max */
                BaseHero.r.nextInt(1, 12), /** Defense */
                BaseHero.r.nextInt(3, 9), /** Speed */
                1, 1); /** coordinat x, y */


    }

    public String getInfo() {
        return String.format("Name: %s, Hp: %d, MaxHp: %d, Attack: %d, DamageMin: %d, DamageMax: %d," +
                        " Defense: %d, Speed: %d, VectorX: %d, VectorY: %d, Type: %s",
                this.name, this.hp, this.maxHp, this.attack, this.damageMin, this.damageMax, this.defense,
                this.speed, pos.x, pos.y, this.getClass().getSimpleName());
    }


    public String toString() {
        return String.format("Name: %5s | Hp: %2d | MaxHp: %d | Attack: %d | Defense: %d | Speed: %d | " +
                        "X,Y: (%d,%d)\n",
                this.name, this.hp, this.maxHp, this.attack, this.defense, this.speed, pos.x, pos.y);
    }

    public void setHp(int hp) {if (hp >= 0) this.hp = hp;}
    public void healer(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }


    public void GetDamage(int takenDamage) {
        if (this.hp - takenDamage > 0) {
            this.hp -= takenDamage;
        }
        else { die(); }
    }
    public abstract void die();

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        GameInterface.super.step(team1, team2);
    }

//    public int findNearest(ArrayList<BaseHero> team) {
//        double min = 100;
//        int index = 0;
//        for (int i = 0; i < team.size(); i++) {
//            if (min > pos.getDistance(team.get(i).pos)) {
//                index = i;
//                min = pos.getDistance(team.get(i).pos);
//            }
//        }
//        return index;
//    }



    @Override
    public String getMessage() {
        return "I am I";
    }


    public int getSpeed() {
        return speed;
    }
}


