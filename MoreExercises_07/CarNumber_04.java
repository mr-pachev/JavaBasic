package MoreExercises_07;

import java.util.Scanner;

public class CarNumber_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startDigit = Integer.parseInt(scanner.nextLine());
        int endDigit = Integer.parseInt(scanner.nextLine());

        for (int firstDigit = startDigit; firstDigit <= endDigit; firstDigit++) {
            for (int secondDigit = startDigit; secondDigit <= endDigit; secondDigit++) {
                for (int thirdDigit = startDigit; thirdDigit <= endDigit; thirdDigit++) {
                    if ((secondDigit + thirdDigit) % 2 == 0) { //условие за втората и третата цифра

                        for (int fourthDigit = startDigit; fourthDigit <= endDigit; fourthDigit++) {
                            if (firstDigit % 2 == 0) { //услови за първата цифра
                                if (fourthDigit % 2 != 0) { //условие за последната цифра
                                    if (firstDigit > fourthDigit) { //условие за първата цифра
                                        System.out.print(firstDigit);
                                        System.out.print(secondDigit);
                                        System.out.print(thirdDigit);
                                        System.out.print(fourthDigit);
                                        System.out.print(" ");
                                    }
                                }
                            } else {
                                if (fourthDigit % 2 == 0) {
                                    if (firstDigit > fourthDigit) {
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

    }
}
