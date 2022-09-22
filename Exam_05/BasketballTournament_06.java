package Exam_05;

import java.util.Scanner;

public class BasketballTournament_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tournamentName = scanner.nextLine(); //име на турнира
        int countWinGame = 0; //брой на печелившите мачове
        int countLosGame = 0; //брой на загубените мачове
        int counterGame = 0; //брой изиграни мачове
        int pointsWin = 0; //вкарани точки от на Деси отбора
        int pointsLos = 0; //вкарани точки от противниковия отбор

        while (!tournamentName.equals("End of tournaments")) {

            int countGameCurrentTournament = Integer.parseInt(scanner.nextLine()); //брой мачова за дадения турнир

            for (int currentGame = 1; currentGame <= countGameCurrentTournament; currentGame++) { //цикъл за броя мачове на текущия турнир
                pointsWin = Integer.parseInt(scanner.nextLine());
                pointsLos = Integer.parseInt(scanner.nextLine());
                counterGame++;

                if (pointsWin > pointsLos) {
                    countWinGame++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", currentGame, tournamentName, pointsWin - pointsLos);
                } else if (pointsWin < pointsLos) {
                    countLosGame++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", currentGame, tournamentName, pointsLos - pointsWin);
                }
            }

            tournamentName = scanner.nextLine();
        }

        System.out.printf("%.2f%% matches win%n", countWinGame * 1.0 / counterGame * 100);
        System.out.printf("%.2f%% matches lost", countLosGame * 1.0 / counterGame * 100);
    }
}
