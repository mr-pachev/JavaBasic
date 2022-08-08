package Lab;

import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        double priceWhitoutDiscount = area * 7.61;
        double discount = priceWhitoutDiscount * 18 / 100;
        double finalPrice = priceWhitoutDiscount - discount;
        System.out.printf("The final price is: %.2f lv.%n" +
                "The discount is: %.2f lv.", finalPrice, discount);


    }
}
