package BaseHero;

import java.util.ArrayList;

public class Monk extends Magic {
    public Monk(String name, int x, int y) {
        super(name, 30, 30, 7, -4, -4,
                5, 12, x, y, 12, 12);
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        super.step(team1, team2);
    }
//        @Override
//        public String toString() {
//            return String.format("Unit.Monk: %s | Hp: %d | Speed: %d | ATK: %d-%d | DEF: %d | (X,Y): (%d,%d) | Status: %s\n",
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
        return builder.append("Monah:\t").append(Monk.super.name)
                .append("\t| ATK:\t").append(Monk.super.attack)
                .append("\t|HP:\t").append(Monk.super.hp)
                .append("\t|MP:\t").append(Monk.super.mana)
                .append("\t|")
                .append("\t| (X.Y) : ").append(Monk.super.pos.x).append(".").append(Monk.super.pos.y);
    }
}

