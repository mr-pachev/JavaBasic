package Exam_08;

import java.util.Scanner;

public class TrekkingMania_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumGroupOfClimber = Integer.parseInt(scanner.nextLine()); //брой на групи катерачи
        int counterMussala = 0;
        int counterMontBlanc = 0;
        int counterKilimanjaro = 0;
        int counterK2 = 0;
        int counterEverest = 0;
        int counterAllClimber = 0; //брояч на всички катерачи

        for (int currentGroup = 1; currentGroup <= sumGroupOfClimber; currentGroup++) {
            int currentSumClimber = Integer.parseInt(scanner.nextLine()); //брой катерачи в групата
            counterAllClimber += currentSumClimber;

            if (currentSumClimber <= 5) {
                counterMussala += currentSumClimber;
            } else if (currentSumClimber <= 12) {
                counterMontBlanc += currentSumClimber;
            } else if (currentSumClimber <= 25) {
                counterKilimanjaro+= currentSumClimber;
            } else if (currentSumClimber <= 40) {
                counterK2 += currentSumClimber;
            } else {
                counterEverest += currentSumClimber;
            }

        }
        System.out.printf("%.2f%%%n", counterMussala * 1.0 / counterAllClimber * 100);
        System.out.printf("%.2f%%%n", counterMontBlanc * 1.0 / counterAllClimber * 100);
        System.out.printf("%.2f%%%n", counterKilimanjaro * 1.0 / counterAllClimber * 100);
        System.out.printf("%.2f%%%n", counterK2 * 1.0 / counterAllClimber * 100);
        System.out.printf("%.2f%%%n", counterEverest * 1.0 / counterAllClimber * 100);
    }
}
