package MoreExercises_06;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftRight = (n - 1) / 2;


        for (int row = 0; row < n; row++) {
            int mid = n - 2 * leftRight - 2;

            for (int i = 0; i < n; i++) { //цикъл да мине през всички индекси на реда

                if (i < leftRight) {
                    System.out.print("-");
                } else {
                    System.out.print("*");
                }

                if (i > leftRight) {
                    System.out.print("-");
                } else if (mid < 0) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }

            }
            System.out.println();
            leftRight--;
        }

    }
}

