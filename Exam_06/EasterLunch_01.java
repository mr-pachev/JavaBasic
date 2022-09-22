package Exam_06;

import java.util.Scanner;

public class EasterLunch_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumEasterBreads = Integer.parseInt(scanner.nextLine()); //брой козунаци
        int eggShells = Integer.parseInt(scanner.nextLine()); //брой кори с яйца
        int kilogramOfCookies = Integer.parseInt(scanner.nextLine()); //килограм курабии

        double priceEasterBreads = 0; //цена за козунаците
        double priceKilogramOfCookies = 0; //цена за курабиите
        double priceEggShell = 0; //цена за кори яйца
        double paintForEggs = 0; //цена за боядисването на едно яйце

        double allPriceOfEasterLunch = 0; //цена за Великденския обяд

        priceEasterBreads = sumEasterBreads * 3.20;
        priceKilogramOfCookies = kilogramOfCookies * 5.40;
        priceEggShell = eggShells * 4.35;
        paintForEggs = 0.15 * (eggShells * 12);

        allPriceOfEasterLunch = priceEasterBreads + priceKilogramOfCookies + priceEggShell + paintForEggs;
        System.out.printf("%.2f", allPriceOfEasterLunch);
    }
}
