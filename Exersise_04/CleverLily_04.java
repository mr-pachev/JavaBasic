package Exersise_04;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearsLili = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double sumYears = 0;
        double countSumYears = 0;
        double brotherDiscount = 0;
        double countToys = 0;

        for (int i = 1; i <= yearsLili; i = i + 1) {
            if (i % 2 == 0) {
                countSumYears = countSumYears + 10;
                sumYears = sumYears + countSumYears;
                brotherDiscount = brotherDiscount + 1;
            } else {
                countToys = countToys + 1;
            }
        }
        double allPriceLili = (sumYears - brotherDiscount) + (countToys * toyPrice);
        double diff = Math.abs(allPriceLili - washingMachinePrice);
        if (allPriceLili >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", diff);
        }else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
