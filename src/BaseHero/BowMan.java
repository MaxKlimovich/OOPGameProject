package BaseHero;

import java.util.ArrayList;

public class BowMan extends DistantBattle {
    public BowMan(String name, int x, int y) {
        super(name, 10, 10, 3, 2, 3, 9, 6, x, y ,16);
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        super.step(team1, team2);
    }
//    @Override
//    public String toString() {
//        return String.format("Unit.BowMan: %s | Hp: %d | Speed: %d | ATK: %d-%d | DEF: %d | (X,Y): (%d,%d) | Status: %s " +
//                        "| Cartriges: %d\n",
//                this.name, this.hp, this.speed, this.damageMin, this.damageMax, this.defense,
//                this.pos.x, this.pos.y, this.state,  this.cartridges);
//    }

    @Override
    public String toString() {
        return "\uD83C\uDFF9 BowMan: " +
                " H:" + Math.round(hp) +
                " D:" + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin + damageMax) / 2)) +
                " Shoot:" + cartridges + " " +
                state;
    }

    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("\uD83C\uDFF9")
                .append(BowMan.super.name).append("\t")
                .append("| ATK:").append(BowMan.super.attack).append(" ")
                .append("| HP:").append(BowMan.super.hp).append(" ")
                .append("| Shoot:").append(BowMan.super.cartridges).append(" ")
                .append("| ").append(" ")
                .append("| (X.Y): ").append(BowMan.super.pos.x).append(".").append(BowMan.super.pos.y)
                .append(" ")
                .append("| ").append("Status:");
    }
    public StringBuilder getEmoji() {
        StringBuilder builder = new StringBuilder();
        return builder.append("\uD83C\uDFF9");
    }
}
