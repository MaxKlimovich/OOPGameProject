package Unit;

import java.util.ArrayList;

public class BowMan extends DistantBattle {
    public BowMan(String name, int x, int y) {
        super(name, 4, 10, 3, 2, 3, x, y, 6,16);
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        super.step(team1, team2);
    }
    @Override
    public String toString() {
        return String.format("Unit.BowMan: %s | Hp: %d | Speed: %d | ATK: %d-%d | DEF: %d | (X,Y): (%d,%d) | Status: %s " +
                        "| Cartriges: %d\n",
                this.name, this.hp, this.speed, this.damageMin, this.damageMax, this.defense,
                this.pos.x, this.pos.y, this.state,  this.cartridges);
    }
    public String getInfo() {
        return "Unit.BowMan";
    }

}
