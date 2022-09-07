package Exam_03;

import java.util.Scanner;

public class MovieProfit_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine(); //име ма филма
        int screeningDaya = Integer.parseInt(scanner.nextLine()); //дни на прожекция
        int ticketsNum = Integer.parseInt(scanner.nextLine()); //брой продадени билети;
        double ticketPrice = Double.parseDouble(scanner.nextLine()); //цена на един билет;
        int cinemaPercent = Integer.parseInt(scanner.nextLine()); //процент за киното от цялата печалба

        double allPrice = ticketsNum * ticketPrice;
        allPrice = allPrice * screeningDaya;
        allPrice = allPrice - (cinemaPercent * 1.0 / 100 * allPrice);

        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, allPrice);

    }
}
