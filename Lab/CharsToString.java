package Lab;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbolA = scanner.nextLine().charAt(0);
        char symbolB = scanner.nextLine().charAt(0);
        char symbolC = scanner.nextLine().charAt(0);

        System.out.printf("%c%c%c", symbolA, symbolB, symbolC);
    }
}
