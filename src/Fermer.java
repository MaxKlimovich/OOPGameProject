import java.util.ArrayList;

public class Fermer extends BaseHero {
    protected boolean delivery;

    public Fermer(String name, int x, int y) {
        super(name, 3, 1, 1, 1, 1, x, y, 1);
        this.delivery = true;
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        if (!state.equals("Die")) state = "Stand";
        System.out.println("Fermer " + name + " Free " );
    }
    @Override
    public String toString() {
        return String.format("Fermer: %s | Hp: %d | Speed: %d | ATK: %d-%d | DEF: %d | (X,Y): (%d,%d) | Status: %s\n",
                this.name, this.hp, this.speed, this.damageMin, this.damageMax,
                this.defense, this.pos.x, this.pos.y, this.state);
    }

    public String getInfo() {
        return "Fermer";
    }
}
