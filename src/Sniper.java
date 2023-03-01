import java.util.ArrayList;

public class Sniper extends DistantBattle {
    public Sniper(String name, int x, int y) {
        super(name, 9, 15, 10, 8, 10, x, y, 12,10);
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        super.step(team1, team2);
    }
    @Override
    public String toString() {
        return String.format("Sniper: %s | Hp: %d | Speed: %d | ATK: %d-%d | DEF: %d | (X,Y): (%d,%d) | Status: %s | " +
                        "Cartriges: %d\n",
                this.name, this.hp, this.speed, this.damageMin, this.damageMax, this.defense,
                this.pos.x, this.pos.y, this.state, this.cartridges);
    }
    public String getInfo() {
        return "Sniper";
    }
}

