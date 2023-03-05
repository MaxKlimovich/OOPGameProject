package BaseHero;

import java.util.ArrayList;

public class Sniper extends DistantBattle {
    public Sniper(String name, int x, int y) {

        super(name, 15, 15,10, 8, 10, 9,
                12, y, y, 32);
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        super.step(team1, team2);
    }
//    @Override
//    public String toString() {
//        return String.format("Unit.Sniper: %s | Hp: %d | Speed: %d | ATK: %d-%d | DEF: %d | (X,Y): (%d,%d) | Status: %s | " +
//                        "Cartriges: %d\n",
//                this.name, this.hp, this.speed, this.damageMin, this.damageMax, this.defense,
//                this.pos.x, this.pos.y, this.state, this.cartridges);
//    }

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin + damageMax) / 2)) +
                " Shoot:" + cartridges + " " +
                state;
    }

    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Sniper:\t").append(Sniper.super.name)
                .append("\t| ATK:\t").append(Sniper.super.attack)
                .append("\t|HP:\t").append(Sniper.super.hp)
                .append(" \t| Shoot:").append(Sniper.super.cartridges)
                .append("\t|")
                .append("\t| (X.Y) : ").append(Sniper.super.pos.x).append(".").append(Sniper.super.pos.y);

    }
}

