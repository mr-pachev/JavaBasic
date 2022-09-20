package Exam_05;

import java.util.Scanner;

public class TennisRanklist_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTournaments = Integer.parseInt(scanner.nextLine()); //брой турнири, в които е участвал
        int startPoint = Integer.parseInt(scanner.nextLine()); //брой точки, с които започва турнира

        int counterPoints = 0; //брой точки от турнирите
        int counterTournamentsWon = 0; //брой спечелени турнири
        double averagePointsEarned = 0; //средно спечелени  точки от турнир
        double percentageOfTournamentsWon = 0; //процент спечелени турнири

        for (int countTournaments = 1; countTournaments <= numberOfTournaments; countTournaments++) {
            String stageOfTheTournament = scanner.nextLine(); //етап на турнира

            if (stageOfTheTournament.equals("W")){
                counterPoints += 2000;
                counterTournamentsWon++;
            }else if (stageOfTheTournament.equals("F")){
                counterPoints += 1200;
            }else if (stageOfTheTournament.equals("SF")){
                counterPoints += 720;
            }
        }

        averagePointsEarned = Math.floor(counterPoints * 1.0 / numberOfTournaments);
        percentageOfTournamentsWon = counterTournamentsWon * 1.0 * 100/ numberOfTournaments;

        System.out.printf("Final points: %d%n", counterPoints + startPoint);
        System.out.printf("Average points: %.0f%n", averagePointsEarned);
        System.out.printf("%.2f%%%n", percentageOfTournamentsWon);
    }
}
