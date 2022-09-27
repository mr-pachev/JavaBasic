package Exam_06;

import java.util.Scanner;

public class EasterDecoration_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumCustomer = Integer.parseInt(scanner.nextLine()); //брой клиенти
        int currentCounter = 0;
        int totalCounter = 0;
        double currentPrice = 0;
        double allPrice = 0;

        for (int current = 1; current <= sumCustomer; current++){
            String input = scanner.nextLine();
            currentCounter = 0;
            currentPrice = 0;

            while (!input.equals("Finish")){
                currentCounter++;
                totalCounter++;

                if (input.equals("basket")){
                    currentPrice += 1.50;
                }else if (input.equals("wreath")){
                    currentPrice += 3.80;
                }else if (input.equals("chocolate bunny")){
                    currentPrice += 7;
                }
                input = scanner.nextLine();
            }
            if (currentCounter % 2 == 0){
                currentPrice -= (20 * 1.0 / 100 * currentPrice);
            }
            allPrice += currentPrice;
            System.out.printf("You purchased %d items for %.2f leva.%n", currentCounter, currentPrice);
        }
        System.out.printf("Average bill per client is: %.2f leva.", allPrice / sumCustomer);
    }
}
