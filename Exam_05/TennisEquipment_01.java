package Exam_05;

import java.util.Scanner;

public class TennisEquipment_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tennisRacketPrice = Double.parseDouble(scanner.nextLine()); //цена на тенис ракета
        int quantityTennisRackets = Integer.parseInt(scanner.nextLine()); //брой на тенис ракетите
        int pairsOfSneakersQuantity = Integer.parseInt(scanner.nextLine()); //брой чифтове маратонки

        double allEquipmentPrice = 0;
        allEquipmentPrice = (tennisRacketPrice * quantityTennisRackets) + (pairsOfSneakersQuantity * (tennisRacketPrice / 6));
        allEquipmentPrice += (20 * 1.0 / 100 * allEquipmentPrice);

        double djokovicPrice = allEquipmentPrice / 8; //сумата, която трябва да заплати Джокович
        double sponsorsPrice = allEquipmentPrice - djokovicPrice; //сумата, която трябва да заплатят спонсорите

        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(djokovicPrice));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(sponsorsPrice));

    }
}
