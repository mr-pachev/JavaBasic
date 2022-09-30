package Exam_08;

import java.util.Scanner;

public class BirthdayParty_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rentHall = Double.parseDouble(scanner.nextLine()); //наем на залата

        double priceCake = 20 * 1.0 / 100 * rentHall; //цена на тортата
        double priceDrinks = priceCake - (45 * 1.0 / 100 * priceCake); //цена на напитки
        double animatorPrice = rentHall / 3; //цена за аниматор

        double budget = rentHall + priceCake + priceDrinks + animatorPrice;

        System.out.printf("%.1f", budget);
    }
}
