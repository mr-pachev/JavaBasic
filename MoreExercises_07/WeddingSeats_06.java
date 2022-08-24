package MoreExercises_07;

import java.util.Scanner;

public class WeddingSeats_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char sector = scanner.nextLine().charAt(0);
        int sectorsDigit = (int) sector; //брой на секторите

        int sumRow = Integer.parseInt(scanner.nextLine()); //брой на редовете
        int sumSeatsOddRow = Integer.parseInt(scanner.nextLine()); //брой на местата на нечетните редове

        int nextRow = 0;
        int counteAllSeats = 0;

        for (int countSectors = 65; countSectors <= sectorsDigit; countSectors++) { //брояч на секторите
            for (int countRows = 1; countRows <= sumRow + nextRow; countRows++) { //брояч на редовете
                if (countRows % 2 != 0) { //за нечетните
                    for (int numSeat = 97; numSeat < 97 + sumSeatsOddRow; numSeat++) { //брояч на местата на нечетните редове
                        sector = (char) countSectors;
                        char curentSeat = (char) numSeat;
                        System.out.printf("%c%d%c", sector, countRows, curentSeat);
                        System.out.println();
                        counteAllSeats++;
                    }
                } else { //за четните
                    for (int numSeat = 97; numSeat < (97 + sumSeatsOddRow) + 2; numSeat++) { //брояч на местата на четните редове
                        sector = (char) countSectors;
                        char curentSeat = (char) numSeat;
                        System.out.printf("%c%d%c", sector, countRows, curentSeat);
                        System.out.println();
                        counteAllSeats++;
                    }
                }
            }
            nextRow += 1; //добавя по един допълнителен ред след първия
        }
        System.out.println(counteAllSeats);
    }
}
