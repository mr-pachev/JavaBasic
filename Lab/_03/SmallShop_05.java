package Lab._03;

import java.util.Scanner;

public class SmallShop_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double priceProduct = 0;

        if (city.equals("Sofia")){
            if (product.equals("coffee")) {
                priceProduct = quantity * 0.5;
            } else if (product.equals("water")) {
                priceProduct = quantity * 0.8;
            } else if (product.equals("beer")) {
                priceProduct = quantity * 1.20;
            } else if (product.equals("sweets")) {
                priceProduct = quantity * 1.45;
            } else if (product.equals("peanuts")) {
                priceProduct = quantity * 1.60;
            }
        } else if (city.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                priceProduct = quantity * 0.40;
            } else if (product.equals("water")) {
                priceProduct = quantity * 0.70;
            } else if (product.equals("beer")) {
                priceProduct = quantity * 1.15;
            } else if (product.equals("sweets")) {
                priceProduct = quantity * 1.30;
            } else if (product.equals("peanuts")) {
                priceProduct = quantity * 1.50;
            }
        } else if (city.equals("Varna")) {
            if (product.equals("coffee")) {
                priceProduct = quantity * 0.45;
            } else if (product.equals("water")) {
                priceProduct = quantity * 0.70;
            } else if (product.equals("beer")) {
                priceProduct = quantity * 1.10;
            } else if (product.equals("sweets")) {
                priceProduct = quantity * 1.35;
            } else if (product.equals("peanuts")) {
                priceProduct = quantity * 1.55;
            }
        }
        System.out.println(priceProduct);

    }
}
