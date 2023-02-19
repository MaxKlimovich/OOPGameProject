import java.util.Comparator;
import java.util.Iterator;

public class Teams implements Comparable<Teams> {
    public String name;
    public int hp;
    public int speed;


    public Teams( String name, int hp, int speed) {
        this.name = name;
        this.hp = hp;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return String.format("\n%s, %d, %d", name, hp, speed);
    }

    @Override
    public int compareTo(Teams o) {
        return Integer.compare(this.speed, o.speed);
//        if (this.speed > o.speed)
//            return 1;
//        else if (this.speed < o.speed)
//            return 1;
//        else
//            return 0;
    }
}
//    int index;
//
//        @Override
//        public boolean hasNext() {
//            return index++ <4;
//        }
//
//    @Override
//    public String next() {
//        switch (index) {
//            case 1:
//                return String.format("firstName: %s", firstName);
//            case 2:
//                return String.format("SecondName: %s",secondName);
//            case 3:
//                return String.format("age: %s", 24);
//            default:
//                return String.format("Salery: %s", 4232);
//        }
//    }



