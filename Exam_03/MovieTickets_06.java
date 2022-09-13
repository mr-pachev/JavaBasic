package Exam_03;

import java.util.Scanner;

public class MovieTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int indexSymbolOne = a1; indexSymbolOne <= a2 - 1; indexSymbolOne++) {
            char symbolOne = (char) indexSymbolOne;

            for (int indexSymbolTwo = 1; indexSymbolTwo <= n - 1; indexSymbolTwo++) {
               int symbolTwo = indexSymbolTwo;

                for (int indexSymbolTree = 1; indexSymbolTree <= n / 2 -1; indexSymbolTree++) {
                    int symbolTree = indexSymbolTree;

                    int symbolFour = (int) symbolOne;

                    if (symbolFour % 2 != 0 && (symbolTwo + symbolTree + symbolFour) % 2 != 0){

                        System.out.printf("%c-%d%d%d%n", symbolOne, symbolTwo, symbolTree, symbolFour);
                    }
                }
            }
        }



    }
}
