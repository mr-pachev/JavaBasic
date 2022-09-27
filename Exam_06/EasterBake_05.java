package Exam_06;

import java.util.Scanner;

public class EasterBake_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBreads = Integer.parseInt(scanner.nextLine()); //брой козунаци за правене
        double counterSugar = 0;
        int maxSugar = 0;
        double counterFlour = 0;
        int maxFlour = 0;


        for (int current = 1; current <= easterBreads; current++) {
            int spendSugar = Integer.parseInt(scanner.nextLine()); //изразходена захар
            int spendFlour = Integer.parseInt(scanner.nextLine()); //изразходено  рашно

            counterSugar += spendSugar;
            counterFlour += spendFlour;

            if (spendSugar >= maxSugar) {
                maxSugar = spendSugar;
            }
            if (spendFlour >= maxFlour){
                maxFlour =spendFlour;
            }
        }

        counterSugar = Math.ceil(counterSugar / 950);
        counterFlour = Math.ceil(counterFlour / 750);

        System.out.printf("Sugar: %.0f%n", counterSugar);
        System.out.printf("Flour: %.0f%n", counterFlour);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);

    }
}
