package Exam_05;

import java.util.Scanner;

public class HighJump_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetHeight = Integer.parseInt(scanner.nextLine()); //желана височина
        int startHeight = targetHeight - 30; //стартова височина

        int currentTry = Integer.parseInt(scanner.nextLine()); //текущ опит
        int countUnsuccessfulTry = 0; //брояч на неуспешните опити
        int counterTry = 1; //брояч на скоковете

        boolean isSuccess = true;

        while (currentTry <= targetHeight) {

            if (currentTry > startHeight) { //проверка дали опита е успешен
                countUnsuccessfulTry = 0;
                startHeight += 5;
            } else {
                countUnsuccessfulTry++;
            }

            if (countUnsuccessfulTry == 3) { //проверка дали неуспешните опити са повече от 3
                isSuccess = false;
                break;
            }

            currentTry = Integer.parseInt(scanner.nextLine());
            counterTry++;

        }

        if (!isSuccess) {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", startHeight, counterTry);
        } else {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", startHeight, counterTry);
        }

    }
}
