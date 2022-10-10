package Exercise_02;

import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeFirs = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        int totalTime = timeFirs + timeSecond + timeThird;
        int minTotalTime = Math.round(totalTime / 60);
        int secTotalTime = Math.round(totalTime % 60);

        if (secTotalTime < 10) {
            System.out.printf("%d" + ":" + "0" + "%d", minTotalTime, secTotalTime);
        } else {
            System.out.printf("%d" + ":" + "%d", minTotalTime, secTotalTime);
        }
    }
}
