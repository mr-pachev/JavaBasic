package Exam_06;

import java.util.Scanner;

public class EasterGuests_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumGuests = Integer.parseInt(scanner.nextLine()); //брой на гостите
        int budget = Integer.parseInt(scanner.nextLine()); //бюджет

        double neededEasterBreads = Math.ceil(sumGuests * 1.0 / 3); //нужни козунаци
        int neededEggs = sumGuests * 2; //нужни яйца

        double priceEasterBreads = neededEasterBreads * 4;
        double priceEggs = neededEggs * 0.45;
        double allPrice = priceEasterBreads + priceEggs;

        if (allPrice <= budget){
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.%n", neededEasterBreads, neededEggs);
            System.out.printf("He has %.2f lv. left.", budget - allPrice);
        }else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", allPrice - budget);
        }



    }
}
