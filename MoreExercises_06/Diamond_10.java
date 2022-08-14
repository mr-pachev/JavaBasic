package MoreExercises_06;

import java.util.Scanner;

public class Diamond_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= (n / 2) + 1; i++) { //върти полавината ред на диаманта включително средния

            // лява част на реда
            for (int j = i; j <= (n / 2) + 1; j++) { //върти местоположението но * в дадения половин ред
                if (j < (n / 2) + 1) {
                    System.out.print("-");
                } else {
                    System.out.print("*");
                }
            }
            if (i > 1) { //допълва до края на полу реда с тирета след *
                for (int k = ((n / 2) - i); k < (n / 2) - 1; k++) {
                    System.out.print("-");
                }
            }

            System.out.println();
        }

    }
}
