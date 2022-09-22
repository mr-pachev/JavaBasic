package Exam_05;

import java.util.Scanner;

public class HighJump_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetHeight = Integer.parseInt(scanner.nextLine()); //желана височина
        int lastTry = 0; //последния скок
        int countUnsuccessfulTry = 0; //брояч на неуспешните опити
        int counterTry = 0; //брояч на скоковете
        boolean isSuccess = true;

        for (int startTry = targetHeight - 30; startTry <= targetHeight; startTry += 5) { //върти цикъл до достигане на зададената височина
            lastTry = startTry;

            for (int i = 1; i <= 3; i++) { //три опита за скок

                int currentTry = Integer.parseInt(scanner.nextLine()); //текущ опит
                counterTry++;

                if (currentTry <= startTry) { //проверка дали скока е неуспешен
                    countUnsuccessfulTry++;
                } else {
                    countUnsuccessfulTry = 0;
                    break;
                }
            }

            if (countUnsuccessfulTry == 3) { //проверка дали има три неуспешни опита
                isSuccess = false;
                break;
            }
        }
        if (!isSuccess) {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", lastTry, counterTry);
        } else {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", lastTry, counterTry);
        }

    }
}
