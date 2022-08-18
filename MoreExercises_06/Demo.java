package MoreExercises_06;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftRight = (n - 1) / 2; //тирета от едната страна на реда

        if (n % 2 == 0) { //проверка дали n е четно

            for (int row = 1; row <= n - 1; row++) { //цикъл минава през всеки ред от диаманта
                for (int index = 1; index <= n; index++) { //цикъл да мине през всички индекси на конкретния дадения ред

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
                for (int index = 1; index <= n; index++) { //цикъл за преминаване през всички индекси на конкретния ред

                    if (index <= leftRight) { //принтера първата част на реда с тиретата включително и звездичката
                        System.out.print("-");
                    } else if (index == leftRight + 1) { //проверка за принтиране на една звездичка на първия ред при нечетно n
                        System.out.print("*");

                    } else if (index == leftRight + 2 && row > 1 && leftRight >= 0 && row != n) { //индексите между тиретата leftRight на текущи ред
                        if (row > n / 2 && row == (n / 2) + 1) {
                            for (int j = 1; j <= n - row; j++) { //цикъл за средние ред на диаманта

                                if (row > 2 && j > 1) { //проверка дали повтарящите се тирета в средата на реда са повече от един индекс
                                    if(j % 2 != 0) {
                                        System.out.print("--");
                                        index++;
                                    } else {
                                        System.out.print("--");
                                        index += 2;
                                    }
                                } else {
                                    System.out.print("-");
                                }
                            }
                        } else {
                            if (row <= (n / 2) + 1) { //проверка дали текущия ред стига до средния ред включително на диаманта
                                for (int j = 1; j <= row - 1; j++) { //цикъл за средата на текущия ред след средния ред на диаманта

                                    if (row > 2 && j > 1) { //проверка дали повтарящите се тирета в средата на реда са повече от един индекс
                                        if (j % 2 != 0) {
                                            System.out.print("--");
                                            index++;
                                        } else {
                                            System.out.print("--");
                                            index ++;
                                        }
                                    } else {
                                        System.out.print("-");
                                        if (row > (n / 2) + 1) {
                                            index++;
                                        }
                                    }
                                }
                            }else if(row >= (n / 2) + 1){ //проверка дали текущи ред е подминал средния ред включитебно на диаманта
                                for (int j = 1; j <= n - row; j++) { //цикъл за средата на текущия ред след средния ред на диаманта

                                    if (row > 2 && j > 1) { //проверка дали повтарящите се тирета в средата на реда са повече от един индекс
                                        if (j % 2 != 0) {
                                            System.out.print("--");
                                            index++;
                                        } else {
                                            System.out.print("--");
                                            index ++;
                                        }
                                    } else {
                                        System.out.print("-");

                                    }
                                }
                            }
                        }
                    } else if (index > n - leftRight) {
                        System.out.print("-");

                    } else if (index == (n - leftRight)) {
                        System.out.print("*");
                    }
                }
                System.out.println();
                if (row <= n / 2) {
                    leftRight--;
                } else {
                    leftRight++;
                }
            }
        }
    }
}

