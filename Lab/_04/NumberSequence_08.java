package Lab._04;

import java.util.Scanner;

public class NumberSequence_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxNumb = Integer.MIN_VALUE;
        int minNumb = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++){
            int num = Integer.parseInt(scanner.nextLine());
            if (num > maxNumb){
                maxNumb = num;
            }
            if (num < minNumb){
                minNumb = num;
            }
        }
        System.out.printf("Max number: %d%nMin number: %d", maxNumb, minNumb);
    }
}
