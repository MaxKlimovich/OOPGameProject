import java.util.ArrayList;
import java.util.Random;

public abstract class DistantBattle extends BaseHero {
    protected int maxShot;
    int cartridges;
    int maxCartridges;
    int distance;

    public DistantBattle(String name, int hp, int maxHp, int attack, int damageMin,
                         int damageMax, int defense, int speed, int coordinateX, int coordinateY,
                         int cartridges, int maxCartridges, int distance) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, coordinateX, coordinateY);
        this.cartridges = cartridges;
        this.maxCartridges = maxCartridges;
        this.distance = distance;
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        Random rnd = new Random();
//        int index = super.findNearest(team2);
        if (team1.contains(this)) { //Проверка если он находится в 1 команде
            int min = 20;
            int tmp;
            int index = 0;
            for (int i = 0; i < team2.size(); i++) { //Ищем дистанцию со второй команде
                tmp = Vector2D.getDistance(this, (BaseHero) team2.get(i)); //Расстояние до врага
                if (min > tmp) {
                    min = tmp; //записываем значение минимальной дистанции.
                    index = i; //запоминаем индекс ближайшего врага.
                }
            }
            System.out.println(team2.get(index));
            team2.get(index).hp = team2.get(index).hp - rnd.nextInt(this.damageMin, this.damageMax); //Выстрел в персонажа
            System.out.println(team2.get(index));
         } else { // Он будет находиться во второй команде
            int min = 0;
            int tmp;
            int index = 0;
            for (int i = 0; i < team1.size(); i++) { //пробегаемся по первой команде для поиска дистанции
                tmp = Vector2D.getDistance(this, (BaseHero) team1.get(i));
                if (min > tmp) {
                    min = tmp; //записываем значение минимальной дистанции.
                    index = i; //запоминаем индекс ближайшего врага.
                }
            }
            System.out.println(team1.get(index));
            team1.get(index).hp = team1.get(index).hp - rnd.nextInt(this.damageMin, this.damageMax); //Выстрел в персонажа
            System.out.println(team1.get(index));
        }
    }

//    public float getDistant() {return distance;}

    @Override
    public String getMessage() {return "I'm the longest shooting smug fucker";}
}
