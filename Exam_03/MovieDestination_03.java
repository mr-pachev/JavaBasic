package Exam_03;

import java.util.Scanner;

public class MovieDestination_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scanner.nextLine()); //бюджет за филма
        String destination = scanner.nextLine(); //дестинация
        String season = scanner.nextLine(); //сезон
        int screenDays = Integer.parseInt(scanner.nextLine()); //брой снимачни дни

        double allPrice = 0;

        if(destination.equals("Dubai")){
            if(season.equals("Summer")){
                allPrice = screenDays * 40000;
            }else if(season.equals("Winter")){
                allPrice = screenDays * 45000;
            }

            allPrice = allPrice - (30 * 1.0 / 100 * allPrice);
        }else if(destination.equals("Sofia")){
            if(season.equals("Summer")){
                allPrice = screenDays * 12500;
            }else if(season.equals("Winter")){
                allPrice = screenDays * 17000;
            }

            allPrice = allPrice + (25 * 1.0 / 100 * allPrice);
        }else if(destination.equals("London")){
            if(season.equals("Summer")){
                allPrice = screenDays * 20250;
            }else if(season.equals("Winter")){
                allPrice = screenDays * 24000;
            }
        }

        if(allPrice <= movieBudget){
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", movieBudget - allPrice);
        }else {
            System.out.printf("The director needs %.2f leva more!", allPrice - movieBudget);
        }

    }
}
