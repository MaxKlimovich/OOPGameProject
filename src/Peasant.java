public class Peasant extends BaseHero {

    private int expressDelivery;
    private int energy;
    private int maxEnergy;
    private String weapon;



    public Peasant() {
        super(String.format("Peasant №%d", ++Peasant.number),
                BaseHero.r.nextInt(1, 3), 3, 1, 1, 1, 1,
                3, 1, 1);
        this.expressDelivery = 1;
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
        return String.format("%s, Express Delivery: %d, MaxEnergy: %d; Energy: %d, Weapon: %s, Message: %s",
                super.getInfo(), this.expressDelivery, this.maxEnergy, this.energy, this.weapon, this.getMessage());
    }

    @Override
    public void die() {
        System.out.println("aaaaaaa");
    }

    @Override
    public String getMessage() {
        return "There is a host!";
    }
}
