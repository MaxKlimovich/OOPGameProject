public class Monk extends BaseHero{

        private int elixir;
        private int maxElixir;
        private String weapon;


        public Monk() {
            super(String.format("Monk №%d", ++Monk.number),
                    BaseHero.r.nextInt(1, 30), 30, 12, -4,
                    -4, 7, 5, 13, 3);
            this.maxElixir = 450;
            this.elixir = Monk.r.nextInt(300, 450);
            this.weapon = String.format("Orb "); /** Weapon type */
            this.getMessage();
        }

        public int Attack() {
            int damage = Monk.r.nextInt(20, 30);
            this.elixir -= (int) (damage * 0.8);
            if (elixir < 0) return 0;
            else return damage;
        }

        public String getInfo() {
            return String.format("%s, maxElixir: %d, Elixir: %d, Weapon: %s, Message: %s", super.getInfo(),
                    this.maxElixir, this.elixir, this.weapon, this.getMessage());
        }

    @Override
    public void die() {
        System.out.println("Hello new epic day");
    }

    @Override
    public String getMessage() {
        return "I'll wait on the mountains when you're ready to learn.";
    }
}

