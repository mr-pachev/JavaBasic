package Lab._04;

import java.util.Scanner;

public interface Numbers1_NWithStep3_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i += 3){
            System.out.println(i);
        }
    }
}