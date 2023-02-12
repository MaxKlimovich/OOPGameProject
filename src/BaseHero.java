import java.util.Random;

public class BaseHero {
    static int number;
    static Random r;


    protected String name;
    protected int hp;
    protected int maxHp;
    protected int speed;
    protected int maxSpeed;


    static  {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }
    public BaseHero(String name, int hp, int speed) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.speed = speed;
        this.maxSpeed = speed;


    }
    public BaseHero() {
        this(String.format("Hero_BaseHero #%d", ++BaseHero.number),
                BaseHero.r.nextInt(100, 200),
                BaseHero.r.nextInt(50, 150));
    }
    public String getInfo() {
        return String.format ("Name: %s, Hp: %d, Speed: %s, Type: %s",
                this.name, this.hp, this.speed, this.getClass().getSimpleName());
    }
    public void healer(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }
    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
    }
}


