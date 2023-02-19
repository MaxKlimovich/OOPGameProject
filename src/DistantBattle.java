public abstract class DistantBattle extends BaseHero {
    int shot;
    int maxShot;
    int distance;

    public DistantBattle(String name, int hp, int maxHp, int attack, int damageMin,
                         int damageMax, int defense, int speed, int coordinateX, int coordinateY,
                         int shot, int maxShot, int distance) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, coordinateX, coordinateY);
        this.shot = shot;
        this.maxShot = maxShot;
        this.distance = distance;
    }

    public float getDistant() {return distance;}

    @Override
    public String getMessage() {return "I'm the longest shooting smug fucker";}
}
