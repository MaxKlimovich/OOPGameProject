package BaseHero;

import java.util.ArrayList;

public abstract class DistantBattle extends BaseHero {
    int cartridges;

    public DistantBattle(String name, int hp, int maxHp, int defense, int damageMin, int damageMax,
                         int speed, int attack, int x, int y, int cartridges) {
        super(name, hp, maxHp, defense, damageMin, damageMax, speed, attack, x, y);
        this.cartridges = cartridges;
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        if (state.equals("Die")) {hp = 0; return;}
        if (state.equals("DIe") || cartridges == 0) return;
        int target = findNearest(team2);
        System.out.println(name + " " + getInfo() + "  ->  " + team2.get(target).name +" "+ team2.get(target).getInfo());
        float damage = (team2.get(target).defense - attack > 0) ?
                damageMin : (team2.get(target).defense - attack < 0) ?
                damageMax : (damageMax + damageMin) / 2;
        team2.get(target).getDamage(damage);

        for (int i = 0; i < team1.size(); i++) {
            if (team1.get(i) instanceof Fermer && team1.get(i).state.equals("Stand ")) {
                System.out.println("Fermer " + team1.get(i).name + "Busy ");
                team1.get(i).state = "Busy ";
                return;
            }
        }
        cartridges--;
    }

    @Override
    public String toString() {
        return "\uD83C\uDFF9" +
                " H:" + Math.round(hp) +
                " D:" + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin + damageMax)/2)) + " " +
                " Shoot:" + cartridges + " " +
                state;
    }
//    public StringBuilder getEmoji() {
//        StringBuilder builder = new StringBuilder();
//        return builder.append("\uD83C\uDFF9");
//    }

}

