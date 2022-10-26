package Exersise_04;

import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumTournaments = Integer.parseInt(scanner.nextLine());
        double pointsRangList = Double.parseDouble(scanner.nextLine());

        double countWinTournaments = 0;
        double count = 0;

        for (int i = 1; i <= sumTournaments; i++) {
            String input = scanner.nextLine();


            switch (input) {
                case "W":
                    pointsRangList = pointsRangList + 2000;
                    countWinTournaments++;
                    count += 2000;
                    break;
                case "F":
                    pointsRangList = pointsRangList + 1200;
                    count += 1200;
                    break;
                case "SF":
                    pointsRangList = pointsRangList + 720;
                    count += 720;
                    break;

            }
        }
        System.out.printf("Final points: %.0f%n", pointsRangList);
        System.out.printf("Average points: %.0f%n", Math.floor(count / sumTournaments));
        System.out.printf("%.2f%%", countWinTournaments / sumTournaments * 100);
    }
}
