package Lab._03;

import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double commission = Double.parseDouble(scanner.nextLine());

        double discount = 0;
        boolean isValid = true;

        switch (city) {
            case "Sofia":
                if (commission >= 0 && commission <= 500) {
                    discount = commission * 0.05;
                } else if (commission > 500 && commission <= 1000) {
                    discount = commission * 0.07;
                } else if (commission > 1000 && commission <= 10000) {
                    discount = commission * 0.08;
                } else if (commission > 10000) {
                    discount = commission * 0.12;
                } else {
                    isValid = false;
                }
                break;
            case "Varna":
                if (commission >= 0 && commission <= 500) {
                    discount = commission * 0.045;
                } else if (commission > 500 && commission <= 1000) {
                    discount = commission * 0.075;
                } else if (commission > 1000 && commission <= 10000) {
                    discount = commission * 0.1;
                } else if (commission > 10000) {
                    discount = commission * 0.13;
                } else {
                    isValid = false;
                }
                break;
            case "Plovdiv":
                if (commission >= 0 && commission <= 500) {
                    discount = commission * 0.055;
                } else if (commission > 500 && commission <= 1000) {
                    discount = commission * 0.08;
                } else if (commission > 1000 && commission <= 10000) {
                    discount = commission * 0.12;
                } else if (commission > 10000) {
                    discount = commission * 0.145;
                } else {
                    isValid = false;
                }
                break;
            default:
                isValid = false;
                break;
        }
        if (isValid) {
            System.out.printf("%.2f", discount);
        } else if (!isValid) {
            System.out.println("error");
        }
    }
}
