import java.util.Random;

public abstract class BaseHero implements GameInterface{
    static int number;
    static Random r;

    public void setHp(int hp) {if (hp >= 0) this.hp = hp;}
    public int getHp() {return hp;}

    protected String name;
    private  int hp;
    protected int maxHp;
    protected int speed;
    protected int maxSpeed;


    static  {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }
    public BaseHero(String name, int hp, int maxHp, int speed) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.speed = speed;
        this.maxSpeed = speed;


    }
    public BaseHero() {
        this(String.format("Hero_BaseHero #%d", ++BaseHero.number),
                BaseHero.r.nextInt(100, 200), 200,
                BaseHero.r.nextInt(50, 150));
    }
    public String getInfo() {
        return String.format ("Name: %s, Hp: %d, MaxHp: %d, Speed: %s, Type: %s",
                this.name, this.hp, this.maxHp, this.speed, this.getClass().getSimpleName());
    }
    public void healer(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
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
}


