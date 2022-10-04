package Exam_08;

import java.util.Scanner;

public class TournamentaOfChristmas_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumDays = Integer.parseInt(scanner.nextLine()); //брой дни на турнира

        double sumWin = 0; //спечелена общо сума
        double daySumWin = 0; //спечелена сума за деня
        int currentCounterWin = 0; //спечелени игри през деня
        int currentCounterLose = 0; //загубени игри през дена
        int dayCounterWin = 0; //общо спечелени дни
        int dayCounterLose = 0; //общо загубени дни

        for (int currentDay = 1; currentDay <= sumDays; currentDay++) {
            String sport = scanner.nextLine(); //спорт
            currentCounterWin = 0;
            currentCounterLose = 0;
            daySumWin = 0;

            while (!sport.equals("Finish")) {
                String result = scanner.nextLine(); //резултат от играта

                if (result.equals("win")) {
                    daySumWin += 20;
                    currentCounterWin++;
                } else if (result.equals("lose")) {
                    currentCounterLose++;
                }
                sport = scanner.nextLine();
            }
            if (currentCounterWin > currentCounterLose){
                dayCounterWin++;
                daySumWin += 10 * 1.0 / 100 * daySumWin;
                sumWin += daySumWin;
            }else {
                dayCounterLose++;
                sumWin += daySumWin;
            }

        }

         if (dayCounterWin > dayCounterLose) {
             sumWin += 20 * 1.0 / 100 * sumWin;
             System.out.printf("You won the tournament! Total raised money: %.2f", sumWin);
         }else {
             System.out.printf("You lost the tournament! Total raised money: %.2f", sumWin);
         }
    }
}
