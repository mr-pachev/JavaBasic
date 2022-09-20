package Exam_05;

import java.util.Scanner;

public class Darts_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine(); //име на играч
        String input = scanner.nextLine();
        int winningShots = 0; //печеливши изстрели
        int losingShots = 0; //губещи изстрели
        int startPoints = 301;
        boolean isWin = false;

        while (!input.equals("Retire")) {
            int currentPoints = 0;
            String field = input; //поле
            int points = Integer.parseInt(scanner.nextLine()); //точки

            //проверка на кое поле е попадната стреличката
            if (field.equals("Single")) {
                currentPoints = points;
            } else if (field.equals("Double")) {
                currentPoints = 2 * points;
            } else if (field.equals("Triple")) {
                currentPoints = 3 * points;
            }

            //проверка дали точките от изтрела са повече от наличните
            if (currentPoints <= startPoints) {
                winningShots++;
                startPoints -= currentPoints;
            } else {
                losingShots++;
            }

            if (startPoints <= 0) { //проверка дали началните точки со повече от нула
                isWin = true;
                break;
            }
            input = scanner.nextLine();

        }

        if (isWin) {
            System.out.printf("%s won the leg with %d shots.", playerName, winningShots);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.", playerName, losingShots);
        }

    }
}
