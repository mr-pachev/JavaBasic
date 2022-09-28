package Exam_07;

import java.util.Scanner;

public class AgencyProfit_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String airCompanyName = scanner.nextLine(); //име на авиокомпанията
        int sumAdultTickets = Integer.parseInt(scanner.nextLine()); //брой продадени билети за възрастни
        int sumChildrenTickets = Integer.parseInt(scanner.nextLine()); //продадени детски билети
        double priceAdultTicket = Double.parseDouble(scanner.nextLine()); //цена на билет за възрастни
        double priceService = Double.parseDouble(scanner.nextLine()); //цена обслужване

        double priceKidsTicket = priceAdultTicket - (70 * 1.0 / 100 * priceAdultTicket); //цена на детския билет
        double allPrice = 0;

        priceAdultTicket += priceService;
        priceKidsTicket += priceService;

        allPrice = (priceAdultTicket * sumAdultTickets) + (priceKidsTicket * sumChildrenTickets);

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", airCompanyName, 20 * 1.0 / 100 * allPrice);

    }
}
