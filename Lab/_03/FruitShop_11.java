package Lab._03;

import java.util.Scanner;

public class FruitShop_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double fruitPrice = 0;
        boolean isValid = true;

        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (product.equals("banana")) {
                    fruitPrice = 2.50;
                } else if (product.equals("apple")) {
                    fruitPrice = 1.20;
                } else if (product.equals("orange")) {
                    fruitPrice = 0.85;
                } else if (product.equals("grapefruit")) {
                    fruitPrice = 1.45;
                } else if (product.equals("kiwi")) {
                    fruitPrice = 2.70;
                } else if (product.equals("pineapple")) {
                    fruitPrice = 5.50;
                } else if (product.equals("grapes")) {
                    fruitPrice = 3.85;
                }else {
                    isValid = false;
                }
                break;
            case "Saturday":
            case "Sunday":
                if (product.equals("banana")) {
                    fruitPrice = 2.70;
                } else if (product.equals("apple")) {
                    fruitPrice = 1.25;
                } else if (product.equals("orange")) {
                    fruitPrice = 0.90;
                } else if (product.equals("grapefruit")) {
                    fruitPrice = 1.60;
                } else if (product.equals("kiwi")) {
                    fruitPrice = 3.00;
                } else if (product.equals("pineapple")) {
                    fruitPrice = 5.60;
                } else if (product.equals("grapes")) {
                    fruitPrice = 4.20;
                }else {
                    isValid = false;
                }
                break;
            default:
                isValid = false;
                break;
        }
        if (isValid) {
            System.out.printf("%.2f", fruitPrice * quantity);
        }else if (!isValid){
            System.out.println("error");
        }
    }
}
