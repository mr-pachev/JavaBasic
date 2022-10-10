package Exercise_01;

import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int penPack = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int preparationLiters = Integer.parseInt(scanner.nextLine());
        int rateDiscount = Integer.parseInt(scanner.nextLine());

//        •	Пакет химикали - 5.80 лв.
//        •	Пакет маркери - 7.20 лв.
//        •	Препарат - 1.20 лв (за литър)

        double penPackCount = penPack * 1.0 * 5.80;
        double markersCount = markers * 1.0 * 7.20;
        double preparationLitersCount = preparationLiters * 1.0 * 1.20;
        double allCount = penPackCount + markersCount + preparationLitersCount;
        double allPrice = allCount - (allCount * rateDiscount/100);

        System.out.println(allPrice);

    }
}
