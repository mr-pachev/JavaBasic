package Exam_02;

import java.util.Scanner;

public class OscarsCeremony_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hallRent = Integer.parseInt(scanner.nextLine()); //наем на залата
        double statuetteDiff = 30 * 1.0 / 100 * hallRent;
        double statueteSum = hallRent - statuetteDiff; //цена на една статуетка

        double cateringDiff = 15 * 1.0 / 100 * statueteSum;
        double catering = statueteSum - cateringDiff; //цена на кетъринга

        double voiced = catering / 2; //цена на озвучението

        double allSum = hallRent + statueteSum + catering + voiced;

        System.out.printf("%.2f", allSum);
    }
}
