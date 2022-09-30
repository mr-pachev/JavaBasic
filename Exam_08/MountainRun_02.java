package Exam_08;

import java.util.Scanner;

public class MountainRun_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double timeRecord = Double.parseDouble(scanner.nextLine()); //времето за подобряване в секунди
        double distance = Double.parseDouble(scanner.nextLine()); //разстояние за преодоляване
        double timeForMeter = Double.parseDouble(scanner.nextLine()); //времето за изкачване на един метър в секунди

        double slowlyTime = Math.floor(distance / 50); //времето, с което ще се забави
        slowlyTime = slowlyTime * 30;
        double time = 0; //постигнатото време
        time = distance * timeForMeter;;
        time += slowlyTime;

        if (time < timeRecord){
            System.out.printf("Yes! The new record is %.2f seconds.", time);
        }else {
            System.out.printf("No! He was %.2f seconds slower.", time - timeRecord);
        }

    }
}