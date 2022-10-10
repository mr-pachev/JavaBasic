package Exercise_02;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBear = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());

//        •	Пъзел - 2.60 лв.
//        •	Говореща кукла - 3 лв.
//        •	Плюшено мече - 4.10 лв.
//        •	Миньон - 8.20 лв.
//        •	Камионче - 2 лв.

        double puzzlesCount = puzzles * 2.60;
        double dollsCount = dolls * 3;
        double teddyBearCount = teddyBear * 4.10;
        double minionCount = minion * 8.20;
        double truckCount = truck * 2;

        int toysCount = puzzles + dolls + teddyBear + minion + truck;
        double allToysCount = puzzlesCount + dollsCount + teddyBearCount + minionCount + truckCount;

        if (toysCount >= 50) {
            allToysCount = allToysCount - (allToysCount * 0.25);
        }
        allToysCount = allToysCount - (allToysCount * 0.1);
        double clearSum = Math.abs(allToysCount - tripPrice);

        if (allToysCount >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", clearSum);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", clearSum);
        }

    }
}
