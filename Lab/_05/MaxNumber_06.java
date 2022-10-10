package Lab._05;

import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();
        int maxNum = Integer.MIN_VALUE;

        while (!num.equals("Stop")) {
            int current = Integer.parseInt(num);
            if (maxNum < current) {
                maxNum = current;
            }
            num = scanner.nextLine();
        }
        System.out.println(maxNum);
    }
}
