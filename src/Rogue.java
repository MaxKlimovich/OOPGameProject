public class Rogue extends BaseHero {

    private int energy;
    private int maxEnergy;
    private String weapon;


    public Rogue() {
        super(String.format("Hero_Rogue №%d", ++Rogue.number), /** Name */
                BaseHero.r.nextInt(300, 400), /** HP */
                BaseHero.r.nextInt(250, 350)); /** Speed */
        this.maxEnergy = Rogue.r.nextInt(0, 100); /** Energy */
        this.energy = maxEnergy;
        this.weapon = String.format("Dagger "); /** Weapon type */
    }

    public int Attack() {
        int damage = Rogue.r.nextInt(20, 30);
        this.energy -= (int) (damage * 0.8);
        if (energy < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s, Energy: %d, Weapon: %s", super.getInfo(),
                this.energy, this.weapon, this.getClass().getSimpleName());
    }
}
