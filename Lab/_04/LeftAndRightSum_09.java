package Lab._04;

import java.util.Scanner;

public class LeftAndRightSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;

        for (int i = 1; i <= n; i++) {
            int count = Integer.parseInt(scanner.nextLine());
            leftSum = leftSum + count;
        }
        int rightSum = 0;
        for (int i = 1; i <= n; i++) {
            int count = Integer.parseInt(scanner.nextLine());
            rightSum = rightSum + count;
        }
        if (leftSum == rightSum){
            System.out.printf("Yes, sum = %d", leftSum);
        }else {
            System.out.printf("No, diff = %d", Math.abs(rightSum - leftSum));
        }
    }
}
