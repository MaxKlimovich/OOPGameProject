package BaseHero;

import java.util.ArrayList;

public class Rogue extends Melee {


    public Rogue(String name, int x, int y) {

        super(name, 10, 10, 3, 2, 4, 6,8, x, y);
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        super.step(team1, team2);
    }
//    @Override
//    public String toString() {
//        return String.format("Unit.BowMan: %s | Hp: %d |  Speed: %d | ATK: %d-%d  |  DEF: %d  " +
//                        "|  (X,Y): (%d,%d)  | Status: %s\n",
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
        return builder.append("Rogue:\t").append(Rogue.super.name)
                .append("\t| ATK:\t").append(Rogue.super.attack)
                .append("\t|HP:\t").append(Rogue.super.hp)
                .append("\t|")
                .append("\t| (X.Y) : ").append(Rogue.super.pos.x).append(".").append(Rogue.super.pos.y);
    }
}
