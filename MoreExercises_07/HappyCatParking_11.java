package MoreExercises_07;

import java.util.Scanner;

public class HappyCatParking_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumDays = Integer.parseInt(scanner.nextLine());
        int sumHours = Integer.parseInt(scanner.nextLine());
        double counter = 0;
        double allSum = 0;


        for (int day = 1; day <= sumDays; day++) { //цикъл за дните

            counter = 0;
            for (int hour = 1; hour <= sumHours; hour++) { //цикъл за часовете

                if (day % 2 != 0) { //проверка дали деня е нечетен
                    if(hour % 2 == 0){ //проверка дали часа е четен
                        counter += 1.25;
                    }else {
                        counter += 1.00;
                    }
                } else {
                    if(hour % 2 != 0){ //проверка дали часа е нелетен
                        counter += 2.50;
                    }else {
                        counter += 1.00;
                    }
                }
            }
            System.out.printf("Day: %d - %.2f leva%n", day, counter);
            allSum +=  counter;
        }
        System.out.printf("Total: %.2f leva", allSum);

    }
}
