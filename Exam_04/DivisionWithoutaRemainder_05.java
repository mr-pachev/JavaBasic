package Exam_04;

import java.util.Scanner;

public class DivisionWithoutaRemainder_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p1Counter = 0;
        int p2Counter = 0;
        int p3Counter = 0;

        for (int num = 1; num <= n; num++) {
            int currentNum = Integer.parseInt(scanner.nextLine()); //текущо число

            if (currentNum % 2 == 0){
                p1Counter++;
            }
            if (currentNum % 3 == 0){
                p2Counter++;
            }
            if (currentNum % 4 == 0){
                p3Counter++;
            }
        }
        double percentP1 = p1Counter * 1.0 * 100 / n;
        double percentP2 = p2Counter * 1.0 * 100 / n;
        double percentP3 = p3Counter * 1.0 * 100 / n;

        System.out.printf("%.2f%%%n", percentP1);
        System.out.printf("%.2f%%%n", percentP2);
        System.out.printf("%.2f%%%n", percentP3);
    }
}
