//import java.util.*;
//
//public class Program {
//    static final int teamCount = 10;
//
//    public static void main(String[] args) {
//
//        ArrayList<BaseHero> team1 = new ArrayList<>();
//        ArrayList<BaseHero> team2 = new ArrayList<>();
//        ArrayList<BaseHero> allTeam = new ArrayList<>();
//        Scanner user_input = new Scanner(System.in);
//        createTeam(team1, 0, 1);
//        createTeam(team2, 3, 10);
//        allTeam.addAll(team1);
//        allTeam.addAll(team2);
//        sortTeam(allTeam);
//
//        System.out.println(allTeam);
//        while (true) {
//            for (BaseHero baseHero : allTeam) {
//                if (team1.contains(baseHero)) baseHero.step(team1, team2);
//                else baseHero.step(team2, team1);
//            }
//            user_input.nextLine();
//            System.out.println(allTeam);
//        }
//    }
//    static void createTeam(ArrayList team, int offset, int posY) {
//        for (int i = 0; i <= teamCount; i++) {
//            int rnd = new Random().nextInt(4) + offset;
//            switch (rnd) {
//                case 0:
//                    team.add(new Monk (BaseHero.getName(), i + 1, posY));
//                    break;
//                case 1:
//                    team.add(new Fermer (BaseHero.getName(), i , posY));
//                    break;
//                case 2:
//                    team.add(new Pickener(BaseHero.getName(), i , posY));
//                    break;
//                case 3:
//                    team.add(new BowMan(BaseHero.getName(), i , posY));
//                    break;
//                case 4:
//                    team.add(new Sniper(BaseHero.getName(), i , posY));
//                    break;
//                case 5:
//                    team.add(new Rogue(BaseHero.getName(), i , posY));
//                    break;
//                case 6:
//                    team.add(new Warlock(BaseHero.getName(), i , posY));
//                    break;
//            }
//        }
//    }
//
//    static void sortTeam(ArrayList<BaseHero> team) {
//        team.sort(new Comparator<BaseHero>() {
//            @Override
//            public int compare(BaseHero o1, BaseHero o2) {
//                if (o2.getSpeed() == o1.getSpeed()) return (int) (o2.hp - o1.hp);
//                else return (int) (o2.getSpeed() - o1.getSpeed());
//            }
//        });
//    }
//}