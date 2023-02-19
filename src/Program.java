import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        int teamCount = 5;
        Random rnd = new Random();

        System.out.println("Team #1");
        ArrayList<BaseHero> team = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int val1 = rnd.nextInt(4);
            switch (val1) {
                case 0:
                    team.add(new Monk());
                    break;
                case 1:
                    team.add(new Peasant());
                    break;
                case 2:
                    team.add(new Pickener());
                    break;
                case 3:
                    team.add(new CrossBowMan());
                    break;
//                case 4:
//                    team.add(new Sniper());
//                    break;
//                case 5:
//                    team.add(new Rogue());
//                    break;
//                case 6:
//                    team.add(new Warlock());
//                    break;
            }
            System.out.println(team.get(i).getInfo());
        }
        System.out.println("\n------------------------------------------------------------\n");

        System.out.println("Team #2 ");

        ArrayList<BaseHero> team2 = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int val2 = rnd.nextInt(4);
            switch (val2) {
                case 0:
                    team2.add(new Sniper());
                    break;
                case 1:
                    team2.add(new Warlock());
                    break;
                case 2:
                    team2.add(new Rogue());
                    break;
                case 3:
                    team2.add(new Peasant());
                    break;
//                case 4:
//                    team2.add(new CrossBowMan());
//                    break;
//                case 5:
//                    team2.add(new Monk());
//                    break;
//                case 6:
//                    team2.add(new Pickener());
//                    break;
            }
            System.out.println(team2.get(i).getInfo());
        }

        System.out.println("\n------------------------------------------------------------\n");

        ArrayList<BaseHero> allArray = new ArrayList<>(team);
        for (int i = 0; i < team.size(); i++) {
            allArray.add(team2.get(i));
        }

        @Override
        public String getString() {
            return String.format(allArray);
        }

        System.out.println(allArray.toString());


//        ArrayList allArray = new ArrayList<>(team);
//        allArray.add(team2);
//
//        System.out.println(allArray);

    }


}


//    public static void main(String[] args) {
////        List<Integer> nums = new ArrayList<>();
////        nums.add(1);
////        nums.add(123);
////        nums.add(1234);
////        nums.add(12345);
////        nums.add(123456);
//
//
//        Random r = new Random();
////        List<Integer> numbers= new ArrayList<>();
////        for (int i = 0; i < 10; i++) {
////            numbers.add(r.nextInt(1, 10));
////        }
////        System.out.println(numbers);
////        Collections.sort(numbers);
////        System.out.println(numbers);
//
//
//
//        List<Teams> db = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            db.add(new Teams("name" +i, "second name" +i,
//                    r.nextInt(18, 35), r.nextInt(10000)));
//        }
//        System.out.println(db);
//        db.sort(new SalaryComporator());
////        Collections.sort(db);
//        System.out.println(db);
//
//
//
////        Teams teams = new Teams(
////                "firstName", "secondName", 24, 1222 );
////
////        Iterator<String> components = teams;
////        while (components.hasNext()){
////            System.out.println(teams.next());
////        }
//
//
//    }
//}
