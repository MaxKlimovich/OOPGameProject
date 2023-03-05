package Unit;

import java.util.ArrayList;

public class Monk extends Magic {
        public Monk(String name, int x, int y) {
            super(name, 5, 30, 7, -4, -4, x, y, 12, true);
        }
        @Override
        public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
            super.step(team1, team2);
        }
        @Override
        public String toString() {
            return String.format("Unit.Monk: %s | Hp: %d | Speed: %d | ATK: %d-%d | DEF: %d | (X,Y): (%d,%d) | Status: %s\n",
                    this.name, this.hp, this.speed, this.damageMin, this.damageMax,
                    this.defense, this.pos.x, this.pos.y, this.state);
        }

        public String getInfo() {
            return "Unit.Monk";
        }
}

