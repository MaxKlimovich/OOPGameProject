public class Peasant extends BaseHero {

    private int energy;
    private int maxEnergy;
    private String weapon;



    public Peasant() {
        super(String.format("Peasant №%d", ++Peasant.number),
                Peasant.r.nextInt(200, 400), 400,
                BaseHero.r.nextInt(50, 150));
        this.maxEnergy = 100;
        this.energy = Peasant.r.nextInt(50, 100);
        this.weapon = String.format("Pitchfork "); /** Weapon type */
        this.getMessage();
    }

    public int Attack() {
        int damage = Peasant.r.nextInt(20, 30);
        this.energy -= (int) (damage * 0.8);
        if (energy < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s, MaxEnergy: %d; Energy: %d, Weapon: %s, Message: %s", super.getInfo(),
                this.maxEnergy, this.energy, this.weapon, this.getMessage());
    }

    @Override
    public void die() {
        System.out.println("FUCK");
    }

    @Override
    public String getMessage() {
        return "I'll take your shorty and clean it, and then I'll go to the top of all your beds.";
    }
}
