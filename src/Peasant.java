public class Peasant extends BaseHero {

    private int energy;
    private int maxEnergy;
    private String weapon;



    public Peasant() {
        super(String.format("Hero_Peasant №%d", ++Peasant.number), /** Name and id */
                Peasant.r.nextInt(200, 400), /** HP */
                BaseHero.r.nextInt(50, 150)); /** Speed */
        this.maxEnergy = Peasant.r.nextInt(50, 100); /** Energy */
        this.energy = maxEnergy;
        this.weapon = String.format("Pitchfork "); /** Weapon type */
    }

    public int Attack() {
        int damage = Peasant.r.nextInt(20, 30);
        this.energy -= (int) (damage * 0.8);
        if (energy < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s, Energy: %d, Weapon: %s", super.getInfo(),
                this.energy, this.weapon, this.getClass().getSimpleName());
    }
}
