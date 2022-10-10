package Exercise_02;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

//        •	Видеокарта – 250 лв./бр.
//        •	Процесор – 35% от цената на закупените видеокарти/бр.
//        •	Рам памет – 10% от цената на закупените видеокарти/бр.

        double priceVideoCards = 250;
        double countPriceVideo = videoCards * priceVideoCards;
        double priceProcessors = countPriceVideo * 0.35;
        double priceRam = countPriceVideo * 0.1;

        double countProcessors = processors * priceProcessors;
        double countRam = ram * priceRam;
        double allPrice = countPriceVideo + countProcessors + countRam;

        if (videoCards > processors) {
            allPrice = allPrice - (allPrice * 0.15);
        }else {

        }
        double diff = Math.abs(budget - allPrice);
        if (budget >= allPrice) {
            System.out.printf("You have %.2f leva left!", diff);
        } else if (budget < allPrice) {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }
    }
}
