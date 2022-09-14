package Exam_04;

import java.util.Scanner;

public class Safari_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine()); //бюджет
        double fuelNeeded = Double.parseDouble(scanner.nextLine()); //нужни литри гориво
        String dayOfWeek = scanner.nextLine(); //ден от седмицата

        double allPrice = (fuelNeeded * 2.10) + 100;

        if (dayOfWeek.equals("Saturday")){
            allPrice -= 10 * 1.0 / 100 * allPrice;
        }else if (dayOfWeek.equals("Sunday")){
            allPrice -= 20 * 1.0 / 100 * allPrice;
        }

        if (allPrice <= budget) {
            System.out.printf("Safari time! Money left: %.2f lv.", budget - allPrice);
        }else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", allPrice - budget);
        }

    }
}
