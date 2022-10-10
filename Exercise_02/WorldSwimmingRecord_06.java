package Exercise_02;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeSwimForMeter = Double.parseDouble(scanner.nextLine());

        double slowAnyTime = Math.floor(distance / 15);
        double slowTime = slowAnyTime * 12.5;
        double ivanTime = (distance * timeSwimForMeter) + slowTime;
        double diff = Math.abs(ivanTime - worldRecord);

        if (ivanTime < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivanTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }

    }
}
