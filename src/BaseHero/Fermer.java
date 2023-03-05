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
        if (state.equals("Die")) {hp = 0; return;}
        if (!state.equals("Die")) state = "Stand";
        System.out.println("Fermer " + name + " Free " );
    }

    @Override
    public String toString() {
        return "\uD83D\uDC69\u200D\uD83C\uDF3E Fermer: " +
                " H:" + Math.round(hp) +
                " D:" + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin + damageMax)/2)) + " " +
                state;
    }

    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("\uD83D\uDC69\u200D\uD83C\uDF3E")
                .append(Fermer.super.name).append("\t")
                .append("| ATK:").append(Fermer.super.attack).append(" ")
                .append("| HP:").append(Fermer.super.hp).append(" ")
                .append("| (X.Y): ").append(Fermer.super.pos.x).append(".").append(Fermer.super.pos.y)
                .append(" ")
                .append("| ").append("Status:");
    }
    public StringBuilder getEmoji() {
        StringBuilder builder = new StringBuilder();
        return builder.append("\uD83D\uDC69\u200D\uD83C\uDF3E");
    }
}
