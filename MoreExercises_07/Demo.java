package MoreExercises_07;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int numPassCombinations = Integer.parseInt(scanner.nextLine()); //брой допустими комбинаций
        int counterSymbolA = 0;
        int counterSymbolB = 0;
        int midDigitOne = 1;
        int midDigitTwo = 1;
        int symbolA = 0;
        int symbolB = 0;
        char charSymbolA = ' ';
        char charSymbolB = ' ';

        for (int allSunPasscode = 1; allSunPasscode <= numPassCombinations; allSunPasscode++) { //брояч на генерираните пароли
            //цикъл за А
            if (35 + counterSymbolA <= 55) { //проверка дали А превишава 55
                symbolA = 35 + counterSymbolA;
                charSymbolA = (char) symbolA;
                System.out.printf("%c", charSymbolA);

            } else {
                symbolA = 35;
                charSymbolA = (char) symbolA;
                System.out.printf("%c", charSymbolA);
                counterSymbolA = 1;
            }

            //цикъл за В
            if (64 + counterSymbolB <= 96) { //проверка дали B превишава 96
                symbolB = 64 + counterSymbolB;
                charSymbolB = (char) symbolB;
                System.out.printf("%c", charSymbolB);

            }else {
                symbolB = 64;
                charSymbolB = (char) symbolB;
                System.out.printf("%c", charSymbolB);
                counterSymbolB = 1;
            }

            //цикъл за ab
            if (midDigitOne <= a){
                System.out.printf("%d", midDigitOne);
                midDigitOne ++;
            }else {
                break;
            }

            if (midDigitTwo <= b){
                System.out.printf("%d", midDigitTwo);
                midDigitTwo++;
            }else {
                break;
            }

            //цикъл за В
            if (64 + counterSymbolB <= 96) { //проверка дали B превишава 96
                symbolB = 64 + counterSymbolB;
                charSymbolB = (char) symbolB;
                System.out.printf("%c", charSymbolB);
                counterSymbolB ++;
            }else {
                symbolB = 64;
                charSymbolB = (char) symbolB;
                System.out.printf("%c", charSymbolB);
                counterSymbolB = 1;
            }

            //цикъл за А
            if (35 + counterSymbolA <= 55) { //проверка дали А превишава 55
                symbolA = 35 + counterSymbolA;
                charSymbolA = (char) symbolA;
                System.out.printf("%c", charSymbolA);
                counterSymbolA ++;

            } else {
                symbolA = 35;
                charSymbolA = (char) symbolA;
                System.out.printf("%c", charSymbolA);
                counterSymbolA = 1;
            }

            System.out.print("|");
        }
        System.out.print("|");
    }
}
