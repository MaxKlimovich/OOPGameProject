package BaseHero;

import java.util.ArrayList;

public class Warlock extends Magic {


    public Warlock(String name, int x, int y) {
        super(name, 30, 30, 12, -5, -5,
                9, 17, x, y, 9, 9);
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        super.step(team1, team2);
    }

    //    @Override
//        public String toString() {
//            return String.format("Unit.BowMan: %s | Hp: %d |  Speed: %d | ATK: %d-%d  |  DEF: %d  " +
//                            "|  (X,Y): (%d,%d)  | Status: %s\n",
//                    this.name, this.hp, this.speed, this.damageMin, this.damageMax,
//                    this.defense, this.pos.x, this.pos.y, this.state);
//        }
    @Override
    public String toString() {
        return name +
                " HP:" + Math.round(hp) +
                " MP:" + Math.round(mana) +
                " D:" + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin + damageMax) / 2)) + " " +
                state;
    }

    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Warlock:\t").append(Warlock.super.name)
                .append("\t| ATK:\t").append(Warlock.super.attack)
                .append("\t|HP:\t").append(Warlock.super.hp)
                .append("\t|MP:\t").append(Warlock.super.mana)
                .append("\t|")
                .append("\t| (X.Y) : ").append(Warlock.super.pos.x).append(".").append(Warlock.super.pos.y);
    }
}
