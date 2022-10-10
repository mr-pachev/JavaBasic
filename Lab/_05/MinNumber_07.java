package Lab._05;

import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();
        int minNum = Integer.MAX_VALUE;

        while (!num.equals("Stop")) {
            int input = Integer.parseInt(num);
            if (minNum > input) {
                minNum = input;
            }
            num = scanner.nextLine();
        }
        System.out.println(minNum);
    }
}
