package Exer._01;

import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesForHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int readHours = pages / pagesForHour;
        int daysRead = readHours / days;

        System.out.println(daysRead);

    }
}
