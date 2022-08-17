package MoreExercises_06;

import java.util.Scanner;

public class Diamond_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftRight = (n - 1) / 2;

        for (int row = 0; row < n; row++) {

            for (int i = 0; i <= n; i++) { //цикъл да мине през всички индекси на реда

                if (i <= leftRight - 1 && row != (n / 2) + 1) {
                    System.out.print("-");
                } else if (i == leftRight) {
                    System.out.print("*");

                } else if (i == leftRight + 1 && row > 0 && leftRight >= 0) {
                    for (int j = 1; j <= row; j++) {
                        System.out.print("--");
                        i += 2;
                    }

                } else if (i > n - leftRight) {
                    System.out.print("-");

                } else if (i == (n - leftRight)) {
                    System.out.print("*");
                }

            }
            System.out.println();
            leftRight--;
        }

    }
}
