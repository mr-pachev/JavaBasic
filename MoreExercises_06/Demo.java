package MoreExercises_06;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftRight = (n - 1) / 2; //тирета от едната страна на реда

        if (n % 2 == 0) { //проверка дали n е четно

            for (int row = 1; row <= n - 1; row++) { //цикъл минава през всеки ред от диаманта
                for (int i = 1; i <= n; i++) { //цикъл да мине през всички индекси на конкретния дадения ред

                    if (i <= leftRight) {
                        System.out.print("-");
                    } else if (i == leftRight + 1) {
                        System.out.print("*");

                    } else if (i == leftRight + 2 && row > 1 && leftRight >= 0 && row != n - 1) {
                        if (row > n / 2) {
                            for (int j = 1; j <= n - (row + 1); j++) {
                                System.out.print("--");
                                if (j % 2 == 0) {
                                    i += 2;
                                } else {
                                    i++;
                                }
                            }
                        } else {
                            for (int j = 1; j <= row - 1; j++) {
                                System.out.print("--");
                                if (j % 2 == 0) {
                                    i += 2;
                                } else {
                                    i++;
                                }
                            }
                        }
                    } else if (i > n - leftRight) {
                        System.out.print("-");

                    } else if (i == (n - leftRight)) {
                        System.out.print("*");
                    }

                }
                System.out.println();
                if (row <= (n / 2) - 1) {
                    leftRight--;
                } else {
                    leftRight++;
                }

            }
        } else { //за нечетно n
            for (int row = 1; row <= n; row++) { //цикъл минава през всеки ред от диаманта
                for (int i = 1; i <= n; i++) { //цикъл да мине през всички индекси на конкретния дадения ред

                    if (i <= leftRight) {
                        System.out.print("-");
                    } else if (i == leftRight + 1) {
                        System.out.print("*");

                    } else if (i == leftRight + 2 && row > 1 && leftRight >= 0 && row != n - 1) {
                        if (row > n / 2) {
                            for (int j = 1; j <= n - (row + 1); j++) {

                                if (row > 1) {
                                    System.out.print("--");
                                    i++;
                                } else {
                                    i++;
                                }
                            }
                        } else {
                            for (int j = 1; j <= row - 1; j++) {
                                System.out.print("--");
                                if (j % 2 == 0) {
                                    i += 2;
                                } else {
                                    i++;
                                }
                            }
                        }
                    } else if (i > n - leftRight) {
                        System.out.print("-");

                    } else if (i == (n - leftRight)) {
                        System.out.print("*");
                    }

                }
                System.out.println();
                if (row <= (n / 2) + 1) {
                    leftRight--;
                } else {
                    leftRight++;
                }

            }
        }




    }
}

