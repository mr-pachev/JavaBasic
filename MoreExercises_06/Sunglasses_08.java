package MoreExercises_06;

import java.util.Scanner;

public class Sunglasses_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n >= 3 && n <= 100) {
            // първи ред
            for (int i = 1; i <= 2 * n; i++) {
                System.out.print("*");

            }
            for (int i = 1; i <= n; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 2 * n; i++) {
                System.out.print("*");
            }
            System.out.println();

            // втори ред
            for (int i = 0; i < n - 2; i++) { //принтира средните редове
                System.out.print("*");

                for (int j = 1; j <= 2 * n - 2; j++) {
                    System.out.print("/");
                }
                System.out.print("*");

                if (i == (n - 1)/2 - 1){
                    for (int k = 1; k <= n; k++) {
                        System.out.print("|");
                    }
                } else {
                    for (int k = 1; k <= n; k++) {
                        System.out.print(" ");
                    }
                }
                System.out.print("*");
                for (int l = 1; l <= 2 * n - 2; l++) {
                    System.out.print("/");
                }
                System.out.print("*");
                System.out.println();
            }

            // последен ред
            for (int m = 0; m < 2 * n; m++) {
                System.out.print("*");
            }
            for (int v = 0; v < n; v++) {
                System.out.print(" ");
            }
            for (int p = 0; p < 2 * n; p++) {
                System.out.print("*");
            }
        }
    }
}
