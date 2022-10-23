package Exersise_03;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cinemaType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double capacity = rows * columns;


        switch (cinemaType) {
            case "Premiere":
                capacity = capacity * 12.00;
                break;
            case "Normal":
                capacity = capacity * 7.50;
                break;
            case "Discount":
                capacity = capacity * 5.00;
                break;
        }
        System.out.printf("%.2f leva", capacity);

    }
}
