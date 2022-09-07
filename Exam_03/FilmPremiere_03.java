package Exam_03;

import java.util.Scanner;

public class FilmPremiere_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine(); //име на филма
        String moviesPacked = scanner.nextLine(); //пакет за филма
        int ticketsSold = Integer.parseInt(scanner.nextLine()); //продадени билети

        double allPrice = 0; //крайна цена
        double diff = 0; //отстъпка

        if(movieName.equals("John Wick")){
            if(moviesPacked.equals("Drink")) {
                allPrice = ticketsSold * 12;
            }else if(moviesPacked.equals("Popcorn")){
                allPrice = ticketsSold * 15;
            }else if(moviesPacked.equals("Menu")){
                allPrice = ticketsSold * 19;
            }

        }else if(movieName.equals("Star Wars")){
            if(moviesPacked.equals("Drink")) {
                allPrice = ticketsSold * 18;
            }else if(moviesPacked.equals("Popcorn")){
                allPrice = ticketsSold * 25;
            }else if(moviesPacked.equals("Menu")){
                allPrice = ticketsSold * 30;
            }

            if(ticketsSold >= 4){ //проверка за намаление
                diff = 30 * 1.0 / 100 * allPrice;
                allPrice = allPrice - diff;
            }

        }else if(movieName.equals("Jumanji")){
            if(moviesPacked.equals("Drink")) {
                allPrice = ticketsSold * 9;
            }else if(moviesPacked.equals("Popcorn")){
                allPrice = ticketsSold * 11;
            }else if(moviesPacked.equals("Menu")){
                allPrice = ticketsSold * 14;
            }

            if(ticketsSold == 2){ //проверка за намаление
                diff = 15 * 1.0 / 100 * allPrice;
                allPrice = allPrice - diff;
            }
        }

        System.out.printf("Your bill is %.2f leva.", allPrice);
    }
}
