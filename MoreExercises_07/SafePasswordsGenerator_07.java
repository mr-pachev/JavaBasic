package MoreExercises_07;

import java.util.Scanner;

public class SafePasswordsGenerator_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int numPassCombinations = Integer.parseInt(scanner.nextLine()); //брой допустими комбинаций
        int counterSymbolA = 0;
        int counterSymbolB = 0;

        for (int allSunPasscode = 1; allSunPasscode <= numPassCombinations; allSunPasscode++) { //брояч на генерираните пароли

            if (35 + counterSymbolA <= 55) { //проверка дали А превишава 55

                for (int symbolA = 35 + counterSymbolA; symbolA <= 55; symbolA++) {
                    char charSymbolA = (char) symbolA;

                    if (64 + counterSymbolB <= 96) { //проверка дали B превишава 96
                        for (int symbolB = 64 + counterSymbolB; symbolB <= 96; symbolB++) {
                            char charSymbolB = (char) symbolB;

                            for (int midDigitOne = 1; midDigitOne <= a; midDigitOne++) {
                                for (int midDigitTwo = 1; midDigitTwo <= b; midDigitTwo++) {
                                    System.out.printf("%c%c%d%d%c%c", charSymbolA, charSymbolB, midDigitOne, midDigitTwo, charSymbolB, charSymbolA);
                                    System.out.printf("|");
                                }
                            }
                        }
                    } else {
                        for (int symbolB = 64; symbolB <= 96; symbolB++) {
                            char charSymbolB = (char) symbolB;

                            for (int midDigitOne = 1; midDigitOne <= a; midDigitOne++) {
                                for (int midDigitTwo = 1; midDigitTwo <= b; midDigitTwo++) {
                                    System.out.printf("%c%c%d%d%c%c", charSymbolA, charSymbolB, midDigitOne, midDigitTwo, charSymbolB, charSymbolA);
                                    System.out.printf("|");
                                }
                            }
                        }
                    }
                }
                counterSymbolA += 1;
                counterSymbolB += 1;
            } else {
                counterSymbolA = 1;
                for (int symbolA = 35; symbolA <= 55; symbolA++) {
                    char charSymbolA = (char) symbolA;

                    if (64 + counterSymbolB <= 96) { //проверка дали B превишава 96
                        for (int symbolB = 64 + counterSymbolB; symbolB <= 96; symbolB++) {
                            char charSymbolB = (char) symbolB;

                            for (int midDigitOne = 1; midDigitOne <= a; midDigitOne++) {
                                for (int midDigitTwo = 1; midDigitTwo <= b; midDigitTwo++) {
                                    System.out.printf("%c%c%d%d%c%c", charSymbolA, charSymbolB, midDigitOne, midDigitTwo, charSymbolB, charSymbolA);
                                }
                            }
                        }

                    } else {
                        counterSymbolB = 1;
                        for (int symbolB = 64; symbolB <= 96; symbolB++) {
                            char charSymbolB = (char) symbolB;

                            for (int midDigitOne = 1; midDigitOne <= a; midDigitOne++) {
                                for (int midDigitTwo = 1; midDigitTwo <= b; midDigitTwo++) {
                                    System.out.printf("%c%c%d%d%c%c", charSymbolA, charSymbolB, midDigitOne, midDigitTwo, charSymbolB, charSymbolA);
                                }
                            }
                        }
                    }
                    counterSymbolA += 1;
                    counterSymbolB += 1;
                }
            }
        }


    }
}
