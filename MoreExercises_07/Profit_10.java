package MoreExercises_07;

import java.util.Scanner;

public class Profit_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oneCoins = Integer.parseInt(scanner.nextLine());
        int twoCoins = Integer.parseInt(scanner.nextLine());
        int fiveCoins = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        for (int oneCoinsSum = 0; oneCoinsSum <= oneCoins; oneCoinsSum++) { //цикъл за монетите от 1 лев
            for (int twoCoinsSum = 0; twoCoinsSum <= twoCoins; twoCoinsSum++) { //цинъл за монетите то 2 лева
                for (int fiveCoinsSum = 0; fiveCoinsSum <= fiveCoins; fiveCoinsSum++) { //цикъл за монетите от 5 лева
                    if((oneCoinsSum*1) + (twoCoinsSum*2) + (fiveCoinsSum*5) == sum){ //условие за сумата от монетите
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", oneCoinsSum, twoCoinsSum, fiveCoinsSum, sum);
                    }

                }
            }
        }

    }
}
