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
        return "\uD83E\uDDDD\u200D️ Monah: " +
                " HP:" + Math.round(hp) +
                " MP:" + Math.round(mana) +
                " D:" + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin + damageMax) / 2)) + " " +
                state;
    }


    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("\uD83E\uDDDD\u200D️")
                .append(Monk.super.name).append("\t")
                .append("| ATK:").append(Monk.super.attack).append(" ")
                .append("| HP:").append(Monk.super.hp).append(" ")
                .append("\t|MP:\t").append(Monk.super.mana).append(" ")
                .append("| (X.Y): ").append(Monk.super.pos.x).append(".").append(Monk.super.pos.y)
                .append(" ")
                .append("| ").append("Status:");
    }

    public StringBuilder getEmoji() {
        StringBuilder builder = new StringBuilder();
        return builder.append("\uD83E\uDDDD\u200D");
    }
}

