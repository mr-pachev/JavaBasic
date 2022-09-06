package Exam_02;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine(); //име на филма
        int counterStudentTickers = 0; //брояч студентски билети
        int counterStandardTickets = 0; //брояч стандартни билети
        int counterKidTickets = 0; //брояч детски билети
        int counterAllTickets = 0; //брояч на всички билети

        while (!movieName.equals("Finish")) {
            int freeSpaceSalon = Integer.parseInt(scanner.nextLine()); //свободни места в салона
            int seatsCounter = 0; //заети места

            String ticketType = scanner.nextLine(); //тип на закупения билет

            while (!ticketType.equals("End")) {
                counterAllTickets++;
                seatsCounter++;

                if (ticketType.equals("student")) {
                    counterStudentTickers++;
                } else if (ticketType.equals("standard")) {
                    counterStandardTickets++;
                } else if (ticketType.equals("kid")) {
                    counterKidTickets++;
                }

                if (freeSpaceSalon > seatsCounter) { //проверка дали има свободниместа в салона
                    ticketType = scanner.nextLine();
                } else {
                    break;
                }

            }

            System.out.printf("%s - %.2f%% full.%n", movieName, seatsCounter * 1.0 * 100 / freeSpaceSalon);

            movieName = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", counterAllTickets);
        System.out.printf("%.2f%% student tickets.%n", counterStudentTickers * 1.0 * 100 / counterAllTickets);
        System.out.printf("%.2f%% standard tickets.%n", counterStandardTickets * 1.0 * 100 / counterAllTickets);
        System.out.printf("%.2f%% kids tickets.%n", counterKidTickets * 1.0 * 100 / counterAllTickets);
    }
}
