package Exam_01;

import java.util.Scanner;

public class FootballTournament_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String teams = scanner.nextLine();
        int games = Integer.parseInt(scanner.nextLine());
        int countPoints = 0; //спечелени точки
        int countW = 0;
        int countD = 0;
        int countL = 0;
        double percentW = 0; //процента спечелени мачове от всички изиграни срещи

        for (int currentGame = 1; currentGame <= games; currentGame++) {

            String gameResult = scanner.nextLine(); //тип резултат на текущата среща

            if(gameResult.equals("W")){
                countW++;
                countPoints += 3;
            }else if(gameResult.equals("D")){
                countD++;
                 countPoints += 1;
            }else if(gameResult.equals("L")){
                countL++;
            }
        }

        if(games > 0){
            percentW = countW * 1.0 * 100 / games;

            System.out.printf("%s has won %d points during this season.%n", teams, countPoints);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", countW);
            System.out.printf("## D: %d%n", countD);
            System.out.printf("## L: %d%n", countL);
            System.out.printf("Win rate: %.2f%%%n", percentW);
        }else {
            System.out.printf("%s hasn't played any games during this season.", teams);
        }

    }
}
