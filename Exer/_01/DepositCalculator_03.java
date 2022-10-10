package Exer._01;

import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)

        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double yearPercentage = Double.parseDouble(scanner.nextLine());

        double interest = deposit * yearPercentage / 100;
        double interestForMonth = interest / 12;
        double sum = deposit + months * interestForMonth;

        System.out.println(sum);

    }
}
