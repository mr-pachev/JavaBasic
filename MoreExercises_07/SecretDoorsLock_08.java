package MoreExercises_07;

import java.util.Scanner;

public class SecretDoorsLock_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int thirdDigit = Integer.parseInt(scanner.nextLine());
        int secondDigit = Integer.parseInt(scanner.nextLine());
        int firstDigit = Integer.parseInt(scanner.nextLine());

        for (int hundredshundreds = 1; hundredshundreds <= thirdDigit; hundredshundreds++) { //цикъл за стотиците
            if (hundredshundreds % 2 == 0) { //филтър само за четните стотици

                for (int dozens = 1; dozens <= secondDigit; dozens++) { //цикъл за десетиците
                    if (dozens / 2 == 1 || dozens % 3 == 0 || dozens % 5 == 0 || dozens % 7 == 0) { //филтър за десетицит

                        for (int units = 1; units <= firstDigit; units++) { //цикъл за едениците
                            if (units % 2 == 0) { //филтър за едениците

                                System.out.printf("%d%d%d%n", hundredshundreds, dozens, units);
                            }

                        }

                    }
                }
            }
        }

    }
}
