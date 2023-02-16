public class Pickener extends BaseHero {

    private int agro;
    private int maxAgro;
    private String weapon;


    public Pickener() {
        super(String.format("Pickener №%d", ++Pickener.number),
                BaseHero.r.nextInt(500, 800), 800,
                BaseHero.r.nextInt(100, 200));
        this.maxAgro = 100; /** Agro */
        this.agro = Pickener.r.nextInt(0, 100);
        this.weapon = String.format("Pike "); /** Weapon type */
        this.getMessage();
    }

    public int Attack() {
        int damage = Pickener.r.nextInt(20, 30);
        this.agro -= (int) (damage * 0.8);
        if (agro < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s, MaxAgro: %d, Agro: %d, Weapon: %s, Message: %s", super.getInfo(),
                this.maxAgro, this.agro, this.weapon, this.getMessage());
    }

    @Override
    public void die() {
        System.out.println("Good Night");
    }

    @Override
    public String getMessage() {return "aaaaayyyuiuuuufffufffggggg";}
}
