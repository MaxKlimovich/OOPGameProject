public class Sniper extends DistantBattle {

    private int energy;
    private int maxEnergy;
    private String weapon;


    public Sniper() {
        super(String.format("Sniper №%d", ++Sniper.number),
                BaseHero.r.nextInt(100, 200), 200,
                BaseHero.r.nextInt(150, 300),
                BaseHero.r.nextInt(0, 20), 20, 300);
        this.maxEnergy = 100; /** Energy */
        this.energy = Sniper.r.nextInt(0, 100);
        this.weapon = String.format("Gun "); /** Weapon type */
        this.getMessage();
    }

    public int Attack() {
        int damage = Sniper.r.nextInt(20, 30);
        this.energy -= (int) (damage * 0.8);
        if (energy < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s, MaxEnergy: %d, Energy: %d, Weapon: %s, Message: %s", super.getInfo(), this.maxEnergy,
                this.energy,  this.weapon, getMessage());
    }

    @Override
    public void die() {
        System.out.println("Keeeeek");
    }
}
