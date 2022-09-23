package Exam_06;

import java.util.Scanner;

public class EasterTrip_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine(); //дестинация
        String range = scanner.nextLine(); //диапазон за почивка
        int sumOvernightStay = Integer.parseInt(scanner.nextLine()); //брой нощувки
        double allPriceOvernight = 0;

        if (destination.equals("France")){
            if (range.equals("21-23")){
                allPriceOvernight = sumOvernightStay * 30;
            }else if (range.equals("24-27")){
                allPriceOvernight = sumOvernightStay * 35;
            }else if (range.equals("28-31")){
                allPriceOvernight = sumOvernightStay * 40;
            }
        }else if (destination.equals("Italy")){
            if (range.equals("21-23")){
                allPriceOvernight = sumOvernightStay * 28;
            }else if (range.equals("24-27")){
                allPriceOvernight = sumOvernightStay * 32;
            }else if (range.equals("28-31")){
                allPriceOvernight = sumOvernightStay * 39;
            }
        }else if (destination.equals("Germany")){
            if (range.equals("21-23")){
                allPriceOvernight = sumOvernightStay * 32;
            }else if (range.equals("24-27")){
                allPriceOvernight = sumOvernightStay * 37;
            }else if (range.equals("28-31")){
                allPriceOvernight = sumOvernightStay * 43;
            }
        }

        System.out.printf("Easter trip to %s : %.2f leva.", destination, allPriceOvernight);
    }
}
