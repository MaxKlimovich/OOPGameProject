public class Pikeman extends BaseHero {

    private int agro;
    private int maxAgro;
    private String weapon;


    public Pikeman() {
        super(String.format("Hero_Pikeman №%d", ++Pikeman.number), /** Name and id */
                BaseHero.r.nextInt(500, 800), /** HP */
                BaseHero.r.nextInt(100, 200)); /** Speed */
        this.maxAgro = Pikeman.r.nextInt(0, 100); /** Agro */
        this.agro = maxAgro;
        this.weapon = String.format("Pike "); /** Weapon type */
    }

    public int Attack() {
        int damage = Pikeman.r.nextInt(20, 30);
        this.agro -= (int) (damage * 0.8);
        if (agro < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s, Energy: %d, Weapon: %s", super.getInfo(),
                this.agro, this.weapon, this.getClass().getSimpleName());
    }
}
