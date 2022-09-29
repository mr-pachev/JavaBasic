package Exam_07;

import java.util.Scanner;

public class Balls_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumBalls = Integer.parseInt(scanner.nextLine()); //броя на топките, които ще се вадят
        String ballColor = ""; //цвят на даденото топче

        double allPoints = 0; //всички събрани точки
        int counterBallsOfColors = 0; //броя на избраните топки извън дадените цветове
        int countDividedByTwo = 0; //брояч на топките точките, на които е разделен на 2
        int counterRedBalls = 0;
        int counterOrangeBalls = 0;
        int counterYellowBalls = 0;
        int counterWhiteBalls = 0;

        for (int currentBall = 1; currentBall <= sumBalls; currentBall++) {
            ballColor = scanner.nextLine();

            if (ballColor.equals("red")){
                counterRedBalls++;
                allPoints += 5;
            }else if (ballColor.equals("orange")){
                counterOrangeBalls++;
                allPoints += 10;
            }else if (ballColor.equals("yellow")){
                counterYellowBalls++;
                allPoints += 15;
            }else if (ballColor.equals("white")){
                counterWhiteBalls++;
                allPoints += 20;
            }else if (ballColor.equals("black")){
                countDividedByTwo++;
                allPoints = Math.floor(allPoints / 2);
            }else {
                 counterBallsOfColors++;
            }

        }
        System.out.printf("Total points: %.0f%n", allPoints);
        System.out.printf("Red balls: %d%n", counterRedBalls);
        System.out.printf("Orange balls: %d%n", counterOrangeBalls);
        System.out.printf("Yellow balls: %d%n", counterYellowBalls);
        System.out.printf("White balls: %d%n", counterWhiteBalls);
        System.out.printf("Other colors picked: %d%n", counterBallsOfColors);
        System.out.printf("Divides from black balls: %d", countDividedByTwo);
    }
}
