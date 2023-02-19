import java.util.Random;

public abstract class BaseHero implements GameInterface{
    static int number;
    static Random r;
    protected String name;
    private  int hp;
    protected int maxHp;
    protected int attack;
    protected int damageMin;
    protected int damageMax;
    protected int defense;
    protected int speed;
    protected int coordinataX;

    protected int coordinataY;


    static  {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }
    public BaseHero(String name, int hp, int maxHp, int attack, int damageMin, int damageMax,
                    int defense,  int speed, int coordinataX, int coordinataY) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.defense = defense;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.speed = speed;
        this.coordinataX = coordinataX;
        this.coordinataY = coordinataY;

    }
    public BaseHero() {
        this(String.format("Hero_BaseHero #%d", ++BaseHero.number), /** Name */
                BaseHero.r.nextInt(1, 30), 30, /** HP and MaxHP */
                BaseHero.r.nextInt(1, 17), /** Attack */
                 10,10, /** Damage Min & Max */
                BaseHero.r.nextInt(1,12), /** Defense */
                BaseHero.r.nextInt(3, 9), /** Speed */
                12, 14); /** Coordinate X & Y */

    }
    public String getInfo() {
        return String.format ("Name: %s, Hp: %d, MaxHp: %d, Attack: %d, DamageMin: %d, DamageMax: %d," +
                        " Defense: %d, Speed: %d, X: %d, Y: %d, Type: %s",
                this.name, this.hp, this.maxHp, this.attack, this.damageMin, this.damageMax, this.defense,
                this.speed, this.coordinataX, this.coordinataY, this.getClass().getSimpleName());
    }


    public String toString() {
        return String.format ("\nName: %s, Hp: %d, MaxHp: %d, Attack: %d, Defense: %d, Speed: %d",
                this.name, this.hp, this.maxHp, this.attack, this.defense, this.speed);
    }

    public void setHp(int hp) {if (hp >= 0) this.hp = hp;}
    public void healer(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }
    public int getHp() {
        return hp;
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        else { die(); }
    }

    public abstract void die();

    @Override
    public void step() {
    }
    @Override
    public String getMessage() {return "I am I";}


    public int getSpeed() {
        return speed;
    }
}


