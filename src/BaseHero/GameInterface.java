package Unit;

import java.util.ArrayList;

public interface GameInterface {

    default void step(ArrayList<BaseHero> team, ArrayList<BaseHero>team2){}
    String getInfo();
}
