public class Rogue extends BaseHero {

    private int energy;
    private int maxEnergy;
    private String weapon;


    public Rogue() {
        super(String.format("Rogue №%d", ++Rogue.number),
                BaseHero.r.nextInt(1, 10), 10, 8, 2,
                4, 3, 6, 1, 4);
        this.maxEnergy = 100; /** Energy */
        this.energy = Rogue.r.nextInt(0, 100);
        this.weapon = String.format("Dagger "); /** Weapon type */
        this.getMessage();
    }

    public int Attack() {
        int damage = Rogue.r.nextInt(20, 30);
        this.energy -= (int) (damage * 0.8);
        if (energy < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s, MaxEnergy: %d, Energy: %d, Weapon: %s, Message: %s", super.getInfo(),
                this.maxEnergy, this.energy, this.weapon, this.getMessage());
    }

    @Override
    public void die() {
        System.out.println("Byyyyyyeeeeeee");
    }

    @Override
    public String getMessage() {return "Now I'll cut you your wallet out of your pocket Wa-ha-ha-ha-ha";}
}
