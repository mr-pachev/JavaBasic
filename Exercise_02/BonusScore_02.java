package Exercise_02;

import java.util.Scanner;

public class BonusScore_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        double bonusPoint = 0;

        if (number <= 100) {
            bonusPoint = 5;
        } else if (number > 1000) {
            bonusPoint = number * 0.1;
        } else {
            bonusPoint = number * 0.2;
        }
        if ((number % 2) == 0) {
            bonusPoint = bonusPoint + 1;
        } else if ((number % 10) == 5) {
            bonusPoint = bonusPoint + 2;
        }
        System.out.println(bonusPoint);
        System.out.println(bonusPoint + number);
    }
}
