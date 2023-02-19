public class CrossBowMan extends DistantBattle {

    private int energy;
    private int maxEnergy;
    private String weapon;


    public CrossBowMan() {
        super(String.format("CrossBowMan №%d", ++CrossBowMan.number),
                BaseHero.r.nextInt(150, 250), 10,
                6, 2, 3, 3,
                4, 16, 200, 16, 16, 200);
        this.maxEnergy = CrossBowMan.r.nextInt(0, 100); /** Energy */
        this.energy = maxEnergy;
        this.weapon = String.format("CrossBow "); /** Weapon type */
        this.getMessage();

    }

    public int Attack() {
        int damage = CrossBowMan.r.nextInt(20, 30);
        this.energy -= (int) (damage * 0.8);
        if (energy < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s, Energy: %d, Weapon: %s, Shot: %d, MaxShot: %d, Distance: %d, Message: %s.",
                super.getInfo(), this.energy, this.weapon, super.maxShot, super.maxShot,
                super.distance, this.getMessage());
    }

    @Override
    public void die() {
        System.out.println("Bueeee");
    }

    @Override
    public String getMessage() {
        return "i am Humorist";
    }
}
