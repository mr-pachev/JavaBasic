package Exam_08;

import java.util.Scanner;

public class CatWalking_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dailyMinutesWalking = Integer.parseInt(scanner.nextLine()); //минути на една разходка
        int sumDailyWalking = Integer.parseInt(scanner.nextLine()); //брой разходки дневно
        int calories = Integer.parseInt(scanner.nextLine());//приети калорий дневно

        int minutesForOneWalking = dailyMinutesWalking * sumDailyWalking; //минути общо разходки на ден
        int dailyCaloriesBurn = minutesForOneWalking * 5; //общо изгорени калорий на ден

        double minBurnCalories = 50 * 1.0 / 100 * calories;

        if (dailyCaloriesBurn >= minBurnCalories){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", dailyCaloriesBurn);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", dailyCaloriesBurn);
        }

    }
}
