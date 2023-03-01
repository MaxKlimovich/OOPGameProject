import java.util.ArrayList;

public class CrossBowMan extends DistantBattle {

    private int energy;
    private int maxEnergy;
    private String weapon;


    public CrossBowMan(String name, int x, int y) {
        super(name, 4, 10, 3, 2, 3, x, y, 6,16);
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        super.step(team1, team2);
    }
    @Override
    public String toString() {
        return String.format("Sniper: %s | Hp: %d |  Speed: %d  |  Shoot: %d  " +
                        "| ATK: %d-%d  |  DEF: %d  |  (X,Y): (%d,%d)  | Status: %s\n",
                this.name, this.hp, this.speed, this.cartridges, this.damageMin,
                this.damageMax, this.defense, this.pos.x, this.pos.y, this.state);
    }
    public String getInfo() {
        return "BowMan";
    }

}
