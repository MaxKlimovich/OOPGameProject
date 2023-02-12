public class Monk extends BaseHero{

        private int elixir;
        private int maxElixir;
        private String weapon;


        public Monk() {
            super(String.format("Hero_Monk №%d", ++Monk.number), /** Name and id */
                    BaseHero.r.nextInt(250, 500), /** HP */
                    BaseHero.r.nextInt(150, 200)); /** Speed */
            this.maxElixir = Monk.r.nextInt(300, 450); /** Mana */
            this.elixir = maxElixir;
            this.weapon = String.format("Orb "); /** Weapon type */
        }

        public int Attack() {
            int damage = Monk.r.nextInt(20, 30);
            this.elixir -= (int) (damage * 0.8);
            if (elixir < 0) return 0;
            else return damage;
        }

        public String getInfo() {
            return String.format("%s, Energy: %d, Weapon: %s", super.getInfo(),
                    this.elixir, this.weapon, this.getClass().getSimpleName());
        }
    }

