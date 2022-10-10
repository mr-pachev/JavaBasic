package Exercise_02;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serial = scanner.nextLine();
        int timeEpisode = Integer.parseInt(scanner.nextLine());
        int lunchBreak = Integer.parseInt(scanner.nextLine());

        double lunchTime = lunchBreak * 1.0 / 8;
        double restTime = lunchBreak * 1.0/ 4;
        double watchTime = lunchBreak - (restTime + lunchTime);
        double diff = Math.abs(watchTime - timeEpisode);

        if (watchTime >= timeEpisode){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serial, Math.ceil(diff));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serial, Math.ceil(diff));
        }

    }
}
