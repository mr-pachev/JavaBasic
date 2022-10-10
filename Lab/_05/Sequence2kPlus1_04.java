package Lab._05;

import java.util.Scanner;

public class Sequence2kPlus1_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int current = 1;

        while (current <= n){
            System.out.println(current);
            current = current * 2 + 1;

        }

    }
}
