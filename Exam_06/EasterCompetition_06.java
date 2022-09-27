package Exam_06;

import java.util.Scanner;

public class EasterCompetition_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumEasterBred = Integer.parseInt(scanner.nextLine()); //брой козунаци
        String theNameOfTheBakery = ""; //името на текущия пекар
        String bestBakeryName = "";
        int currentPoints = 0;
        int maxPoints = 0;

        for (int current = 1; current <= sumEasterBred; current++) {
            currentPoints = 0;
            theNameOfTheBakery = scanner.nextLine();
            String input = scanner.nextLine();

            while (!input.equals("Stop")){
                currentPoints += Integer.parseInt(input);

                input = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", theNameOfTheBakery, currentPoints);

            if (maxPoints < currentPoints){
                maxPoints = currentPoints;
                bestBakeryName = theNameOfTheBakery;
                System.out.printf("%s is the new number 1!%n", bestBakeryName);
            }

        }
        System.out.printf("%s won competition with %d points!", bestBakeryName, maxPoints);


    }
}
