package Lab._04;

import java.util.Scanner;

public class SumNumbers_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + Integer.parseInt(scanner.nextLine());
        }
        System.out.println(sum);
    }
}
