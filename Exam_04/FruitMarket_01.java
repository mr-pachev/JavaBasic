package Exam_04;

import java.util.Scanner;

public class FruitMarket_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOfStrawberries = Double.parseDouble(scanner.nextLine()); //цена на ягодите
        double priceOfRaspberries = priceOfStrawberries / 2; //цена на малините
        double priceOfOranges = priceOfRaspberries - (40 * 1.0 / 100 * priceOfRaspberries); //цена на портокалите
        double priceOfBananas = priceOfRaspberries - (80 * 1.0 / 100 * priceOfRaspberries); //цена на бананите

        double quantityBananas = Double.parseDouble(scanner.nextLine()); //количество на бананите
        double quantityOranges = Double.parseDouble(scanner.nextLine()); //количество на портокалите
        double quantityRaspberries = Double.parseDouble(scanner.nextLine()); //количество на малините
        double quantityStrawberries = Double.parseDouble(scanner.nextLine()); //количество на ягодите

        double allPrice = (priceOfStrawberries * quantityStrawberries) + (priceOfRaspberries * quantityRaspberries)
                + (priceOfOranges * quantityOranges) + (priceOfBananas * quantityBananas);

        System.out.printf("%.2f", allPrice);

    }
}
