package MoreExercises_06;

import java.util.Scanner;

public class House_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String star = "*";


        for (int i = 1; i <= (n + 1) / 2; i++) {
            for (int j = i; j <= n; j++) { // цикъл за принтиране на първия ред от покрива

                if (n % 2 != 0) { // праверка дали въведеното число n е четно или нечетно
                    // принтиране на първия ред от покрива
                    if ((n / 2) + 1 == j) {
                        System.out.print(star);
                    } else {
                        System.out.print("_");
                    }
                } else {
                    if ((n / 2) == j) {
                        System.out.print(star);
                        j++;
                    } else {
                        System.out.print("_");
                    }
                }
            }
            System.out.println();
            star += "**";

        }
    }
}
