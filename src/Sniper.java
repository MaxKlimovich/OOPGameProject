public class Sniper extends DistantBattle {

    private int energy;
    private int maxEnergy;
    private String weapon;


    public Sniper(String name, int x, int y) {
        super(String.format("Sniper №%d", ++Sniper.number),
                BaseHero.r.nextInt(1, 15), 15,
                12, 8, 10, 10,
                9, x, y, 32, 32, 400);
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
        return String.format("%s, Energy: %d, Weapon: %s, Shot: %d, MaxShot: %d, Distance: %d, Message: %s.",
                super.getInfo(), this.energy, this.weapon, super.cartridges, super.maxShot,
                super.distance, this.getMessage());
    }

    @Override
    public void die() {
        System.out.println("Keeeeek");
    }
}
