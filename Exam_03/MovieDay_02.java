package Exam_03;

import java.util.Scanner;

public class MovieDay_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int screenTime = Integer.parseInt(scanner.nextLine()); //време за снимки
        int scenesSum = Integer.parseInt(scanner.nextLine()); //брой сцени за снимане
        int scenseTime = Integer.parseInt(scanner.nextLine()); //време за снимане на една сцена

        double allScreenTime = scenesSum * scenseTime;
        allScreenTime = allScreenTime + (15 * 1.0/ 100 * screenTime);

        if(allScreenTime <= screenTime){
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", Math.abs(screenTime - allScreenTime));
        }else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", Math.abs(allScreenTime - screenTime));
        }
    }
}
