package Exersise_03;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int sumFlower = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double flowerPrice = 0;
        double priceDiscount = 0;
        boolean sum = sumFlower >= 10 && sumFlower <= 1000;
        boolean sumBudget = budget >= 50 && budget <= 2500;


        if (sum && sumBudget) {
            switch (flower) {
                case "Roses":
                    if (sumFlower > 80) {
                        flowerPrice = sumFlower * 5;
                        priceDiscount = flowerPrice - (flowerPrice * 0.1);
                    } else {
                        priceDiscount = sumFlower * 5;
                    }
                    break;

                case "Dahlias":
                    if (sumFlower > 90) {
                        flowerPrice = sumFlower * 3.80;
                        priceDiscount = flowerPrice - (flowerPrice * 0.15);
                    } else {
                        priceDiscount = sumFlower * 3.80;
                    }
                    break;

                case "Tulips":
                    if (sumFlower > 80) {
                        flowerPrice = sumFlower * 2.80;
                        priceDiscount = flowerPrice - (flowerPrice * 0.15);
                    } else {
                        priceDiscount = sumFlower * 2.80;
                    }
                    break;

                case "Narcissus":
                    if (sumFlower < 120) {
                        flowerPrice = sumFlower * 3;
                        priceDiscount = flowerPrice + (flowerPrice * 0.15);
                    } else {
                        priceDiscount = sumFlower * 3;
                    }
                    break;

                case "Gladiolus":
                    if (sumFlower < 80) {
                        flowerPrice = sumFlower * 2.50;
                        priceDiscount = flowerPrice + (flowerPrice * 0.2);
                    } else {
                        priceDiscount = sumFlower * 2.50;
                    }
                    break;

            }
            double diff = Math.abs(budget - priceDiscount);
            if (budget >= priceDiscount) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", sumFlower, flower, diff);
            } else {
                System.out.printf("Not enough money, you need %.2f leva more.", diff);
            }
        }


    }
}
