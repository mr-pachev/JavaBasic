package MoreExercises_06;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n; i++) {
            if (i <= (n-1) / 2 || i > (n-1) / 2 && i != ((n-1) / 2) + 1){
                System.out.print("-");
            }else{
                System.out.print("*");
            }
        }

            System.out.println();

    }
}

