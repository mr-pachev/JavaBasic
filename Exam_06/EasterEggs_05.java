package Exam_06;

import java.util.Scanner;

public class EasterEggs_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paintingEggs = Integer.parseInt(scanner.nextLine()); //боядисани яйца
        int redCount = 0;
        int orangeCount = 0;
        int blueCount = 0;
        int greenCount = 0;
        int maxCount = 0;
        String bestColor = "";

        for (int currentEggs = 1; currentEggs <= paintingEggs; currentEggs++) {
            String colorEgg = scanner.nextLine(); //цвят на яйцето

            if (colorEgg.equals("red")) {
                redCount++;
                if (maxCount < redCount) {
                    maxCount = redCount;
                    bestColor = colorEgg;
                }
            } else if (colorEgg.equals("orange")) {
                orangeCount++;
                if (maxCount < orangeCount) {
                    maxCount = orangeCount;
                    bestColor = colorEgg;
                }
            } else if (colorEgg.equals("blue")) {
                blueCount++;
                if (maxCount < blueCount) {
                    maxCount = blueCount;
                    bestColor = colorEgg;
                }
            } else if (colorEgg.equals("green")) {
                greenCount++;
                if (maxCount < greenCount) {
                    maxCount = greenCount;
                    bestColor = colorEgg;
                }
            }
        }
        System.out.printf("Red eggs: %d%n", redCount);
        System.out.printf("Orange eggs: %d%n", orangeCount);
        System.out.printf("Blue eggs: %d%n", blueCount);
        System.out.printf("Green eggs: %d%n", greenCount);
        System.out.printf("Max eggs: %d -> %s", maxCount, bestColor);
    }
}
