public class Sniper extends BaseHero {

    private int energy;
    private int maxEnergy;
    private String weapon;


    public Sniper() {
        super(String.format("Hero_Sniper №%d", ++Sniper.number), /** Name and id */
                BaseHero.r.nextInt(100, 200), /** HP */
                BaseHero.r.nextInt(150, 300)); /** Speed */
        this.maxEnergy = Sniper.r.nextInt(0, 100); /** Energy */
        this.energy = maxEnergy;
        this.weapon = String.format("Gun "); /** Weapon type */
    }

    public int Attack() {
        int damage = Sniper.r.nextInt(20, 30);
        this.energy -= (int) (damage * 0.8);
        if (energy < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s, Energy: %d, Weapon: %s", super.getInfo(),
                this.energy, this.weapon, this.getClass().getSimpleName());
    }
}
