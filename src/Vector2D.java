public class Vector2D {
    public int x;
    public int y;

    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public static int getDistance(BaseHero h1, BaseHero h2){
        return (int) Math.sqrt((h1.pos.x - h2.pos.x)^2 + (h1.pos.y - h2.pos.y)^2);
    }
}
