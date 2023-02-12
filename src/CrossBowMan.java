public class CrossBowMan extends BaseHero {

    private int energy;
    private int maxEnergy;
    private String weapon;


    public CrossBowMan() {
        super(String.format("Hero_CrossBowMan №%d", ++CrossBowMan.number), /** Name and id */
                BaseHero.r.nextInt(150, 250), /** HP */
                BaseHero.r.nextInt(100, 150)); /** Speed */
        this.maxEnergy = CrossBowMan.r.nextInt(0, 100); /** Energy */
        this.energy = maxEnergy;
        this.weapon = String.format("CrossBow "); /** Weapon type */
    }

    public int Attack() {
        int damage = CrossBowMan.r.nextInt(20, 30);
        this.energy -= (int) (damage * 0.8);
        if (energy < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s, Energy: %d, Weapon: %s", super.getInfo(),
                this.energy, this.weapon, this.getClass().getSimpleName());
    }
}
