package MoreExercises_07;

import java.util.Scanner;

public class LuckyNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int firstDigit = 1; firstDigit <= 9; firstDigit++) { //цикъла за първата цифра, която трябвя да е в интервал от 1-9 включително

            for (int secondDigit = 1; secondDigit <= 9; secondDigit++) { //цикъла за втората цифра, която трябвя да е в интервал от 1-9 включително
                if (n % (firstDigit + secondDigit) == 0) { //второ условие

                    for (int thirdDigit = 1; thirdDigit <= 9; thirdDigit++) { //цикъла за третата цифра, която трябвя да е в интервал от 1-9 включително

                        for (int fourthDigit = 1; fourthDigit <= 9; fourthDigit++) { //цикъла за четвъртата цифра, която трябвя да е в интервал от 1-9 включително
                            if (firstDigit + secondDigit == thirdDigit + fourthDigit) { //първо условие
                                System.out.print(firstDigit);
                                System.out.print(secondDigit);
                                System.out.print(thirdDigit);
                                System.out.print(fourthDigit);
                                System.out.print(" ");
                            }
                        }
                    }
                }
            }
        }
    }
}
