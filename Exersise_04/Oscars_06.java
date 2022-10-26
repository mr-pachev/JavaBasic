package Exersise_04;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double pointsAcademy = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());



        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            double countEvaluating = Double.parseDouble(scanner.nextLine());
            int num = input.length();

            countEvaluating = countEvaluating * num / 2;

            pointsAcademy = pointsAcademy + countEvaluating;
            if (pointsAcademy > 1250.5) {
                break;
            }
        }
        if (pointsAcademy >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, pointsAcademy);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", name, Math.abs(1250.5 - pointsAcademy));
        }
    }
}
