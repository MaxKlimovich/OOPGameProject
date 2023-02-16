public class Warlock extends BaseHero {

    private int mana;
    private int maxMana;
    private String weapon;


    public Warlock() {
        super(String.format("Warlock №%d", ++Warlock.number),
                BaseHero.r.nextInt(150, 250), 250,
                BaseHero.r.nextInt(150, 200));
        this.maxMana = 300;
        this.mana = Warlock.r.nextInt(250, 300);
        this.weapon = String.format("Staff "); /** Weapon type */
        this.getMessage();
    }

    public int Attack() {
        int damage = Warlock.r.nextInt(20, 30);
        this.mana -= (int) (damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s, MaxMana: %d, Mana: %d, Weapon: %s, Message: %s", super.getInfo(),
                this.maxMana, this.mana, this.weapon, this.getMessage());
    }

    @Override
    public void die() {
        System.out.println("Diiiiieeeee");
    }

    @Override
    public String getMessage() {
        return "I will call you such a she-devil that you will have to give me your soul for her. " +
                "Mortal worm wahahahahahahahah";
    }
}
