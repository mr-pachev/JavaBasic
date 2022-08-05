package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean noValid = false;

        while (arr.length > 1) {
            int[] condensed = new int[arr.length - 1];

            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = arr[i] + arr[i + 1];
            }
            arr = condensed;
            noValid = true;
        }
        if (noValid) {
            System.out.println(arr[0]);
        } else {
            System.out.println(arr[0]);
        }
    }
}

