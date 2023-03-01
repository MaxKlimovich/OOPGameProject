import java.util.ArrayList;

public class Warlock extends BaseHero {


        public Warlock(String name, int x, int y) {
            super(name, 9, 30, 12, -5, -5, x, y, 17);
        }
        @Override
        public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
            super.step(team1, team2);
        }
        @Override
        public String toString() {
            return String.format("BowMan: %s | Hp: %d |  Speed: %d | ATK: %d-%d  |  DEF: %d  " +
                            "|  (X,Y): (%d,%d)  | Status: %s\n",
                    this.name, this.hp, this.speed, this.damageMin, this.damageMax,
                    this.defense, this.pos.x, this.pos.y, this.state);
        }

        public String getInfo() {
            return "Warlock";
        }
}
