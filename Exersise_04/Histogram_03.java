package Exersise_04;

import java.util.Scanner;

public class Histogram_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (currentNum < 200) {
                p1 = p1 + 1;
            } else if (currentNum <= 399) {
                p2 = p2 + 1;
            } else if (currentNum <= 599) {
                p3 = p3 + 1;
            } else if (currentNum <= 799) {
                p4 = p4 + 1;
            } else {
                p5 = p5 + 1;
            }
        }
        System.out.printf("%.2f%%%n", (p1 * 1.0/n * 100));
        System.out.printf("%.2f%%%n", p2 * 1.0/n * 100);
        System.out.printf("%.2f%%%n", p3 * 1.0/n * 100);
        System.out.printf("%.2f%%%n", p4 * 1.0/n * 100);
        System.out.printf("%.2f%%%n", p5 * 1.0/n * 100);
    }
}
