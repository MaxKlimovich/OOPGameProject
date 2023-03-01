import java.util.ArrayList;

public abstract class Magic extends BaseHero {

    protected boolean magic;

    public Magic(String name, int speed, int maxHp, int defense, int damageMin, int damageMax,
                 int x, int y, int attack, boolean magic) {
        super(name, speed, maxHp, defense, damageMin, damageMax, x, y, attack);
        this.magic = magic;
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        if (state.equals("Die")) return;
        for (int i = 0; i < team1.size(); i++) {
            if (team1.get(i).hp < team1.get(i).maxHp) {
                team1.get(i).getDamage(damageMax);
                System.out.println(name + " " + getInfo() + " -> " + team1.get(i).name + " " + team1.get(i).getInfo());
                break;
            }
        }
    }
}
