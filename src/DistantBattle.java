public abstract class DistantBattle extends BaseHero {
    int shot;
    int maxShot;
    int distance;

    public DistantBattle(String name, int hp, int maxHp, int speed, int shot, int maxShot, int distance) {
        super(name, hp, maxHp, speed);
        this.shot = shot;
        this.maxShot = shot;
        this.distance = distance;
    }

    public float getDistant() {return distance;}

    @Override
    public String getMessage() {return "I'm the longest shooting smug fucker";}
}
