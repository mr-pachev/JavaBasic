package Exam_05;

import java.util.Scanner;

public class WorldSnookerChampionship_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stageOfTheMatch = scanner.nextLine(); //етап на мача
        String ticketType = scanner.nextLine(); //тип билет
        int sumTickets = Integer.parseInt(scanner.nextLine()); //брой закупени билети
        String photo = scanner.nextLine(); //снимка с трофея

        double allPrice = 0;

        if (stageOfTheMatch.equals("Quarter final")){
            if (ticketType.equals("Standard")){
                allPrice = sumTickets * 55.50;
            }else if (ticketType.equals("Premium")){
                allPrice = sumTickets * 105.20;
            }else if (ticketType.equals("VIP")){
                allPrice = sumTickets * 118.90;
            }
        }else if (stageOfTheMatch.equals("Semi final")){
            if (ticketType.equals("Standard")){
                allPrice = sumTickets * 75.88;
            }else if (ticketType.equals("Premium")){
                allPrice = sumTickets * 125.22;
            }else if (ticketType.equals("VIP")){
                allPrice = sumTickets * 300.40;
            }
        }else if (stageOfTheMatch.equals("Final")){
            if (ticketType.equals("Standard")){
                allPrice = sumTickets * 110.10;
            }else if (ticketType.equals("Premium")){
                allPrice = sumTickets * 160.66;
            }else if (ticketType.equals("VIP")){
                allPrice = sumTickets * 400;
            }
        }

        if (allPrice > 2500 && allPrice <= 4000){
            allPrice -= 10 * 1.0 / 100 * allPrice;
            if (photo.equals("Y")) {
                allPrice += sumTickets * 40;
            }
        }else if (allPrice > 4000){
            allPrice -= 25 * 1.0 / 100 * allPrice;
        }else {
            if (photo.equals("Y")) {
                allPrice += sumTickets * 40;
            }
        }

        System.out.printf("%.2f", allPrice);

    }
}
