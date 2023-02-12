public class Warlock extends BaseHero {

    private int mana;
    private int maxMana;
    private String weapon;


    public Warlock() {
        super(String.format("Hero_Warlock №%d", ++Warlock.number), /** Name and id */
                BaseHero.r.nextInt(150, 250), /** HP */
                BaseHero.r.nextInt(150, 200)); /** Speed */
        this.maxMana = Warlock.r.nextInt(250, 300); /** Mana */
        this.mana = maxMana;
        this.weapon = String.format("Staff "); /** Weapon type */
    }

    public int Attack() {
        int damage = Warlock.r.nextInt(20, 30);
        this.mana -= (int) (damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s, Energy: %d, Weapon: %s", super.getInfo(),
                this.mana, this.weapon, this.getClass().getSimpleName());
    }
}
