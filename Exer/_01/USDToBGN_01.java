package Exer._01;

import java.util.Scanner;

public class USDToBGN_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        1 USD = 1.79549 BGN
        double USD = Double.parseDouble(scanner.nextLine());
        double USDtoLV = USD * 1.79549;

        System.out.println(USDtoLV);


    }
}
