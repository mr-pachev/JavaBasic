package Exam_04;

import java.util.Scanner;

public class VetParking_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumDays = Integer.parseInt(scanner.nextLine()); //брой дни
        int sumHours = Integer.parseInt(scanner.nextLine()); //брой часове
        double currentDaySum = 0; //сума за текущия ден
        double allDaysSum = 0; //сума за всички дни

        for (int currentDay = 1; currentDay <= sumDays; currentDay++) {
            currentDaySum = 0;

            for (int currentHour = 1; currentHour <= sumHours; currentHour++) {

                if (currentDay % 2 == 0 && currentHour % 2 != 0){
                    currentDaySum += 2.50;
                }else if (currentDay % 2 != 0 && currentHour % 2 == 0){
                    currentDaySum += 1.25;
                }else {
                    currentDaySum += 1.00;
                }
            }
            allDaysSum += currentDaySum;
            System.out.printf("Day: %d - %.2f leva%n", currentDay, currentDaySum);
        }
        System.out.printf("Total: %.2f leva", allDaysSum);
    }
}
