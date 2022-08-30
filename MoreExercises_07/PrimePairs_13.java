package MoreExercises_07;

import java.util.Scanner;

public class PrimePairs_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());

        int endFirstCouple = a + c;
        int endSecondCouple = b + d;

        for (int firstCouple = a; firstCouple <= endFirstCouple; firstCouple++) {
            for (int secondCouple = b; secondCouple <= endSecondCouple; secondCouple++) {

                int dividerFirstCouple = 2;
                int maxDividerFirstCouple = (int) Math.sqrt(firstCouple);
                boolean primeFirstCouple = true;
                while (primeFirstCouple && (dividerFirstCouple <= maxDividerFirstCouple)) {
                    if (firstCouple % dividerFirstCouple == 0) {
                        primeFirstCouple = false;
                    }
                    dividerFirstCouple++;
                }

                int dividerSecondCouple = 2;
                int maxDividerSecondCouple = (int) Math.sqrt(secondCouple);
                boolean primeSecondCouple = true;
                while (primeSecondCouple && (dividerSecondCouple <= maxDividerSecondCouple)) {
                    if (secondCouple % dividerSecondCouple == 0) {
                        primeSecondCouple = false;
                    }
                    dividerSecondCouple++;
                }

                if (primeFirstCouple && primeSecondCouple){
                    System.out.printf("%d%d%n", firstCouple, secondCouple);
                }

            }



        }



    }
}
