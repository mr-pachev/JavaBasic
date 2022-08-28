package MoreExercises_07;

import java.util.Scanner;

public class SecretDoorsLock_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int thirdDigit = Integer.parseInt(scanner.nextLine());
        int secondDigit = Integer.parseInt(scanner.nextLine());
        int firstDigit = Integer.parseInt(scanner.nextLine());

        for (int hundreds = 1; hundreds <= thirdDigit; hundreds++) { //цикъл за стотиците
            if (hundreds % 2 == 0) { //филтър само за четните стотици

                for (int dozens = 1; dozens <= secondDigit; dozens++) { //цикъл за десетиците
                    if (dozens == 2 || dozens == 3 || dozens == 5 || dozens == 7) { //филтър за десетиците - да е просто число

                        for (int units = 1; units <= firstDigit; units++) { //цикъл за едениците
                            if (units % 2 == 0) { //филтър за едениците

                                System.out.printf("%d %d %d%n", hundreds, dozens, units);
                            }
                        }
                    }
                }
            }
        }

    }
}
