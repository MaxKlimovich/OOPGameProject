import BaseHero.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static final int teamCount = 10;
    public static ArrayList<BaseHero> allTeam = new ArrayList<>();
    public static ArrayList<BaseHero> team1 = new ArrayList<>();
    public static ArrayList<BaseHero> team2 = new ArrayList<>();
    static int dieTeam1 = 0;
    static int dieTeam2 = 0;

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        user_input.nextLine();
        createTeam(team1, 0, 1);
        createTeam(team2, 3, 10);
        allTeam.addAll(team1);
        allTeam.addAll(team2);
        sortTeam(allTeam);

        while (true){
            View.view();
            user_input.nextLine();
            for (BaseHero baseHero: allTeam) {
                if ( team1.contains(baseHero)) baseHero.step(team1, team2);
                else baseHero.step(team2, team1);
            }
            for (BaseHero baseHero: team1) {
                if (baseHero.getState() == "Die") dieTeam1++;
            }
            if (dieTeam1 == 10){
                System.out.println("******************************************Team Light winner!******************************************");
                break;
            } else dieTeam1 = 0;
            for (BaseHero baseHero: team2) {
                if (baseHero.getState() == "Die") dieTeam2++;
            }
            if (dieTeam2 == 10){
                System.out.println("******************************************Team Dark winner!******************************************");
                break;
            } else dieTeam2 = 0;
        }
    }
    static void createTeam(ArrayList team, int offset, int posY) {
        for (int i = 0; i <= teamCount; i++) {
            int rnd = new Random().nextInt(4) + offset;
            switch (rnd) {
                case 0:
                    team.add(new Monk(BaseHero.getName(), i + 1, posY));
                    break;
                case 1:
                    team.add(new Fermer(BaseHero.getName(), i, posY));
                    break;
                case 2:
                    team.add(new Pickener(BaseHero.getName(), i, posY));
                    break;
                case 3:
                    team.add(new BowMan(BaseHero.getName(), i, posY));
                    break;
                case 4:
                    team.add(new Sniper(BaseHero.getName(), i, posY));
                    break;
                case 5:
                    team.add(new Rogue(BaseHero.getName(), i, posY));
                    break;
                case 6:
                    team.add(new Warlock(BaseHero.getName(), i, posY));
                    break;
            }
        }
    }
    static void sortTeam(ArrayList<BaseHero> team) {
        team.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                if (o2.getSpeed() == o1.getSpeed()) return (int) (o2.getHp() - o1.getHp());
                else return (int) (o2.getSpeed() - o1.getSpeed());
            }
        });
    }
}









