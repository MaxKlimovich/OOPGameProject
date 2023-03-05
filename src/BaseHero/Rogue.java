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

    @Override
    public String toString() {
        return "\uD83E\uDD77 Rogue: " +
                " H:" + Math.round(hp) +
                " D:" + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin + damageMax)/2)) + " " +
                state;
    }

    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("\uD83E\uDD77")
                .append(Rogue.super.name).append("\t")
                .append("| ATK:").append(Rogue.super.attack).append(" ")
                .append("| HP:").append(Rogue.super.hp).append(" ")
                .append("| (X.Y): ").append(Rogue.super.pos.x).append(".").append(Rogue.super.pos.y)
                .append(" ")
                .append("| ").append("Status:");
    }
    public StringBuilder getEmoji() {
        StringBuilder builder = new StringBuilder();
        return builder.append("\uD83E\uDD77");
    }
}
