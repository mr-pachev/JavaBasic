package Exercise_02;

import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceMovie = Double.parseDouble(scanner.nextLine());
        int nbc = Integer.parseInt(scanner.nextLine());
        double cloudNbc = Double.parseDouble(scanner.nextLine());
        double decor = priceMovie * 0.1;
        double priceCloudNbc = cloudNbc * nbc;

        if (nbc > 150) {
            priceCloudNbc = priceCloudNbc - (priceCloudNbc * 0.1);
        }

        double allPriceMovie = priceCloudNbc + decor;
        double difference = priceMovie - allPriceMovie;
        double priceDifference = Math.abs(difference);

        if (allPriceMovie > priceMovie) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",priceDifference);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", priceDifference);
        }
    }
}
