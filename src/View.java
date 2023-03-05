import BaseHero.BaseHero;
import BaseHero.Vector2D;

import java.util.Collections;

public class View {
    private static int step = 1;
    private static final int[] l = {0};
    private static final String top10 = formatDiv("a") + String.join("",
            Collections.nCopies(14, formatDiv("-b"))) + formatDiv("-c");
    private static final String midl10 = formatDiv("d") + String.join("",
            Collections.nCopies(14, formatDiv("-e"))) + formatDiv("-f");
    private static final String bottom10 = formatDiv("g") + String.join("",
            Collections.nCopies(14, formatDiv("-h"))) + formatDiv("-i");

    private static void tabSetter(int cnt, int max) {
        int dif = max - cnt + 5;
        if (dif > 0) System.out.printf("%" + dif + "s", ":\t");
        else System.out.print(":\t");
    }

    private static String formatDiv(String str) {
        return str.replace('a', '\u250c')
                .replace('b', '-')
                .replace('c', '\u2510')
                .replace('d', '\u251c')
                .replace('e', '-')
                .replace('f', '\u2524')
                .replace('g', '\u2514')
                .replace('h', '-')
                .replace('i', '\u2518')
                .replace('-', '\u2500');
    }

    static String emoji(String a) {
        return a.replace("А", "🏹")
                .replace("С", "🏹")
                .replace("Ф", "\uD83D\uDC77")
                .replace("В", "\uD83E\uDDD9")
                .replace("М", "\uD83E\uDDD9")
                .replace("К", "\uD83D\uDC82")
                .replace("Р", "\uD83D\uDC82");
    }

    private static String getChar(int x, int y) {
        String out = "|" + AnsiColors.ANSI_BLACK + "->" + AnsiColors.ANSI_RESET;
        for (BaseHero baseHero : Main.allTeam) {
            if (baseHero.getCoords()[0] == x && baseHero.getCoords()[1] == y) {
                if (baseHero.getHp() == 0) {
                    out = "|" + ("\uD83E\uDDB4");
                    break;
                }
//                if (Main.team2.contains(baseHero)) out = "|" + (AnsiColors.ANSI_GREEN_BACKGROUND
//                        + baseHero.getEmoji() + AnsiColors.ANSI_RESET);
//                if (Main.team1.contains(baseHero)) out = "|" + (AnsiColors.ANSI_BLUE_BACKGROUND
//                        + baseHero.getEmoji() + AnsiColors.ANSI_RESET);
//                break;
                if (Main.team2.contains(baseHero)) out = "|" +  baseHero.getEmoji();
                if (Main.team1.contains(baseHero)) out = "|" + baseHero.getEmoji();
                break;
            }
        }
        return out;
    }

//        private static String getChar(int y, int x){
//        String out = "|" + AnsiColors.ANSI_BLACK + " ⟶" + AnsiColors.ANSI_RESET;
//        for (Unit human: Main.allTeam) {
//            if (human.getPos()[0] == x && human.getPos()[1] == y){
//                if (human.getHp() == 0) {
//                    out = "|" + (AnsiColors.ANSI_RED_BACKGROUND + emoji(String.valueOf(human.getInfo().charAt(0))) + AnsiColors.ANSI_RESET);
//                    break;
//                }
//                if (Main.darkTeam.contains(human)) out = "|" + (AnsiColors.ANSI_GREEN_BACKGROUND
//                + emoji(String.valueOf(human.getInfo().charAt(0))) + AnsiColors.ANSI_RESET);
//                if (Main.holyTeam.contains(human)) out = "|" + (AnsiColors.ANSI_BLUE_BACKGROUND
//                + emoji(String.valueOf(human.getInfo().charAt(0))) + AnsiColors.ANSI_RESET);
//                break;
//            }
//        }
//        return out;
//    }
    public static void view() {
        if (step == 1) {
            System.out.print(AnsiColors.ANSI_RED + "First step" + AnsiColors.ANSI_RESET);
        } else {
            System.out.print(AnsiColors.ANSI_RED + "Step:" + step + AnsiColors.ANSI_RESET);
        }
        step++;
        Main.allTeam.forEach((v) -> l[0] = Math.max(l[0], v.toString().length()));
        for (int i = 0; i < l[0] * 2; i++) System.out.print("_");
        System.out.println();
        System.out.print(top10 + "    ");
        System.out.print(AnsiColors.ANSI_BLUE + "Team Light" + AnsiColors.ANSI_RESET);
        for (int i = 0; i < l[0] - 8; i++) System.out.print(" ");
        System.out.println(":\t" + AnsiColors.ANSI_GREEN + "Team Dark" + AnsiColors.ANSI_RESET);
        for (int i = 1; i < 11; i++) {
            System.out.print(getChar(1, i));
        }
        System.out.print("|    ");
        System.out.print(AnsiColors.ANSI_BLUE + Main.team1.get(0) + AnsiColors.ANSI_RESET);
        tabSetter(Main.team1.get(0).toString().length(), l[0]);
        System.out.println(AnsiColors.ANSI_GREEN + Main.team2.get(0) + AnsiColors.ANSI_RESET);
        System.out.println(midl10);

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(getChar(i, j));
            }
            System.out.print("|    ");
            System.out.print(AnsiColors.ANSI_BLUE + Main.team1.get(i - 1) + AnsiColors.ANSI_RESET);
            tabSetter(Main.team1.get(i - 1).toString().length(), l[0]);
            System.out.println(AnsiColors.ANSI_GREEN + Main.team1.get(i - 1) + AnsiColors.ANSI_RESET);
            System.out.println(midl10);
        }
        for (int j = 1; j < 11; j++) {
            System.out.print(getChar(10, j));
        }
        System.out.print("|    ");
        System.out.print(AnsiColors.ANSI_BLUE + Main.team1.get(9) + AnsiColors.ANSI_RESET);
        tabSetter(Main.team1.get(9).toString().length(), l[0]);
        System.out.println(AnsiColors.ANSI_GREEN + Main.team2.get(9) + AnsiColors.ANSI_RESET);
        System.out.println(bottom10);
    }
}