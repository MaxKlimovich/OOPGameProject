package BaseHero;

import java.util.ArrayList;

public class Fermer extends BaseHero {
    protected boolean delivery;

    public Fermer(String name, int x, int y) {
        super(name,1, 1, 1, 1, 1, 3, 1, x, y);
        this.delivery = true;
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        if (!state.equals("Die")) state = "Stand";
        System.out.println("Unit.Fermer " + name + " Free " );
    }
//    @Override
//    public String toString() {
//        return String.format("Unit.Fermer: %s | Hp: %d | Speed: %d | ATK: %d-%d | DEF: %d | (X,Y): (%d,%d) | Status: %s\n",
//                this.name, this.hp, this.speed, this.damageMin, this.damageMax,
//                this.defense, this.pos.x, this.pos.y, this.state);
//    }

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin + damageMax)/2)) + " " +
                state;
    }

    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Fermer:\t").append(Fermer.super.name)
                .append("\t| ATK:\t").append(Fermer.super.attack)
                .append("\t|HP:\t").append(Fermer.super.hp)
                .append("\t|")
                .append("\t| (X.Y) : ").append(Fermer.super.pos.x).append(".").append(Fermer.super.pos.y);
    }
}
