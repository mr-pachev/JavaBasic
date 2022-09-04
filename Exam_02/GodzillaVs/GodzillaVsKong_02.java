package Exam_02.GodzillaVs;

import java.util.Scanner;

public class GodzillaVsKong_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine()); //бюджет за филма
        int people = Integer.parseInt(scanner.nextLine()); //брой статисти
        double priceDress = Double.parseDouble(scanner.nextLine()); //цена за облеклото на един статист

        double allPricerDressPeople = 0; //цена за облеклото на всички статисти

        if (people > 150) {
            allPricerDressPeople = people * priceDress;
            double diff = 10 * 1.0 / 100 * allPricerDressPeople;
            allPricerDressPeople = allPricerDressPeople - diff;
        } else {
            allPricerDressPeople = people * priceDress;
        }

        double decor = 10 * 1.0 / 100 * budget; //декор за филма

        double allPrice = allPricerDressPeople + decor;

        if(allPrice > budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", allPrice - budget);
        }else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - allPrice);
        }
    }
}
