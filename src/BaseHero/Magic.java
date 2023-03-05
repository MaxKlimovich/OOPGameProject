package BaseHero;

import java.util.ArrayList;

public abstract class Magic extends BaseHero {

    protected int mana;
    protected int maxMana;

    public Magic(String name, int hp, int maxHp, int defense, int damageMin,
                 int damageMax, int speed, int attack, int x, int y, int mana, int maxMana) {
        super(name, hp, maxHp, defense, damageMin, damageMax, speed, attack, x, y);
        this.mana = mana;
        this.maxMana = maxMana;
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        if (state.equals("Die")) {hp = 0; return;}
        for (int i = 0; i < team1.size(); i++) {
            if (team1.get(i).hp < team1.get(i).maxHp) {
                team1.get(i).getDamage(damageMax);
                System.out.println(name + " " + getInfo() + " -> " + team1.get(i).name + " " + team1.get(i).getInfo());
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "\uD83E\uDDD9" +
                " H:" + Math.round(hp) +
                " D:" + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin+damageMax)/2)) + " " +
                state;
    }


}
