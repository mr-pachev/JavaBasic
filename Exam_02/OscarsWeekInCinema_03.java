package Exam_02;

import java.util.Scanner;

public class OscarsWeekInCinema_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine(); //име на прожекцията
        String hallType = scanner.nextLine(); //тип зала
        int sumWatcher = Integer.parseInt(scanner.nextLine()); //брой зрители

        double allPrice = 0;

        if (movie.equals("A Star Is Born")){
            if (hallType.equals("normal")) {
                allPrice = sumWatcher * 7.50;
            } else if (hallType.equals("luxury")) {
                allPrice = sumWatcher * 10.50;
            } else if (hallType.equals("ultra luxury")) {
                allPrice = sumWatcher * 13.50;
            }
         }else if (movie.equals("Bohemian Rhapsody")){
            if (hallType.equals("normal")) {
                allPrice = sumWatcher * 7.35;
            } else if (hallType.equals("luxury")) {
                allPrice = sumWatcher * 9.45;
            } else if (hallType.equals("ultra luxury")) {
                allPrice = sumWatcher * 12.75;
            }
        }else if (movie.equals("Green Book")){
            if (hallType.equals("normal")) {
                allPrice = sumWatcher * 8.15;
            } else if (hallType.equals("luxury")) {
                allPrice = sumWatcher * 10.25;
            } else if (hallType.equals("ultra luxury")) {
                allPrice = sumWatcher * 13.25;
            }
        }else if (movie.equals("The Favourite")){
            if (hallType.equals("normal")) {
                allPrice = sumWatcher * 8.75;
            } else if (hallType.equals("luxury")) {
                allPrice = sumWatcher * 11.55;
            } else if (hallType.equals("ultra luxury")) {
                allPrice = sumWatcher * 13.95;
            }
        }
        System.out.printf("%s -> %.2f lv.", movie, allPrice);

    }
}
