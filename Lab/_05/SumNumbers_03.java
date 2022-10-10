package Lab._05;

import java.util.Scanner;

public class SumNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int current = 0;
        while (current < num){
            int input = Integer.parseInt(scanner.nextLine());
            current = current + input;
        }
        System.out.println(current);
    }
}
