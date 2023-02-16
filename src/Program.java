//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class Program {
//    public static void main(String[] args) {
//        int teamCount = 10;
//        Random rnd = new Random();
//
//        List<BaseHero> teams = new ArrayList<>();
//        for (int i = 0; i < teamCount; i++) {
//            int val = rnd.nextInt(2);
//            switch (val) {
//                case 0:
//                    teams.add(new Rogue());
//                    break;
//                case 1:
//                    teams.add(new CrossBowMan());
//                    break;
//                case 2:
//                    teams.add(new Monk());
//                    break;
//                case 3:
//                    teams.add(new Peasant());
//                    break;
//                case 4:
//                    teams.add(new Pikeman());
//                    break;
//                case 5:
//                    teams.add(new Sniper());
//                    break;
//                case 6:
//                    teams.add(new Warlock());
//                    break;
//            }
//            System.out.println(teams.get(i).getInfo());
//        }
//        System.out.println();
//    }
//}
