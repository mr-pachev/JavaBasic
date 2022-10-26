package Exersise_04;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumGroup = Integer.parseInt(scanner.nextLine());

        double g1 = 0;
        double g2 = 0;
        double g3 = 0;
        double g4 = 0;
        double g5 = 0;
        double allCountGroup = 0;

        for (int i = 1; i <= sumGroup; i++) {
            double countPeopleGroup = Integer.parseInt(scanner.nextLine());
            allCountGroup = allCountGroup + countPeopleGroup;

            if (countPeopleGroup <= 5) {
                g1 = g1 + countPeopleGroup;

            } else if (countPeopleGroup <= 12) {
                g2 = g2 + countPeopleGroup;

            } else if (countPeopleGroup <= 25) {
                g3 = g3 + countPeopleGroup;

            } else if (countPeopleGroup <= 40) {
                g4 = g4 + countPeopleGroup;

            } else if (countPeopleGroup >= 41) {
                g5 = g5 + countPeopleGroup;

            }
        }
        System.out.printf("%.2f%%%n", g1 = g1 / allCountGroup * 100);
        System.out.printf("%.2f%%%n", g2 = g2 / allCountGroup * 100);
        System.out.printf("%.2f%%%n", g3 = g3 / allCountGroup * 100);
        System.out.printf("%.2f%%%n", g4 = g4 / allCountGroup * 100);
        System.out.printf("%.2f%%%n", g5 = g5 / allCountGroup * 100);

    }
}
