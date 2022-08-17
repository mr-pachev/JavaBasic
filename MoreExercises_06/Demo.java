package MoreExercises_06;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftRight = (n - 1) / 2; //тирета от едната страна на реда

        for (int row = 1; row <= n - 1; row++) { //цикъл минава през всеки ред от диаманта
            for (int index = 1; index <= n; index++) { //цикъл да мине през всички индекси на конкретния дадения ред

                if (n % 2 == 0) { //проверка дали въведеното число е четно

                    if (index <= leftRight) {
                        System.out.print("-");
                    } else if (index == leftRight + 1) {
                        System.out.print("*");

                    } else if (index == leftRight + 2 && row > 1 && leftRight >= 0 && row != n - 1) {
                        if (row > n / 2) {
                            for (int j = 1; j <= n - (row + 1); j++) {
                                System.out.print("--");
                                if (j % 2 == 0) {
                                    index += 2;
                                } else {
                                    index++;
                                }
                            }
                        } else {
                            for (int j = 1; j <= row - 1; j++) {
                                System.out.print("--");
                                if (j % 2 == 0) {
                                    index += 2;
                                } else {
                                    index++;
                                }
                            }
                        }
                    } else if (index > n - leftRight) {
                        System.out.print("-");

                    } else if (index == (n - leftRight)) {
                        System.out.print("*");
                    }

                } else {
                // за нечетно число
                }
            }

            System.out.println();
            if (row <= (n / 2) - 1) {
                leftRight--;
            } else {
                leftRight++;
            }
        }

    }
}

