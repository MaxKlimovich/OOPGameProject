package BaseHero;

import java.util.ArrayList;

public class Pickener extends Melee {
    public Pickener(String name, int x, int y) {
        super(name, 10, 10, 5, 1,
                3, 4, 4, x, y);
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
        return "\uD83D\uDC68\u200D\uD83C\uDFA4 Warrior: " +
                " H:" + Math.round(hp) +
                " D:" + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin + damageMax) / 2)) + " " +
                state;
    }

    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("\uD83D\uDC68\u200D\uD83C\uDFA4")
                .append(Pickener.super.name).append("\t")
                .append("| ATK:").append(Pickener.super.attack).append(" ")
                .append("| HP:").append(Pickener.super.hp).append(" ")
                .append("| (X.Y): ").append(Pickener.super.pos.x).append(".").append(Pickener.super.pos.y)
                .append(" ")
                .append("| ").append("Status:");
    }

    public StringBuilder getEmoji() {
        StringBuilder builder = new StringBuilder();
        return builder.append("\uD83D\uDC68\u200D\uD83C\uDFA4");
    }
}

