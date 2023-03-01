//import java.util.*;
//
//public class Program {
//    static final int teamCount = 10;
//
//    public static void main(String[] args) {
//        Random rnd = new Random();
//        Scanner user_input = new Scanner(System.in);
//
////        System.out.println("Team #1");
//        int x1 = 1;
//        int y1 = 1;
//        ArrayList<BaseHero> team1 = new ArrayList<>();
//        for (int i = 0; i < teamCount; i++) {
//            y1++;
//            int val1 = rnd.nextInt(4);
//            switch (val1) {
//                case 0:
//                    team1.add(new Monk("Monk", x1, y1));
//                    break;
//                case 1:
//                    team1.add(new Fermer("Peasant", x1, y1));
//                    break;
//                case 2:
//                    team1.add(new Pickener("Pickener", x1, y1));
//                    break;
//                case 3:
//                    team1.add(new BowMan("BowMan", x1, y1));
//                    break;
////                case 4:
////                    team1.add(new Sniper());
////                    break;
////                case 5:
////                    team1.add(new Rogue());
////                    break;
////                case 6:
////                    team1.add(new Warlock());
////                    break;
//            }
////            System.out.println(team1.get(i).getInfo());
//        }
////        System.out.println("\n------------------------------------------------------------\n");
//
//
////        System.out.println("Team #2 ");
//        int x2 = 10;
//        int y2 = 1;
//        ArrayList<BaseHero> team2 = new ArrayList<>();
//        for (int i = 0; i < teamCount; i++) {
//            y2++;
//            int val2 = rnd.nextInt(4);
//            switch (val2) {
//                case 0:
//                    team2.add(new Sniper("Sniper", x2, y2));
//                    break;
//                case 1:
//                    team2.add(new Warlock("Warlock", x2, y2));
//                    break;
//                case 2:
//                    team2.add(new Rogue("Rogue", x2, y2));
//                    break;
//                case 3:
//                    team2.add(new Fermer("Peasant", x2, y2));
//                    break;
////                case 4:
////                    team2.add(new CrossBowMan());
////                    break;
////                case 5:
////                    team2.add(new Monk());
////                    break;
////                case 6:
////                    team2.add(new Pickener());
////                    break;
//            }
////            System.out.println(team2.get(i).getInfo());
//        }
//
//        System.out.println("\n------------------------------------------------------------\n");
//
//        System.out.println("Sorted team1 & team2: ");
//        ArrayList<BaseHero> allTeam = new ArrayList<>(team1);
//        for (int i = 0; i < team1.size(); i++) {
//            allTeam.add(team2.get(i));
//        }
//        allTeam.sort(new Comparator<BaseHero>() {
//            @Override
//            public int compare(BaseHero o1, BaseHero o2) {
//                if (o2.getSpeed() == o1.getSpeed()) {
//                    return o2.hp - o1.hp;
//                }
//                return o2.getSpeed() - o1.getSpeed();
//            }
//        });
//        System.out.println(allTeam.toString());
//
//        while (true) {
//            for (BaseHero baseHero : allTeam) {
//                if (team1.contains(baseHero)) baseHero.step(team1, team2);
//                else baseHero.step(team2, team1);
//            }
//            user_input.nextLine();
//            System.out.println(allTeam);
//        }
//
//    }
//
//
//}
