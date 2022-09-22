package Exam_06;

import java.util.Scanner;

public class EasterBakery_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double flourPrice = Double.parseDouble(scanner.nextLine()); //цена за килограм брашно

        double kilogramsOfFlour = Double.parseDouble(scanner.nextLine()); //килограми брашно
        double kilogramsOfSugar = Double.parseDouble(scanner.nextLine()); //килограми захар
        int numberOfEggShells = Integer.parseInt(scanner.nextLine()); //брой на корите с яйца
        int packetsOfYeast = Integer.parseInt(scanner.nextLine()); //пакети с мая

        double priceSugar = flourPrice - (25 * 1.0 / 100 * flourPrice); //цена на килограм захар
        double priceOfEggShells = flourPrice + (10 * 1.0 / 100 * flourPrice); //цена на кора яйца
        double priceYeast = priceSugar - (80 * 1.0 / 100 * priceSugar); //цена на пакет мая

        double allPrice = (kilogramsOfFlour * flourPrice) + (kilogramsOfSugar * priceSugar) + (numberOfEggShells * priceOfEggShells)
                + (packetsOfYeast * priceYeast);

        System.out.printf("%.2f", allPrice);
        
    }
}
