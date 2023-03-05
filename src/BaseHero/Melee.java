package BaseHero;

import java.util.ArrayList;

public class Melee extends BaseHero {
    public Melee(String name, int hp, int maxHp, int defense, int damageMin,
                 int damageMax, int speed, int attack, int x, int y) {
        super(name, hp, maxHp, defense, damageMin, damageMax, speed, attack, x, y);
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {

        if (state.equals("Die")) {
            hp = 0;
            return;
        }
        int target = findNearest(team2);
        if (target < 2) {
            float damdge = (team2.get(target).defense - attack > 0) ?
                    damageMin : (team2.get(target).defense - attack < 0) ?
                    damageMax : ((damageMax + damageMin) / 2);
            team2.get(target).getDamage(damdge);
            return;
        }
        moveToOpponent(target, team2);

    }

    void moveToOpponent(int target, ArrayList<BaseHero> team2) {
        if (pos.onTheTop(team2.get(target).pos) & (pos.y != team2.get(target).pos.y)) {
            pos.y++;
            return;
        } else if (!pos.onTheTop(team2.get(target).pos) & (pos.y != team2.get(target).pos.y)) {
            pos.y--;
            return;
        }
        if (pos.onTheLeft(team2.get(target).pos)) {
            pos.x++;
            return;
        } else if (!pos.onTheLeft(team2.get(target).pos)) {
            pos.x--;
            return;
        }
    }

    @Override
    public String toString() {
        return "\uD83D\uDC82" +
                " H:" + Math.round(hp) +
                " D:" + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin + damageMax) / 2)) + " " +
                state;
    }
}

