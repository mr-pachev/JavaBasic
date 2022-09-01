package Exam_01;

import java.util.Scanner;

public class PCGameShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantityGamesSold = Integer.parseInt(scanner.nextLine()); //брой продадени игри
        int count = 1;
        double allPercent = 100; //всички продажби в проценти
        double hearhstonePercent = 0;
        double fornitePercent = 0;
        double overwatchPercent = 0;
        double othersPercent = 0;
        double percent = allPercent / quantityGamesSold; //броя продадени игри разделени по равно в проценти

        while (count <= quantityGamesSold){
            String gameName = scanner.nextLine();

            switch (gameName){
                case "Hearthstone":
                    hearhstonePercent += percent;
                    break;
                case "Fornite":
                    fornitePercent += percent;
                    break;
                case "Overwatch":
                    overwatchPercent += percent;
                    break;
            }
            count++;
        }
        System.out.printf("Hearthstone - %.2f%%%n", hearhstonePercent);
        System.out.printf("Fornite - %.2f%%%n", fornitePercent);
        System.out.printf("Overwatch - %.2f%%%n", overwatchPercent);
        System.out.printf("Others - %.2f%%%n", othersPercent = allPercent - hearhstonePercent - fornitePercent - overwatchPercent);
    }
}
