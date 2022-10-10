package Lab._05;

import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String money = scanner.nextLine();
        double count = 0;
        boolean isValid = true;

        while (!money.equals("NoMoreMoney")) {
            double input = Double.parseDouble(money);
            if (input > 0) {
                System.out.printf("Increase: %.2f%n", input);
                count = count + input;
                money = scanner.nextLine();
            } else {
                isValid = false;
                break;
            }
        }
        if (!isValid) {
            System.out.println("Invalid operation!");
        }

        System.out.printf("Total: %.2f", count);
    }
}
