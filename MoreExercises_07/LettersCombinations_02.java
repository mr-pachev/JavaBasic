package MoreExercises_07;

import java.util.Scanner;

public class LettersCombinations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String letterOne = scanner.nextLine(); //начало но интервала
        String letterTwo = scanner.nextLine(); //край на интервала
        String letterTree = scanner.nextLine(); //пропускане на тази буква

        char firstLetter = letterOne.charAt(0);
        char secondLetter = letterTwo.charAt(0);
        char thirdLetter = letterTree.charAt(0);

        int counter = 0;

        for (int i = firstLetter; i <= secondLetter; i++) { //цикъл за първата буква
            char currentSymbolOne = (char) i;
            if (currentSymbolOne != thirdLetter) { //проверка дали текущия символ не съвпада с буквата за пропускане

                for (int j = firstLetter; j <= secondLetter; j++) { //цикъл за втората буква
                    char currentSymbolTwo = (char) j;
                    if (currentSymbolTwo != thirdLetter) { //проверка дали текущия символ не съвпада с буквата за пропускане

                        for (int k = firstLetter; k <= secondLetter; k++) { //цикъл за третата буква
                            char currentSymbolTree = (char) k;

                            if (currentSymbolTree != thirdLetter) { //проверка дали текущия символ не съвпада с буквата за пропускане
                                counter++;
                                System.out.printf("%c%c%c ", currentSymbolOne, currentSymbolTwo, currentSymbolTree);
                            }
                        }
                    }
                }
            }
        }
        System.out.print(counter);
    }
}
