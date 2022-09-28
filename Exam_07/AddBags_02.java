package Exam_07;

import java.util.Scanner;

public class AddBags_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceBagsUntil20 = Double.parseDouble(scanner.nextLine()); //цена на багаж над 20 кг
        double kilogramsOfBags = Double.parseDouble(scanner.nextLine()); //килограми на багажа
        int daysToTravel = Integer.parseInt(scanner.nextLine()); //дни до пътуването
        int sumBags = Integer.parseInt(scanner.nextLine()); //брой на багажите

        double priceUpTo10 = 20 * 1.0 / 100 * priceBagsUntil20; //цена на багаж до 10 кг.
        double priceFrom10To20 = 50 * 1.0 / 100 * priceBagsUntil20; //цена на багаж от 10 до 20 кг.

        double allPrice = 0;

        if (kilogramsOfBags < 10){
            allPrice = priceUpTo10;
        }else if (kilogramsOfBags >= 10 && kilogramsOfBags <= 20){
            allPrice = priceFrom10To20;
        }else if (kilogramsOfBags > 20) {
            allPrice = priceBagsUntil20;
        }

        if (daysToTravel < 7){
            allPrice += 40 *1.0 / 100 * allPrice;
        }else if (daysToTravel >= 7 && daysToTravel <= 30){
            allPrice += 15 * 1.0 / 100 * allPrice;
        }else if (daysToTravel > 30){
            allPrice += 10 * 1.0 / 100 * allPrice;
        }

        allPrice = allPrice * sumBags;

        System.out.printf("The total price of bags is: %.2f lv.", allPrice);
    }
}
